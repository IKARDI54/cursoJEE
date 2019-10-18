/**
 * Apuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public class Apuesta  implements java.io.Serializable {
    private double cantidad;

    private boolean ganado;

    private java.lang.String nombre;

    private int numero;

    public Apuesta() {
    }

    public Apuesta(
           double cantidad,
           boolean ganado,
           java.lang.String nombre,
           int numero) {
           this.cantidad = cantidad;
           this.ganado = ganado;
           this.nombre = nombre;
           this.numero = numero;
    }


    /**
     * Gets the cantidad value for this Apuesta.
     * 
     * @return cantidad
     */
    public double getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this Apuesta.
     * 
     * @param cantidad
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the ganado value for this Apuesta.
     * 
     * @return ganado
     */
    public boolean isGanado() {
        return ganado;
    }


    /**
     * Sets the ganado value for this Apuesta.
     * 
     * @param ganado
     */
    public void setGanado(boolean ganado) {
        this.ganado = ganado;
    }


    /**
     * Gets the nombre value for this Apuesta.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Apuesta.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the numero value for this Apuesta.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Apuesta.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Apuesta)) return false;
        Apuesta other = (Apuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cantidad == other.getCantidad() &&
            this.ganado == other.isGanado() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            this.numero == other.getNumero();
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
        _hashCode += (isGanado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        _hashCode += getNumero();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Apuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicios/", "apuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ganado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ganado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
