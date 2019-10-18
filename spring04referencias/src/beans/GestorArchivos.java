package beans;

public class GestorArchivos {

	//para poder usar un gestor de imagenes desde este 
	//gestor de archivos, se hace asi:
	private GestorImagenes gImagenes;
	private String rutaRaiz;
	
	public void borrarArchivo(String archivo) {
		System.out.println("actuando sobre: " + rutaRaiz);
		System.out.println("se va a borrar: " + archivo);
		System.out.println("borrando imagenes del archivo");
		gImagenes.borrarImagenesDeArchivo(archivo);
	}

	public String getRutaRaiz() {
		return rutaRaiz;
	}

	public void setRutaRaiz(String rutaRaiz) {
		this.rutaRaiz = rutaRaiz;
	}

	public GestorImagenes getgImagenes() {
		return gImagenes;
	}

	public void setgImagenes(GestorImagenes gImagenes) {
		this.gImagenes = gImagenes;
	}
	
}
