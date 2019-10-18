package main;

public abstract class Component {
	
	protected String nombre;

	public Component(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract void add(Component c);
	public abstract void mostrar();
	
}
