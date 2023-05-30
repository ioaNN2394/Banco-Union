package bancounion;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holij
 */
public class GuardarUsuario {
    
    int resultado;
        
        
        public int guardar(String Nombre, String Apellido, String Contraseña, String Codigo) {
            conectar cc=new conectar();
    Connection cn=cc.conexion();
    int resultado = 0;
    try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO aliados(codigo, nombre, apellido, contraseña) VALUES(?, ?, ?, ?)");

        pst.setString(1,Codigo);
        pst.setString(2, Nombre);
        pst.setString(3, Apellido);
        pst.setString(4, Contraseña);

        

        resultado = pst.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e);
    }finally {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    return resultado;
}
       




public static String buscarnombre(String codigo) {
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    String busqueda_nombre = null;
    try {
        PreparedStatement pst = cn.prepareStatement("SELECT Nombre, Apellido FROM aliados WHERE Codigo = ?");
        pst.setString(1, codigo);

        ResultSet resultado = pst.executeQuery();
        if (resultado.next()) {
            String nombre = resultado.getString("Nombre");
            String apellido = resultado.getString("Apellido");
            busqueda_nombre = nombre + " " + apellido;
        }
    } catch (SQLException e) {
        System.out.println(e);
    }finally {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    } 
    return busqueda_nombre;
}


        public static String buscarUsuarioRegistrado(String codigo, String contraseña) {
    conectar cc = new conectar();
    Connection cn = cc.conexion();
        String busqueda_usuario = null;
//JOHAN SEBEASTIAN QUIMBAYO
//SAMUEL RAMIREZ LARA
//LUIS FELIPE VILLOTA
    try {
        PreparedStatement pst = cn.prepareStatement("SELECT Nombre, apellido, Contraseña FROM aliados WHERE Codigo = ? AND Contraseña = ?");
        pst.setString(1, codigo);
        pst.setString(2, contraseña);
        ResultSet resultado = pst.executeQuery();
        if(resultado.next()) {
            busqueda_usuario = "usuario encontrado";
        } else {
            busqueda_usuario = "usuario no encontrado";
        }
    } catch(Exception e) {
        System.out.println(e);
    }finally {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
        return busqueda_usuario;

}
}


