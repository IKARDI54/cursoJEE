package servicios;

public class Ordenador {
	private String comprador;
	private double cantidad;
	private String producto;

	public Ordenador() {
		// TODO Auto-generated constructor stub
	}

	public Ordenador(String comprador, double cantidad, String producto) {
		super();
		this.comprador = comprador;
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Ordenador [comprador=" + comprador + ", cantidad=" + cantidad + ", producto=" + producto + "]";
	}

}
