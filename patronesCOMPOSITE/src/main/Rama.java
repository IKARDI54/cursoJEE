package main;

import java.util.ArrayList;
import java.util.List;

public class Rama extends Component{
	
	List<Component> hijos = 
			new ArrayList<Component>();
	
	public Rama(String nombre) {
		super(nombre);
	}

	@Override
	public void add(Component c) {
		hijos.add(c);
	}

	@Override
	public void mostrar() {
		System.out.println("nombre: " + nombre);
		for (Component hijo : hijos) {
			hijo.mostrar();
		}
	}

}
