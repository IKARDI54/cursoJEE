package servicios;

public class ServicioOrdenadoresProxy implements servicios.ServicioOrdenadores {
  private String _endpoint = null;
  private servicios.ServicioOrdenadores servicioOrdenadores = null;
  
  public ServicioOrdenadoresProxy() {
    _initServicioOrdenadoresProxy();
  }
  
  public ServicioOrdenadoresProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioOrdenadoresProxy();
  }
  
  private void _initServicioOrdenadoresProxy() {
    try {
      servicioOrdenadores = (new servicios.ServicioComprasOrdenadoresServiceLocator()).getServicioComprasOrdenadoresPort();
      if (servicioOrdenadores != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioOrdenadores)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioOrdenadores)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioOrdenadores != null)
      ((javax.xml.rpc.Stub)servicioOrdenadores)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicios.ServicioOrdenadores getServicioOrdenadores() {
    if (servicioOrdenadores == null)
      _initServicioOrdenadoresProxy();
    return servicioOrdenadores;
  }
  
  public void registrarCompra(servicios.Ordenador arg0) throws java.rmi.RemoteException{
    if (servicioOrdenadores == null)
      _initServicioOrdenadoresProxy();
    servicioOrdenadores.registrarCompra(arg0);
  }
  
  
}