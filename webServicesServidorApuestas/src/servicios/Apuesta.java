package servicios;

public class Apuesta {

	private String nombre;
	private double cantidad;
	private int numero;
	private boolean ganado;
	
	public Apuesta() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isGanado() {
		return ganado;
	}

	public void setGanado(boolean ganado) {
		this.ganado = ganado;
	}

	@Override
	public String toString() {
		return "Apuesta [nombre=" + nombre + ", cantidad=" + cantidad + ", numero=" + numero + ", ganado=" + ganado
				+ "]";
	}
	
}
