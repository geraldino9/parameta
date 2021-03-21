package co.parameta.implementacion;

import co.parameta.adaptador.EmpleadoAdaptador;
import co.parameta.interfaces.EmpleadoInterface;
import co.parameta.modelos.Empleado;

import java.util.List;

public class EmpleadoImpl implements EmpleadoInterface {
    private final EmpleadoAdaptador empleadoAdaptador;

    public EmpleadoImpl() {
        empleadoAdaptador = new EmpleadoAdaptador();
    }

    @Override
    public Empleado insertar(Empleado empleado) {
        return empleadoAdaptador.insertar(empleado  );
    }

    @Override
    public List<Empleado> listar() {
        return empleadoAdaptador.listar();
    }

    @Override
    public Empleado filtrar(Empleado empleado) {
        return empleadoAdaptador.filtrar(empleado);
    }

    @Override
    public String actualizar(Empleado empleado) {
        return empleadoAdaptador.actualizar(empleado);
    }

    @Override
    public String eliminar(Empleado empleado) {
        return empleadoAdaptador.eliminar(empleado);
    }
}
