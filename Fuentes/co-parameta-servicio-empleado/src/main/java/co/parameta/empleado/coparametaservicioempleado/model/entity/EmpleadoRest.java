package co.parameta.empleado.coparametaservicioempleado.model.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;


public class EmpleadoRest {
    private int id;


    @NotEmpty(message="los nombres de empleado no puede estar vacío")

    private String nombres;

    @NotEmpty(message="los apellidos de empleado no puede estar vacío")
    private String apellidos;

    @NotEmpty(message="El tipo de documento de empleado no puede estar vacío")
    private String tipoDocumento;

    @NotEmpty(message="El documento de empleado no puede estar vacío")
    private String numeroDocumento;

    @Pattern(regexp="^[0-9]{4}-[0-9]{2}-[0-9]{2}$",message="El formato de la fecha de nacimiento es incorrecto [aaaa-MM-dd]")
    private String fechaNacimiento;

    @Pattern(regexp="^[0-9]{4}-[0-9]{2}-[0-9]{2}$",message="El formato de la fecha de nacimiento es incorrecto [aaaa-MM-dd]")
    private String fechaVinculacionCompania;

    @NotEmpty(message="El cargo de empleado no puede estar vacío")
    private String cargo;

    //@NotEmpty(message="El salario de empleado no puede estar vacío")
    private Double salario;
    
    private String tiempoVinculacion;
    
    private String edadActual;

    public EmpleadoRest() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaVinculacionCompania() {
        return fechaVinculacionCompania;
    }


    public void setFechaVinculacionCompania(String fechaVinculacionCompania) {
        this.fechaVinculacionCompania = fechaVinculacionCompania;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void setEdadActual(String edadActual) {
    	this.edadActual = edadActual;
    }
    
    public String getEdadActual() {
    	return this.edadActual;
    }
    
    public void setTiempoVinculacion(String tiempoVinculacion) {
    	this.tiempoVinculacion = tiempoVinculacion;
    }
    
    public String getTiempoVinculacion() {
    	return this.tiempoVinculacion;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public int getId() {
    	return this.id;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaVinculacionCompania=" + fechaVinculacionCompania +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
