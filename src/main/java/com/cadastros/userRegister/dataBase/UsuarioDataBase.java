package com.cadastros.userRegister.dataBase;

import com.cadastros.userRegister.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDataBase {

    public void salvar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, nome_usuario) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getNomeUsuario());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }


}
