package main;

public class Main {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.ejecuta('+', 5);
		invoker.ejecuta('*', 2);
		invoker.deshacer();
		
	}

}
