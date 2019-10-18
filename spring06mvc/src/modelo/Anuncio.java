package modelo;

public class Anuncio {
	
	private String titulo;
	private String email;
	private String descripcion;
	private int id;
	
	public Anuncio() {
		// TODO Auto-generated constructor stub
	}

	public Anuncio(String titulo, String email, String descripcion) {
		super();
		this.titulo = titulo;
		this.email = email;
		this.descripcion = descripcion;
	}

	public Anuncio(String titulo, String email, String descripcion, int id) {
		super();
		this.titulo = titulo;
		this.email = email;
		this.descripcion = descripcion;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Anuncio [titulo=" + titulo + ", email=" + email + ", descripcion=" + descripcion + ", id=" + id + "]";
	}

}
