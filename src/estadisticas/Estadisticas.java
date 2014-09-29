/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria
 */
public class Estadisticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
       if(conexion.isConexion()){
           System.out.println("conexion exitosa");
        String query = "select id from traza";
           conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()){
                    System.out.println(conexion.resulset.getInt(1));
                }} catch (SQLException ex) {
                Logger.getLogger(Estadisticas.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       }
        
        
        
        
        
        
        
        
      
        
      
        
        
        
     
    }
    
}
