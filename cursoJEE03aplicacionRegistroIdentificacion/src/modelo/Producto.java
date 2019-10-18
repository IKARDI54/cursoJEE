package modelo;

public class Producto {

	private String nombre;
	private double precio;
	private String descripcion;
	private int id;

	private long idCategoria;// para registros, ediciones y otras operaciones
	private Categoria categoria; // en principio no se debe pedir en el constructor, solo se usa cuando quiera
									// listar productos con datos de su categoria, como por ejemplo el nombre de la
									// categoria

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(String nombre, double precio, String descripcion, long idCategoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.idCategoria = idCategoria;
	}

	public Producto(String nombre, double precio, String descripcion, int id, long idCategoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.id = id;
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
