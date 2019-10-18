package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.GestorIncidencias;
import beans.GestorUsuarios;


public class Principal {

	public static void main(String[] args) {
		//para crear un contenedor de spring con lo 
		//puesto en el applicationContext.xml
		ApplicationContext contenedor = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		
		GestorIncidencias gi = 
				contenedor.getBean(GestorIncidencias.class);
		gi.crearIncidencia(55);
		 
	}

}
