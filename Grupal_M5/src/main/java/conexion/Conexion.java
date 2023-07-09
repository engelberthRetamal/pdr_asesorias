package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection conn = null;
	
	private Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/prevencion_riesgos", "root", "root");
			
			if (conn != null) {
				System.out.println("Conexion establecida");
			} else {
				System.out.println("Fallo de conexion");
			}
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConn() {
		if (conn == null) {
			new Conexion();
		}
		return conn;
	}
}
