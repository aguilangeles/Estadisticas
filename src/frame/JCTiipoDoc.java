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
public class JCTiipoDoc {

    private final DefaultComboBoxModel model = new DefaultComboBoxModel();

    public JCTiipoDoc() {
    }

    public void getdocumentos(String condition) {
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT    "
                    + "distinct td.descripcion "
                    + "FROM qualitys.traza t "
                    + "join qualitys.tipos_documentos td "
                    + "on t.idTipoDocumento = td.id "
                    + condition;
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    model.addElement(conexion.resulset.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JCTiipoDoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
    }

    public int getiddocument(String description) {
        int id = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT id FROM qualitys.tipos_documentos where descripcion = '" + description + "';";
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    id = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(JCTiipoDoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
        return id;
    }

    public DefaultComboBoxModel getModel() {
        return model;
    }

}
