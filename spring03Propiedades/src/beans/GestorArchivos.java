package beans;

public class GestorArchivos {

	private String rutaRaiz;
	
	public void borrarArchivo(String archivo) {
		System.out.println("actuando sobre: " + rutaRaiz);
		System.out.println("se va a borrar: " + archivo);
	}

	public String getRutaRaiz() {
		return rutaRaiz;
	}

	public void setRutaRaiz(String rutaRaiz) {
		this.rutaRaiz = rutaRaiz;
	}
	
}
