package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.GestorArchivos;

public class Principal {

	public static void main(String[] args) {
		//para crear un contenedor de spring con lo 
		//puesto en el applicationContext.xml
		ApplicationContext contenedor = 
				new ClassPathXmlApplicationContext(
						"applicationContext.xml");
		
		//el valor de la ruta raiz ha sido especificada 
		//en el xml, eso es lo que se llama asignar una 
		//propiedad a una bean 
		
		GestorArchivos ga = 
				contenedor.getBean(GestorArchivos.class);
		ga.borrarArchivo("imagen.jpg");
		
	}

}
