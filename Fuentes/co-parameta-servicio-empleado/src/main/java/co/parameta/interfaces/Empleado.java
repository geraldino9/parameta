/**
 * Empleado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.parameta.interfaces;

public class Empleado  implements java.io.Serializable {
    private java.lang.String apellidos;

    private java.lang.String cargo;

    private java.util.Calendar fechaNacimiento;

    private java.util.Calendar fechaVinculacionCompania;

    private int id;

    private java.lang.String nombres;

    private java.lang.String numeroDocumento;

    private boolean ok;

    private java.lang.Double salario;

    private java.lang.String tipoDocumento;

    public Empleado() {
    }

    public Empleado(
           java.lang.String apellidos,
           java.lang.String cargo,
           java.util.Calendar fechaNacimiento,
           java.util.Calendar fechaVinculacionCompania,
           int id,
           java.lang.String nombres,
           java.lang.String numeroDocumento,
           boolean ok,
           java.lang.Double salario,
           java.lang.String tipoDocumento) {
           this.apellidos = apellidos;
           this.cargo = cargo;
           this.fechaNacimiento = fechaNacimiento;
           this.fechaVinculacionCompania = fechaVinculacionCompania;
           this.id = id;
           this.nombres = nombres;
           this.numeroDocumento = numeroDocumento;
           this.ok = ok;
           this.salario = salario;
           this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the apellidos value for this Empleado.
     * 
     * @return apellidos
     */
    public java.lang.String getApellidos() {
        return apellidos;
    }


    /**
     * Sets the apellidos value for this Empleado.
     * 
     * @param apellidos
     */
    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }


    /**
     * Gets the cargo value for this Empleado.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this Empleado.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the fechaNacimiento value for this Empleado.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this Empleado.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the fechaVinculacionCompania value for this Empleado.
     * 
     * @return fechaVinculacionCompania
     */
    public java.util.Calendar getFechaVinculacionCompania() {
        return fechaVinculacionCompania;
    }


    /**
     * Sets the fechaVinculacionCompania value for this Empleado.
     * 
     * @param fechaVinculacionCompania
     */
    public void setFechaVinculacionCompania(java.util.Calendar fechaVinculacionCompania) {
        this.fechaVinculacionCompania = fechaVinculacionCompania;
    }


    /**
     * Gets the id value for this Empleado.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Empleado.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nombres value for this Empleado.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this Empleado.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the numeroDocumento value for this Empleado.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this Empleado.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the ok value for this Empleado.
     * 
     * @return ok
     */
    public boolean isOk() {
        return ok;
    }


    /**
     * Sets the ok value for this Empleado.
     * 
     * @param ok
     */
    public void setOk(boolean ok) {
        this.ok = ok;
    }


    /**
     * Gets the salario value for this Empleado.
     * 
     * @return salario
     */
    public java.lang.Double getSalario() {
        return salario;
    }


    /**
     * Sets the salario value for this Empleado.
     * 
     * @param salario
     */
    public void setSalario(java.lang.Double salario) {
        this.salario = salario;
    }


    /**
     * Gets the tipoDocumento value for this Empleado.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this Empleado.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellidos==null && other.getApellidos()==null) || 
             (this.apellidos!=null &&
              this.apellidos.equals(other.getApellidos()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.fechaVinculacionCompania==null && other.getFechaVinculacionCompania()==null) || 
             (this.fechaVinculacionCompania!=null &&
              this.fechaVinculacionCompania.equals(other.getFechaVinculacionCompania()))) &&
            this.id == other.getId() &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            this.ok == other.isOk() &&
            ((this.salario==null && other.getSalario()==null) || 
             (this.salario!=null &&
              this.salario.equals(other.getSalario()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento())));
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
        if (getApellidos() != null) {
            _hashCode += getApellidos().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getFechaVinculacionCompania() != null) {
            _hashCode += getFechaVinculacionCompania().hashCode();
        }
        _hashCode += getId();
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        _hashCode += (isOk() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSalario() != null) {
            _hashCode += getSalario().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Empleado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interfaces.parameta.co/", "empleado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVinculacionCompania");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaVinculacionCompania"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ok");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ok"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
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
