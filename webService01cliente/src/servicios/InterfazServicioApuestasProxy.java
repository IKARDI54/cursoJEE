package servicios;

public class InterfazServicioApuestasProxy implements servicios.InterfazServicioApuestas {
  private String _endpoint = null;
  private servicios.InterfazServicioApuestas interfazServicioApuestas = null;
  
  public InterfazServicioApuestasProxy() {
    _initInterfazServicioApuestasProxy();
  }
  
  public InterfazServicioApuestasProxy(String endpoint) {
    _endpoint = endpoint;
    _initInterfazServicioApuestasProxy();
  }
  
  private void _initInterfazServicioApuestasProxy() {
    try {
      interfazServicioApuestas = (new servicios.ServicioApuestasServiceLocator()).getServicioApuestasPort();
      if (interfazServicioApuestas != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)interfazServicioApuestas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)interfazServicioApuestas)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (interfazServicioApuestas != null)
      ((javax.xml.rpc.Stub)interfazServicioApuestas)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicios.InterfazServicioApuestas getInterfazServicioApuestas() {
    if (interfazServicioApuestas == null)
      _initInterfazServicioApuestasProxy();
    return interfazServicioApuestas;
  }
  
  public void registrarApuesta(int arg0, double arg1) throws java.rmi.RemoteException{
    if (interfazServicioApuestas == null)
      _initInterfazServicioApuestasProxy();
    interfazServicioApuestas.registrarApuesta(arg0, arg1);
  }
  
  
}