/**
 * ServicioApuestasServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public class ServicioApuestasServiceLocator extends org.apache.axis.client.Service implements servicios.ServicioApuestasService {

    public ServicioApuestasServiceLocator() {
    }


    public ServicioApuestasServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioApuestasServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioApuestasPort
    private java.lang.String ServicioApuestasPort_address = "http://localhost:8080/webServices01/services/ServicioApuestasPort";

    public java.lang.String getServicioApuestasPortAddress() {
        return ServicioApuestasPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioApuestasPortWSDDServiceName = "ServicioApuestasPort";

    public java.lang.String getServicioApuestasPortWSDDServiceName() {
        return ServicioApuestasPortWSDDServiceName;
    }

    public void setServicioApuestasPortWSDDServiceName(java.lang.String name) {
        ServicioApuestasPortWSDDServiceName = name;
    }

    public servicios.InterfazServicioApuestas getServicioApuestasPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioApuestasPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioApuestasPort(endpoint);
    }

    public servicios.InterfazServicioApuestas getServicioApuestasPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servicios.ServicioApuestasServiceSoapBindingStub _stub = new servicios.ServicioApuestasServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioApuestasPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioApuestasPortEndpointAddress(java.lang.String address) {
        ServicioApuestasPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servicios.InterfazServicioApuestas.class.isAssignableFrom(serviceEndpointInterface)) {
                servicios.ServicioApuestasServiceSoapBindingStub _stub = new servicios.ServicioApuestasServiceSoapBindingStub(new java.net.URL(ServicioApuestasPort_address), this);
                _stub.setPortName(getServicioApuestasPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServicioApuestasPort".equals(inputPortName)) {
            return getServicioApuestasPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicios/", "ServicioApuestasService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicios/", "ServicioApuestasPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioApuestasPort".equals(portName)) {
            setServicioApuestasPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
