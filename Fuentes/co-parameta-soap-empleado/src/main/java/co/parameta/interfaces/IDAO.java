package co.parameta.interfaces;

import co.parameta.modelos.Empleado;

import java.util.ArrayList;

public interface IDAO {
    Empleado create(Object object);

    ArrayList<Empleado> readAll();

    Object readById(Object object);

    void update(Object object);

    void delete(Object object);

    void close();
}
