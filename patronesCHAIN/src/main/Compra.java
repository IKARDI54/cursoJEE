package main;

public class Compra {

	private String proposito;
	private double cantidad;

	public Compra(String proposito, double cantidad) {
		super();
		this.proposito = proposito;
		this.cantidad = cantidad;
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

}
