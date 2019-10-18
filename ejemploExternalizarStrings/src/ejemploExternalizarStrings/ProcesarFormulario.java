package ejemploExternalizarStrings;

public class ProcesarFormulario {

	public boolean validarNombreUsuario(String nombre) {
		String errorNombre = Messages.getString("ProcesarFormulario.0"); //$NON-NLS-1$
		return true;
	}
	
	public boolean validarApellidos(String apellidos) {
		String errorApellidos = Messages.getString("ProcesarFormulario.1"); //$NON-NLS-1$
		return true;
	}
	
}
