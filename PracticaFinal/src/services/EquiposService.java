package services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
			System.out.println(sql);
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

	private Equipo getEquipoFromResultSet(ResultSet rs) throws SQLException {
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

	private Jugador getJugadorFromResultSet(ResultSet rs) throws SQLException {
		Jugador a = new Jugador();
		a.setNombreJug(rs.getString("NOMBRE"));
		a.setNum(rs.getInt("NUMERO"));
		a.setCodigoEq(rs.getString("CODIGO_EQUIPO"));
		a.setFecha_nacimiento(rs.getDate("NACIMIENTO").toLocalDate());

		return a;
	}

	private Equipo consultarEquipoCompleto(String codigo) throws EquipoServiceException, NotFoundException {

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

	private void insertarJugador(Connection conn, Jugador j) {

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

	private void crearEquipo(Equipo e) throws EquipoServiceException {
		String sql = "INSERT INTO EQUIPO VALUES (?, ?)";

		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);
			try {
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e.getNombreEq());
				
				stmt.executeUpdate();
				
				//insertar jugadores con el metodo anterior
				List<Jugador> jugadores = e.getJugadores();
				for(Jugador jugador : jugadores) {
					insertarJugador(conn,jugador);
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

}
