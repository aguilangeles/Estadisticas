/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class SetTrazaFromUser {

    private String condicion;
    private int idUsuario;

    public SetTrazaFromUser(String condicion) {
        this.idUsuario = getiddocument(condicion);
    }

    private int getiddocument(String nombre) {
        int id = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id FROM qualitys.usuarios where nombre = '" + nombre + "';";
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    id = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JComboTipoDoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
