package services;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import modulo.Equipo;
import modulo.Jugador;

public class EquiposService {

	private OpenConnection openConn;

	public EquiposService() {
		openConn = new OpenConnection();
	}

	public List<Equipo> consultarEquipos() throws EquipoServiceException {

		try (Connection conn = openConn.getNewConnection(); Statement stmt = conn.createStatement()) {

			String sql = "SELECT * FROM EQUIPO";
			ResultSet rs = stmt.executeQuery(sql);

			List<Equipo> equipos = new ArrayList<Equipo>();
			while (rs.next()) {
				// guardo los datos que getEquipoFromResultSet ha cojido del rs
				Equipo e = getEquipoFromResultSet(rs);
				equipos.add(e);
			}
			return equipos;

		} catch (SQLException e) {
			throw new EquipoServiceException();

		}
	}

	public Equipo getEquipoFromResultSet(ResultSet rs) throws SQLException {
		Equipo e = new Equipo();
		e.setCodigo(rs.getString("CODIGO"));
		e.setNombreEq(rs.getString("NOMBRE"));

		return e;
	}

	public List<Jugador> consultarJugadoresEquipo(String codigo) throws SQLException {

		try (Connection conn = openConn.getNewConnection(); Statement stmt = conn.createStatement()) {

			String sql = "SELECT * FROM JUGADOR WHERE CODIGO_EQUIPO = '" + codigo + "'";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);

			List<Jugador> jugadores = new ArrayList<>();
			while (rs.next()) {
				// guardo los datos que getEquipoFromResultSet ha cojido del rs
				Jugador a = getJugadorFromResultSet(rs);
				jugadores.add(a);
			}

			return jugadores;
		}
	}

	public Jugador getJugadorFromResultSet(ResultSet rs) throws SQLException {
		Jugador a = new Jugador();
		a.setNombreJug(rs.getString("NOMBRE"));
		a.setNum(rs.getInt("NUMERO"));
		a.setCodigoEq(rs.getString("CODIGO_EQUIPO"));
		a.setFecha_nacimiento(rs.getDate("NACIMIENTO").toLocalDate());

		return a;
	}

	public Equipo consultarEquipoCompleto(String codigo) throws EquipoServiceException, NotFoundException {

		String sql = "SELECT * FROM EQUIPO WHERE CODIGO_EQUIPO = ?";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, codigo);
			ResultSet rs = stmt.executeQuery();

			List<Jugador> jugadores = consultarJugadoresEquipo(codigo);

			if (rs.next()) {
				Equipo e = getEquipoFromResultSet(rs);
				e.setJugadores(jugadores);

				return e;
			} else {
				throw new NotFoundException();
			}

		} catch (SQLException e) {
			throw new EquipoServiceException();

		}
	}

	public void insertarJugador(Connection conn, Jugador j) {

		String sql = "INSERT INTO JUGADOR VALUES (?, ?, ?, ?)";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setInt(1, j.getNum());
			stmt.setString(2, j.getCodigoEq());
			stmt.setString(3, j.getNombreJug());
			stmt.setDate(4, Date.valueOf(j.getFecha_nacimiento()));

			stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void crearEquipo(Equipo e) throws EquipoServiceException {
		String sql = "INSERT INTO EQUIPO VALUES (?, ?)";

		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e.getNombreEq());

				stmt.executeUpdate();

				// insertar jugadores con el metodo anterior
				List<Jugador> jugadores = e.getJugadores();
				for (Jugador jugador : jugadores) {
					insertarJugador(conn, jugador);
				}

				conn.commit();

			} catch (SQLException y) {
				conn.rollback();
				throw new EquipoServiceException();
			}
		} catch (SQLException y) {
			y.printStackTrace();
		}
	}

	public void borrarEquipoCompleto(String codigo) throws EquipoServiceException, NotFoundException, SQLException {
		String sql = "DELETE FROM EQUIPO WHERE CODIGO_EQUIPO = ?";

		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);

			try {
				// primero borro los jugadores que forman el equipo
				borrarJugadores(conn, codigo);

				stmt.setString(1, codigo);
				// veo si se ha borrado algo de la tabla equipo para saber si existia
				Boolean existe = stmt.execute();

				conn.commit();

				// si no existia el quipo haría rollback y saltaria la excepcion
				if (existe == false) {
					conn.rollback();
					throw new NotFoundException();
				}
			} catch (SQLException e) {
				conn.rollback();
				throw new EquipoServiceException();
			}
		}
	}

	public void borrarJugadores(Connection conn, String codigo) throws SQLException {
		String sql = "DELETE FROM JUGADOR WHERE CODIGO_EQUIPO = ?";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, codigo);

			stmt.executeUpdate();
		}
	}

	public void añadirJugadorAEquipo(Equipo e, Jugador j) throws EquipoServiceException {

		try (Connection conn = openConn.getNewConnection()) {
			
			List<Jugador> jugadores = consultarJugadoresEquipo(e.getCodigo());

			int num = 0;
			for (Jugador jugador : jugadores) {
				if (jugador.getNum() > num) {
					num = jugador.getNum();
				}
			}
			j.setNum(num++);
			insertarJugador(conn, j);

		} catch (SQLException s) {
			throw new EquipoServiceException();
		}
	}
	
	public void exportarJugadores(String codigoEq, String ruta) throws NotFoundException, EquipoServiceException {
		try (Connection conn = openConn.getNewConnection()) {
			//consulto si existe el equipo
			List<Equipo> equipos = consultarEquipos();
			Boolean existe = false;
				for(Equipo equipo : equipos) {
					if(equipo.getCodigo().equals(codigoEq)) {
						existe = true;
					}
				}
				if (existe == false) {
					throw new NotFoundException();
				}
			//consulto los jugadores con ese codigo de Eq	
			List<Jugador> jugadores = consultarJugadoresEquipo(codigoEq);
			//creo el fichero
			try {
		        FileWriter escritura = new FileWriter(ruta);

		        for(Jugador jugador : jugadores) {
		        	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		            escritura.write(jugador.getNum()+" - "+jugador.getNombreJug()+" - "+jugador.getFecha_nacimiento().format(formato));

		        }

		        escritura.close();

		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		} catch (Exception e) {
			throw new EquipoServiceException();
		}
	}
}
