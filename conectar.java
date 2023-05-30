/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancounion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conectar {
  
Connection conexion = null;
    public Connection conexion()  {
        try{
            Class.forName("org.sqlite.JDBC");
            try {
                conexion = DriverManager.getConnection("jdbc:sqlite:BancoUnion.db");
                
            } catch (SQLException ex) {
                Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error");
            }
        }catch (Exception e){
    System.out.print(e.getMessage());
            
        }
        return conexion;
}
}
