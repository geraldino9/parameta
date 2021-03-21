package co.parameta.servicios;

import co.parameta.implementacion.EmpleadoImpl;
import co.parameta.interfaces.EmpleadoInterface;
import co.parameta.modelos.Empleado;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "co.parameta.interfaces.EmpleadoInterface")
public class EmpleadoServiceImpl implements EmpleadoInterface {

    private final EmpleadoImpl empleadoImpl;

    public EmpleadoServiceImpl() {
        empleadoImpl = new EmpleadoImpl();
    }

    @Override
    public Empleado insertar(Empleado empleado) {
        return empleadoImpl.insertar(empleado);
    }

    @Override
    public List<Empleado> listar() {
        return empleadoImpl.listar();
    }

    @Override
    public Empleado filtrar(Empleado empleado) {
        return empleadoImpl.filtrar(empleado);
    }

    @Override
    public String actualizar(Empleado empleado) {
        return empleadoImpl.actualizar(empleado);
    }

    @Override
    public String eliminar(Empleado empleado) {
        return empleadoImpl.eliminar(empleado);
    }
}
