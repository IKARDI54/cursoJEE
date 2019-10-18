package servicios;

public class ServidorServicioApuestasProxy implements servicios.ServidorServicioApuestas {
  private String _endpoint = null;
  private servicios.ServidorServicioApuestas servidorServicioApuestas = null;
  
  public ServidorServicioApuestasProxy() {
    _initServidorServicioApuestasProxy();
  }
  
  public ServidorServicioApuestasProxy(String endpoint) {
    _endpoint = endpoint;
    _initServidorServicioApuestasProxy();
  }
  
  private void _initServidorServicioApuestasProxy() {
    try {
      servidorServicioApuestas = (new servicios.ServicioApuestasServiceLocator()).getServicioApuestasPort();
      if (servidorServicioApuestas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servidorServicioApuestas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servidorServicioApuestas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servidorServicioApuestas != null)
      ((javax.xml.rpc.Stub)servidorServicioApuestas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicios.ServidorServicioApuestas getServidorServicioApuestas() {
    if (servidorServicioApuestas == null)
      _initServidorServicioApuestasProxy();
    return servidorServicioApuestas;
  }
  
  public servicios.Apuesta[] obtenerApuestas() throws java.rmi.RemoteException{
    if (servidorServicioApuestas == null)
      _initServidorServicioApuestasProxy();
    return servidorServicioApuestas.obtenerApuestas();
  }
  
  public int resolverApuestas() throws java.rmi.RemoteException{
    if (servidorServicioApuestas == null)
      _initServidorServicioApuestasProxy();
    return servidorServicioApuestas.resolverApuestas();
  }
  
  public boolean registrarApuesta(servicios.Apuesta arg0) throws java.rmi.RemoteException{
    if (servidorServicioApuestas == null)
      _initServidorServicioApuestasProxy();
    return servidorServicioApuestas.registrarApuesta(arg0);
  }
  
  
}