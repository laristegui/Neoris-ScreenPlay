package com.neoris.screenplay.model;

public class UsuarioBuilder {

    private String usuario;
    private String contrasena;
    private String dni;

    private UsuarioBuilder(String usuario) {
        this.usuario = usuario;
    }

    public static Usuario unUsuarioPorDefecto(){
        return new Usuario(System.getProperty("usuario"), System.getProperty("contrasena"), System.getProperty("dni"));
    }

}