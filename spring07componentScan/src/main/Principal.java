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
		
		GestorUsuarios gu = 
				contenedor.getBean(GestorUsuarios.class);
		gu.borrarUsuario(66);
		
		//vamos a comprobar que la bean creada automaticamente
		//por spring tiene como id el nombre de la clase
		//empezando por minuscula
		 GestorUsuarios gu2 = 
				 contenedor.getBean("gestorUsuarios", 
						 GestorUsuarios.class);
		 gu2.borrarUsuario(67);
		 
		 
	}

}
