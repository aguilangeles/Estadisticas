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
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class JCTipoUsuario {

    private DefaultComboBoxModel model = new DefaultComboBoxModel();
    private final String condition;
    private final int id;

    public JCTipoUsuario( int id,String condition) {
        this.id = id;
        this.condition = condition;
        model.addElement("Todos");
        getUsuarios();
    }

    private void getUsuarios() {
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT distinct t.idUsuarios "
                    + ", tu.nombre  "
                    + "FROM qualitys.traza t "
                    + "join qualitys.usuarios tu "
                    + "on t.idUsuarios = tu.id "
                    + "where t.idVerificacion = "
                     + id + condition;
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    model.addElement(conexion.resulset.getString(2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JComboUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
    }

    public DefaultComboBoxModel getModel() {
        return model;
    }

    public void setModel(DefaultComboBoxModel model) {
        this.model = model;
    }

}
