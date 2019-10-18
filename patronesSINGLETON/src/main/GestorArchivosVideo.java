package main;

public class GestorArchivosVideo {
	//inicio singleton
	private static final GestorArchivosVideo INSTANCIA = 
			new GestorArchivosVideo();
	private GestorArchivosVideo() {
		//este constructor debe ser privado
	}
	public static GestorArchivosVideo obtenerInstancia(){
		return INSTANCIA;
	}
	//fin singleton
	//resto de codigo de la clase
}
