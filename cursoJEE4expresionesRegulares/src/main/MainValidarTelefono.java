package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainValidarTelefono {
	public static void main(String[] args) {
		
		String telefono = "612345678";
		String expresionRegularTelefono = "[0-9]{3,20}";
		
		Pattern p = Pattern.compile(expresionRegularTelefono);
		Matcher m = p.matcher(telefono);
		boolean resValidarTelefono = m.matches();
		
		System.out.println("resultado validar telefono: " + 
				resValidarTelefono);
		
	}
}
