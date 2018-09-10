package lopez.armando.pasoparametros.Models;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String usuario;
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;

    public Usuario(String usuario, String password, String nombre, String apellidos, String correo) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

