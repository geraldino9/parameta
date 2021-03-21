package co.parameta.interfaces;

import java.sql.Connection;

public interface IConnecction {
    Connection getConnection();

    void close();
}
