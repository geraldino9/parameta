package co.parameta.dao;

import co.parameta.conexion.Conexion;
import co.parameta.interfaces.IConnecction;
import co.parameta.interfaces.IDAO;
import co.parameta.modelos.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.ArrayList;

public class EmpleadoDAO implements IDAO {
    private final IConnecction conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public EmpleadoDAO() {
        this.conexion = new Conexion();
        ps = null;
        rs = null;
    }

    @Override
    public Empleado create(Object object) {
        Empleado empleado = null;
        try {
            empleado = (Empleado) object;

            String sql = "INSERT INTO empleados(empl_nombres, empl_apellidos, empl_tipodocumento, empl_numerodocumento, empl_fechanacimiento, empl_fechavinculacion, empl_cargo, empl_salario) VALUES(?, ?,?, ?, ?, ? ,? ,?)";
            int index = 1;

            ps = this.conexion.getConnection().prepareStatement(sql);
            ps.setObject(index++, empleado.getNombres(), Types.VARCHAR);
            ps.setObject(index++, empleado.getApellidos(), Types.VARCHAR);
            ps.setObject(index++, empleado.getTipoDocumento(), Types.VARCHAR);
            ps.setObject(index++, empleado.getNumeroDocumento(), Types.VARCHAR);
            ps.setObject(index++, empleado.getFechaNacimiento(), Types.TIMESTAMP);
            ps.setObject(index++, empleado.getFechaVinculacionCompania(), Types.TIMESTAMP);
            ps.setObject(index++, empleado.getCargo(), Types.VARCHAR);
            ps.setObject(index++, empleado.getSalario(), Types.DOUBLE);
            int result = ps.executeUpdate();
//            paisVO.setOk(ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            System.out.println("No se pudo insertar el objeto.");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return empleado;
    }

    @Override
    public ArrayList<Empleado> readAll() {
        ArrayList<Empleado> list = null;
        try {
            String sql = "SELECT * FROM empleados ORDER BY 2";

            ps = this.conexion.getConnection().prepareStatement(sql);

            rs = ps.executeQuery();
            if (rs.isBeforeFirst()) {
                list = new ArrayList<>();
                Empleado empleado;
                while (rs.next()) {
                    empleado = new Empleado();
                    empleado.setId(rs.getInt("empl_id"));
                    empleado.setNombres(rs.getString("empl_nombres"));
                    empleado.setApellidos(rs.getString("empl_apellidos"));
                    empleado.setOk(true);
                    list.add(empleado);
                }
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo mostrar la lista de objetos.");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (rs != null) rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public Object readById(Object object) {
        Empleado empleado = (Empleado) object;
        try {
            String sql = "SELECT * FROM empleados WHERE empl_id = ? ORDER BY nombre";

            ps = this.conexion.getConnection().prepareStatement(sql);
            ps.setObject(1, empleado.getId(), Types.NUMERIC);

            rs = ps.executeQuery();
            if (rs.next()) {
                empleado = new Empleado();
                empleado.setId(rs.getInt("empl_id"));
                empleado.setNombres(rs.getString("empl_nombres"));
                empleado.setApellidos(rs.getString("empl_apellidos"));
                empleado.setOk(true);
            } else {
                empleado = null;
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo mostrar el objeto.");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (rs != null) rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return empleado;
    }

    @Override
    public void update(Object object) {
        try {
            Empleado empleado = (Empleado) object;

            String sql = "UPDATE empleados SET empl_nombre = ?, empl_apellidos = ? WHERE empl_id = ?";
            int index = 1;

            ps = this.conexion.getConnection().prepareStatement(sql);
            ps.setObject(index++, empleado.getNombres(), Types.VARCHAR);
            ps.setObject(index++, empleado.getApellidos(), Types.VARCHAR);
            ps.setObject(index, empleado.getId(), Types.NUMERIC);

            empleado.setOk(ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            System.out.println("No se pudo actualizar el objeto.");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Object object) {
        try {
            Empleado empleado = (Empleado) object;

            String sql = "DELETE FROM empleados WHERE empl_id = ?";

            ps = this.conexion.getConnection().prepareStatement(sql);
            ps.setObject(1, empleado.getId(), Types.NUMERIC);

            empleado.setOk(ps.executeUpdate() > 0);
        } catch (SQLException ex) {
            System.out.println("No se pudo eliminar el objeto.");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void close() {
        if (conexion != null) conexion.close();
    }
}
