package modelo;

public class ConstantesSQL {
	
	public final static String SQL_INSERCION_USUARIO = 
			"insert into tabla_usuarios(nombre,email,pass) values(?,?,?)";
	public final static String SQL_OBTENER_ID_USUARIO = 
			"select id from tabla_usuarios where "
			+ " email = ? and pass = ? ";
	
	
}
