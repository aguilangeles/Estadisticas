/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import estadisticas.ReadProperties.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MUTNPROD003
 */
public class Conexion {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private Connection conexion;
    public Statement statement = null;
    public ResultSet resulset = null;
    private PreparedStatement prepareStatement;
    private int filasAfectadas;
    private int messageType = JOptionPane.ERROR_MESSAGE;
    private String className = Conexion.class.getName();

    public Conexion() {
    }

    public boolean isConexion() {
        Database db = new ReadProperties().getUser();
        String url = db.getUrl();
        String base = db.getBase();
        String urlExtendida = "jdbc:mysql://" + url + "/" + base;
        String user = db.getName();
        String passw = db.getPassword();
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(urlExtendida, user, passw);
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return conexion != null;
    }

    public boolean isConexionClose() {
        if (resulset != null) {
            try {
                resulset.close();
            } catch (SQLException ex) {

                System.out.println(ex);
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {

                System.out.println(ex);
            }
        }
        if (conexion != null) {
            try {
                if (!conexion.isClosed()) {
                    try {
                        conexion.close();

                        return true;
                    } catch (SQLException ex) {
                        System.out.println(ex);
                        return false;
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return false;
    }
//para consultar

    public void executeQuery(String sql) {
        try {
            statement = (Statement) conexion.createStatement();
            resulset = statement.executeQuery(sql);

        } catch (SQLException sqle) {
//envia mensajes si la consulta tuvo un error
            do {
                System.out.println("SQL STATE: " + sqle.getSQLState());
                System.out.println("ERROR CODE: " + sqle.getErrorCode());
                System.out.println("MESSAGE: " + sqle.getMessage());
                System.out.println();
                sqle = sqle.getNextException();
            } while (sqle != null);
        }
    }

    public void executeUpdate(String sql) throws SQLException {
        prepareStatement = conexion.prepareStatement(sql);
        filasAfectadas = prepareStatement.executeUpdate();
    }

}
