package co.parameta.interfaces;
import co.parameta.modelos.Empleado;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface EmpleadoInterface {
    @WebMethod(operationName = "create")
    Empleado insertar(Empleado empleado);

    @WebMethod(operationName = "readAll")
    List<Empleado> listar();

    @WebMethod(operationName = "readById")
    Empleado filtrar(Empleado empleado);

    @WebMethod(operationName = "update")
    String actualizar(Empleado empleado);

    @WebMethod(operationName = "delete")
    String eliminar(Empleado empleado);
}
