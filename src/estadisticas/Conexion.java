/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Conexion {

    private Connection conexion = null;
    private String servidor = "localhost";
    private String database = "qualitys";
    private String usuario = "root";
    private String password = "root";
    private String url = "";

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://" + servidor + "/" + database;
            conexion = (Connection) DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    
    
    public Connection getConexion() {
        return conexion;
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Cerrando conexion a " + url + " . . . . . Ok");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conexion = null;
        return conexion;
    }

}
