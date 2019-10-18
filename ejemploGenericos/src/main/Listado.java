package main;

//T mayuscula sera lo que digamos cuando 
//usemos esta clase
public class Listado<T> {

	private T t;
	private String nombre;
	
	public Listado(T t, String nombre) {
		super();
		this.t = t;
		this.nombre = nombre;
	}

	public void mostrarDatosDeLaClase() {
		System.out.println("nombre es de tipo: " +
				nombre.getClass().getName());
		System.out.println("t es de tipo: " + 
				t.getClass().getName());
	}
	
}
