package co.parameta.adaptador;

import co.parameta.dao.EmpleadoDAO;
import co.parameta.interfaces.EmpleadoInterface;
import co.parameta.interfaces.IDAO;
import co.parameta.modelos.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoAdaptador implements EmpleadoInterface {
    @Override
    public Empleado insertar(Empleado empleado) {
        IDAO iDataAccessObject = new EmpleadoDAO();
        Empleado aux = iDataAccessObject.create(empleado);
        iDataAccessObject.close();
        return aux;
    }

    @Override
    public List<Empleado> listar() {
        IDAO iDataAccessObject = new EmpleadoDAO();
        ArrayList<Empleado> list = iDataAccessObject.readAll();
        iDataAccessObject.close();
        return list;
    }

    @Override
    public Empleado filtrar(Empleado empleado) {
        IDAO iDataAccessObject = new EmpleadoDAO();
        empleado = (Empleado) iDataAccessObject.readById(empleado);
        iDataAccessObject.close();
        return empleado;

    }

    @Override
    public String actualizar(Empleado empleado) {
        IDAO iDataAccessObject = new EmpleadoDAO();
        iDataAccessObject.update(empleado);
        iDataAccessObject.close();
        return empleado.isOk() ? "Se ha actualizado correctamente" : "No se pudo actualizar";
    }

    @Override
    public String eliminar(Empleado empleado) {
        IDAO iDataAccessObject = new EmpleadoDAO();
        iDataAccessObject.delete(empleado);
        iDataAccessObject.close();
        return empleado.isOk() ? "Se ha eliminado correctamente" : "No se pudo eliminar";
    }
}
