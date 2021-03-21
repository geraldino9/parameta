package co.parameta.interfaces;

public class EmpleadoInterfaceProxy implements co.parameta.interfaces.EmpleadoInterface {
  private String _endpoint = null;
  private co.parameta.interfaces.EmpleadoInterface empleadoInterface = null;
  
  public EmpleadoInterfaceProxy() {
    _initEmpleadoInterfaceProxy();
  }
  
  public EmpleadoInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmpleadoInterfaceProxy();
  }
  
  private void _initEmpleadoInterfaceProxy() {
    try {
      empleadoInterface = (new co.parameta.servicios.EmpleadoServiceImplServiceLocator()).getEmpleadoServiceImplPort();
      if (empleadoInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)empleadoInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)empleadoInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (empleadoInterface != null)
      ((javax.xml.rpc.Stub)empleadoInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.parameta.interfaces.EmpleadoInterface getEmpleadoInterface() {
    if (empleadoInterface == null)
      _initEmpleadoInterfaceProxy();
    return empleadoInterface;
  }
  
  public co.parameta.interfaces.Empleado[] readAll() throws java.rmi.RemoteException{
    if (empleadoInterface == null)
      _initEmpleadoInterfaceProxy();
    return empleadoInterface.readAll();
  }
  
  public co.parameta.interfaces.Empleado readById(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException{
    if (empleadoInterface == null)
      _initEmpleadoInterfaceProxy();
    return empleadoInterface.readById(arg0);
  }
  
  public co.parameta.interfaces.Empleado create(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException{
    if (empleadoInterface == null)
      _initEmpleadoInterfaceProxy();
    return empleadoInterface.create(arg0);
  }
  
  public java.lang.String delete(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException{
    if (empleadoInterface == null)
      _initEmpleadoInterfaceProxy();
    return empleadoInterface.delete(arg0);
  }
  
  public java.lang.String update(co.parameta.interfaces.Empleado arg0) throws java.rmi.RemoteException{
    if (empleadoInterface == null)
      _initEmpleadoInterfaceProxy();
    return empleadoInterface.update(arg0);
  }
  
  
}