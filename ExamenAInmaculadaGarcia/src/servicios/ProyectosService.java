package servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Proyecto;

public class ProyectosService {

	private OpenConnection openConn;

	public ProyectosService() {
		openConn = new OpenConnection();
	}

	public List<Proyecto> buscarProyectos(LocalDate inicio, LocalDate fin)
			throws ProyectoErrorException, ProyectoNotFoundException {

		String sql = "SELECT * FROM PROYECTOS WHERE INICIO >= ? AND ENTREGA <= ?";

		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setDate(1, Date.valueOf(inicio));
			stmt.setDate(2, Date.valueOf(fin));

			ResultSet rs = stmt.executeQuery();

			List<Proyecto> proyectos = new ArrayList<>();
			
			while (rs.next()) {
				Proyecto p = new Proyecto(rs.getString("COD_PROYECTO"), rs.getString("DES_PROYECTO"));
				p.setCosteActual(rs.getBigDecimal("COSTE"));
				p.setFechaEntrega(fin);
				p.setFechaInicio(inicio);
				p.setPresupuesto(rs.getBigDecimal("PRESUPUESTO"));

				proyectos.add(p);
			}
			if (proyectos.isEmpty()) {
				throw new ProyectoNotFoundException("No hay proyectos para estas fechas");
			}

			return proyectos;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ProyectoErrorException("Error consultando proyectos");
		}
	}
}
