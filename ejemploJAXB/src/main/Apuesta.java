package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Apuesta {

	private int id;
	private int idUsuario;
	private double cantidad;
	private String nombreJuego;

	public Apuesta() {
		// TODO Auto-generated constructor stub
	}

	public Apuesta(int id, int idUsuario, double cantidad, String nombreJuego) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.cantidad = cantidad;
		this.nombreJuego = nombreJuego;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	@XmlElement
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@XmlElement
	public String getNombreJuego() {
		return nombreJuego;
	}

	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}

	@Override
	public String toString() {
		return "Apuesta [id=" + id + ", idUsuario=" + idUsuario + ", cantidad=" + cantidad + ", nombreJuego="
				+ nombreJuego + "]";
	}

}
