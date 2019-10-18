package main;

public class Main {

	public static void main(String[] args) {
		saludar("hola","que tal","muy buenas");
		
	}
	
	private static void saludar(String... saludos) {
		for (String string : saludos) {
			System.out.println(string);
		}
	}

}
