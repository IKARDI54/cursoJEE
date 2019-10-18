package modelo;

public class ConstantesSQL {
	
	public final static String SQL_INSERCION_USUARIO = 
			"insert into tabla_usuarios(nombre,email,pass) values(?,?,?)";
	public final static String SQL_OBTENER_ID_USUARIO = 
			"select id from tabla_usuarios where "
			+ " email = ? and pass = ? ";
	public static final String SQL_OBTENER_USUARIOS = 
			"select * from tabla_usuarios order by id desc";
	public static final String SQL_INSERCION_PRODUCTO = 
			"insert into tabla_productos(nombre,precio,descripcion,id_categoria) values(?,?,?,?)";
	public static final String SQL_OBTENER_PRODUCTOS = 
			"select " + 
			"tp.nombre as nombre_producto," + 
			"tp.precio as precio_producto," + 
			"tp.descripcion as descripcion_producto,"+
			"tp.id as id_producto," + 
			"tc.nombre as nombre_categoria " + 
			"from " + 
			"tabla_productos as tp," + 
			"tabla_categorias as tc " + 
			"where " + 
			"tp.id_categoria =" + 
			"tc.id";
	public static final String SQL_BORRAR_USUARIO = 
			"delete from tabla_usuarios where id = ? ";
	public static final String SQL_OBTENER_USUARIO_POR_ID = 
			"select * from tabla_usuarios where id = ? ;";
	public static final String SQL_ACTUALIZAR_USUARIO = 
			"update tabla_usuarios set nombre = ? , "
			+ " email = ? , pass = ? where id = ? ";
	public static final String SQL_OBTENER_CATEGORIAS = 
			"select * from tabla_categorias order by id desc";
	public static final String SQL_OBTENER_PRODUCTO_POR_ID = 
			"select * from tabla_productos where id = ? ";
	public static final String SQL_OBTENER_USUARIOS_POR_NOMBRE = 
			"SELECT * FROM tabla_usuarios where "
			+ "nombre like ? ;";
	public static final String SQL_OBTENER_USUARIOS_INDICANDO_COMIENZO_Y_CUANTOS = 
			"SELECT * FROM tabla_usuarios where nombre like ? order by id asc limit ? , ? ;";
	public static final String SQL_OBTENER_TOTAL_USUARIOS = 
			"SELECT COUNT(id) as total FROM tabla_usuarios where nombre like ? ;";
	
	
}
