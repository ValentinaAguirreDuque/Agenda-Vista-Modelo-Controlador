package modelo;

public class CContacto {

    String id;
    String nombres;
    String apellidos;
    String telefono;
    String direccion;
    String email;

    public CContacto() {

    }

    public CContacto(String id, String nombres, String apellidos, String telefono, String direccion, String email) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

}
