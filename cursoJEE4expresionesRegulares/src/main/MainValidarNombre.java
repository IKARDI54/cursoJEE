package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainValidarNombre {
	public static void main(String[] args) {
		
		String nombre = "Ana Nu�ez";
		String expresionRegularNombre = "[a-z A-Z��������������]{3,20}";
		
		Pattern p = Pattern.compile(expresionRegularNombre);
		Matcher m = p.matcher(nombre);
		boolean resValidarNombre = m.matches();
		
		System.out.println("resultado validar nombre: " + 
				resValidarNombre);
		
	}
}
