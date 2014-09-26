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
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private Connection conexion;
    private Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String url, base, user, password;

    public Conexion() {
    }
    
    public boolean isconnect() throws SQLException{
        try {
            Class.forName(DRIVER);
            String urlext = "jdbc:mysql://" + url + "/" + base;
            conexion =(Connection) DriverManager.getConnection(urlext, user, password);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            return conexion != null;
    }
    
      public boolean isConexionClose() {
    if (resultSet != null)
      {
      try
        {
        resultSet.close();
        } catch (SQLException ex)
        {
            
        }
      }
    if (statement != null)
      {
      try
        {
        statement.close();
        } catch (SQLException ex)
        {

        }
      }
    if (conexion != null)
      {
      try
        {
        if (!conexion.isClosed())
          {
          try
            {
            conexion.close();

            return true;
            } catch (SQLException ex)
            {

                return false;
            }
          }
        } catch (SQLException ex)
        {

        }
      }
    return false;
  }
      
        public void executeQuery(String sql) {
    try
      {
      statement = (Statement) (java.sql.Statement) conexion.createStatement();
      resultSet = statement.executeQuery(sql);

      } catch (SQLException sqle)
      {
//envia mensajes si la consulta tuvo un error
      do
        {
        System.out.println("SQL STATE: " + sqle.getSQLState());
        System.out.println("ERROR CODE: " + sqle.getErrorCode());
        System.out.println("MESSAGE: " + sqle.getMessage());
        System.out.println();
        sqle = sqle.getNextException();
        } while (sqle != null);
      }
  }

  public void executeUpdate(String sql) throws SQLException {
//    prepareStatement = conexion.prepareStatement(sql);
//    filasAfectadas = prepareStatement.executeUpdate();
  }
}
