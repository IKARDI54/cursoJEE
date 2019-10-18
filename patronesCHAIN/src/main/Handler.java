package main;

public abstract class Handler {

	protected Handler sucesor;

	public void setSucesor(Handler sucesor) {
		this.sucesor = sucesor;
	}
	
	public abstract void procesarPeticion(Compra c);
}
