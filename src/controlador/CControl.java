package controlador;

import java.sql.Connection;
import java.util.ArrayList;
import vista.*;
import modelo.*;

public class CControl {

    CConexion con = new CConexion();
    Connection conecta;
    CConsultas consulta = new CConsultas();

    public CControl() {

    }

    public boolean insertar(String nombres, String apellidos, String direccion, String telefono, String email) {
        conecta = con.conectar();
        boolean bandera = consulta.ingresar(conecta, nombres, apellidos, direccion, telefono, email);
        con.desconectar(conecta);
        return bandera;
    }

    public ArrayList<CContacto> consultar() {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.consultar(conecta);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }

    public boolean borrar(String telefono) {
        conecta = con.conectar();
        boolean bandera = consulta.borrar(conecta, telefono);
        con.desconectar(conecta);
        return bandera;
    }

    public boolean editar(String nombres, String apellidos, String direccion, String telefono, String email) {
        conecta = con.conectar();
        boolean bandera = consulta.editar(conecta, nombres, apellidos, direccion, telefono, email);
        con.desconectar(conecta);
        return bandera;
    }

    public ArrayList<CContacto> listarCiudad(String direccion) {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.listarCiudad(conecta, direccion);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }

    public ArrayList<CContacto> listarRangoID(String idInicial, String idFinal) {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.listarRangoID(conecta, idInicial, idFinal);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }
    
    public ArrayList<CContacto> BuscarPorNombreInicial(String nombres) {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.BuscarPorNombreInicial(conecta, nombres);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }
    
    public ArrayList<CContacto> BuscarPorApellidoInicial(String apellidos) {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.BuscarPorApellidoInicial(conecta, apellidos);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }
    
    public ArrayList<CContacto> BuscarPorID(String id) {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.BuscarPorID(conecta, id);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }
    
    public ArrayList<CContacto> ListarDireccionCalle(String direccion) {
        ArrayList<CContacto> lista = new ArrayList<>();
        conecta = con.conectar();
        if (conecta != null) {
            lista = consulta.ListarDireccionCalle(conecta, direccion);
            con.desconectar(conecta);
            return lista;
        } else {
            return null;
        }
    }
}
