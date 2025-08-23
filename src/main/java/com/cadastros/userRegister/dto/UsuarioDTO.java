package com.cadastros.userRegister.dto;

public class UsuarioDTO {
    private String nome;
    private String nome_usuario;
    private String email;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public boolean validarContratoDeEntrada(){
        if (nome == null || nome.isEmpty()){
            return false;
        }
        if(nome_usuario == null || nome_usuario.isEmpty()){
            return false;
        }
        if(email == null || email.isEmpty()){
            return false;
        }
        if(idade == null || idade <= 0 ){
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nome='" + nome + '\'' +
                ", nome_usuario='" + nome_usuario + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }
}

