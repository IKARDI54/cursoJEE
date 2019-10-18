package main;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//con lo siguiente decimos que la anotacion Servicio se 
//use en tiempo de ejecucion
@Retention(RetentionPolicy.RUNTIME)
public @interface Servicio {
	//una anotacion no puede contener metodos con codigo
//	public void arrancar() {
//		
//	}
}
