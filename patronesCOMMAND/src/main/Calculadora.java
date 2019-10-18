package main;

public class Calculadora {
	
	int valorActual;
	
	public void operar(char operador,int operando) {
		switch (operador) {
		case '+':
			valorActual += operando;
			break;
		case '-':
			valorActual -= operando;
			break;
		case '*':
			valorActual *= operando;
			break;
		case '/':
			valorActual /= operando;
			break;
		default:
			System.out.println("operacion no valida");
			break;
		}//end switch
		System.out.println("valor actual:" + valorActual);
	}
	
}
