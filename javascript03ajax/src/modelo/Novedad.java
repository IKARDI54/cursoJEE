package modelo;

public class Novedad {

	private String titulo;
	private String texto;
	private int id;

	public Novedad() {
		// TODO Auto-generated constructor stub
	}

	public Novedad(String titulo, String texto, int id) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Novedad [titulo=" + titulo + ", texto=" + texto + ", id=" + id + "]";
	}

}
