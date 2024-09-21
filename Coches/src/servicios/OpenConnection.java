package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OpenConnection {
	
	public Connection getNewConnection() throws SQLException {
		String usuario = "ejercicios";
		String password = "ejercicios";
		
		String url ="jdbc:oracle:thin:@//localhost/xe";
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driverClass);
		}catch (ClassNotFoundException e) {
			System.err.println("No se encuentra el driver JDBC.Revisa su configuración");
			throw new RuntimeException(e);
		}
		
		Connection conn = DriverManager.getConnection(url, usuario, password);
		return conn;
	}

}