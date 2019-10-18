package modelo;

public class Categoria {

	private String nombre;
	private String descripcion;
	private long id;
	
	public Categoria() {
	}

	public Categoria(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Categoria(String nombre, String descripcion, long id) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + ", id=" + id + "]";
	}
	
}
