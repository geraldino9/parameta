package co.parameta.conexion;

import co.parameta.interfaces.IConnecction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion implements IConnecction {
    private Connection conexion;

    public Conexion() {
        try {
            registerDriver();

            String host = "localhost";
            int port = 3306;
            String database = "parameta";
            String user = "root";
            String pass = "";

            String urlConexion = "jdbc:mysql://localhost:"+port+"/"+database;

            conexion = DriverManager.getConnection(urlConexion, user, pass);

            boolean valid = conexion.isValid(50000);
            System.out.println(!valid ? "No se pudo conectar a la base de datos." : "");
        } catch (SQLException ex) {
            System.out.println("Error al conectar a la base de datos. ::> " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de Mysql ::> " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conexion;
    }

    public void close() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
