package facade;

import subsistemas.CuentaCorriente;
import subsistemas.HistorialCliente;
import subsistemas.SistemaDeCreditos;

public class GestorHipotecas {

	public boolean concederHipoteca(
			double cantidad, int idCliente) {
		CuentaCorriente cc = new CuentaCorriente();
		SistemaDeCreditos sc = new SistemaDeCreditos();
		HistorialCliente hc = new HistorialCliente();
		
		if( cc.comprobarSuficienteSaldo(idCliente) && 
			sc.comprobarHistorial(idCliente) && 
			hc.comprobarHistorial(idCliente)) {
			return true;
		}else {
			return false;
		}		
	}//end conceder hipoteca
	
}
