/**
 * EmpleadoInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.parameta.interfaces;

public interface EmpleadoInterface extends java.rmi.Remote {
    public co.parameta.interfaces.Empleado[] readAll() throws java.rmi.RemoteException;
    public co.parameta.interfaces.Empleado readById(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException;
    public co.parameta.interfaces.Empleado create(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException;
    public java.lang.String delete(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException;
    public java.lang.String update(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException;
}
