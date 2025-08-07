package com.cadastros.userRegister.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/user";

    private static final String USER = "root";

    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        try {
            // Tenta abrir conexão com o banco
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Se der erro, lança uma RuntimeException com a causa
            throw new RuntimeException("Erro ao conectar com o banco de dados", e);
        }
    }
}
