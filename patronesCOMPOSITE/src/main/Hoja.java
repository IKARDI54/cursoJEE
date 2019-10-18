package main;

public class Hoja extends Component{

	public Hoja(String nombre) {
		super(nombre);
	}

	@Override
	public void add(Component c) {
		System.out.println("una hoja/leaf no puede tener elementos");
	}

	@Override
	public void mostrar() {
		System.out.println("nombre: " + nombre);
	}

}
