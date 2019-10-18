/**
 * Ordenador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public class Ordenador  implements java.io.Serializable {
    private double cantidad;

    private java.lang.String comprador;

    private java.lang.String producto;

    public Ordenador() {
    }

    public Ordenador(
           double cantidad,
           java.lang.String comprador,
           java.lang.String producto) {
           this.cantidad = cantidad;
           this.comprador = comprador;
           this.producto = producto;
    }


    /**
     * Gets the cantidad value for this Ordenador.
     * 
     * @return cantidad
     */
    public double getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this Ordenador.
     * 
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the comprador value for this Ordenador.
     * 
     * @return comprador
     */
    public java.lang.String getComprador() {
        return comprador;
    }


    /**
     * Sets the comprador value for this Ordenador.
     * 
     * @param comprador
     */
    public void setComprador(java.lang.String comprador) {
        this.comprador = comprador;
    }


    /**
     * Gets the producto value for this Ordenador.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this Ordenador.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ordenador)) return false;
        Ordenador other = (Ordenador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cantidad == other.getCantidad() &&
            ((this.comprador==null && other.getComprador()==null) || 
             (this.comprador!=null &&
              this.comprador.equals(other.getComprador()))) &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(getCantidad()).hashCode();
        if (getComprador() != null) {
            _hashCode += getComprador().hashCode();
        }
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ordenador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicios/", "ordenador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comprador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
