/**
 * ServidorServicioApuestas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public interface ServidorServicioApuestas extends java.rmi.Remote {
    public servicios.Apuesta[] obtenerApuestas() throws java.rmi.RemoteException;
    public int resolverApuestas() throws java.rmi.RemoteException;
    public boolean registrarApuesta(servicios.Apuesta arg0) throws java.rmi.RemoteException;
}
