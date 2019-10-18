package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//clase padre de todos los DAO
//la cual contiene operaciones tipicas de uso 
//con bases de datos
public class MasterDAO {
	//al declarar los siguientes elementos como private
	//conseguiremos que ninguna otra clase 
	//tengo que preocuparse por la url usuario y pass
	private String url = "jdbc:mysql://localhost:3306/bd_appweb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String usuario = "root";
	private String pass = "root";
	//protected es que el elemento en cuestion se puede usar 
	//desde la clase actual y las que hereden de ella
	protected Connection conexion;
	
	public MasterDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("no encuentro la clase de mysql");
		}
	}//end constructor
	
	protected void conectar() {
		try {
			conexion = 
					DriverManager.getConnection(url,usuario,pass);
		} catch (SQLException e) {
			System.out.println("no pude conectarme");
			e.printStackTrace();
		}
	}//end conectar

	protected void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {
			System.out.println("no pude desconectar");
			e.printStackTrace();
		}
	}//end desconectar
	
}//end class
