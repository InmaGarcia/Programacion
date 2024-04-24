package servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Persona;

public class PersonasService {
	
	private OpenConnection openConn;

	public PersonasService() {
		super();
		this.openConn = new OpenConnection();
	}
	
	public Persona consultarPersona(String dni) throws SQLException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn= openConn.getNewConnection();//abrir la conexion
			
			stmt = conn.createStatement();//preparar la consulta
			
			String sql ="SELECT * FROM PERSONAS WHERE DNI = '"+ dni+ "'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);//ejecutar la consulta
			
			if(rs.next()) {//si tienes datos transformamos esos datos en un objeto 
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				
				return p;
				//return getPersonaFromResultSet(rs);
			}else {//si la consulta no tiene datos
				return null;
			}
			
		}finally { //vamos a usar el finally para cerrar todo lo q tenemos
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	
	public List<Persona> buscarPersonas(String filtro) throws SQLException {
		 
		 try (Connection conn= openConn.getNewConnection();
				 Statement stmt = conn.createStatement()) {
			 
			String sql ="SELECT * FROM PERSONAS WHERE APELLIDOS LIKE '%"+ filtro+ "%' or NOMBRE LIKE '%"+ filtro+ "%'";
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);//ejecutar la consulta
			
			List<Persona> resultados = new ArrayList<>();
			while(rs.next()) {//si tienes datos transformamos esos datos en un objeto 
				Persona p = getPersonaFromResultSet(rs);
				
				resultados.add(p);		
			}
			System.out.println("long de lista: " + resultados.size());
			return resultados;
		 }
	}
	//Ejercicio 2
	private Persona getPersonaFromResultSet(ResultSet rs) throws SQLException {
		Persona p = new Persona();
		p.setNombre(rs.getString("NOMBRE"));
		p.setDni(rs.getString("DNI"));
		p.setApellidos(rs.getString("APELLIDOS"));
		p.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
		return p;
	}
	//Ejercicio 3
	public void insertarPersona(Persona p) throws SQLException {
		
		String sql = "INSER INTO PERSONAS VALUES (?, ?, ?, ?)";
		
		 try (	Connection conn= openConn.getNewConnection();
				 PreparedStatement stmt = conn.prepareStatement(sql)) {
			 
			stmt.setString(1,  p.getDni());
			stmt.setString(2,  p.getNombre());
			stmt.setString(3,  p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFechaNacimiento()));

			System.out.println(sql);
			stmt.execute();
		 }
	}

}
