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
public class JComboTipoDoc {

    private final DefaultComboBoxModel model = new DefaultComboBoxModel();
    private final String condition;
    private final int id;

    public JComboTipoDoc(int id, String condition) {
        this.id = id;
        this.condition = condition;
        model.addElement("Todos");
        getdocumentos();
    }

    private void getdocumentos() {
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT    "
                    + "distinct td.descripcion "
                    + "FROM qualitys.traza t "
                    + "join qualitys.tipos_documentos td "
                    + "on t.idTipoDocumento = td.id "
                    + "where t.idVerificacion = " + id + condition;
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    
                    model.addElement(conexion.resulset.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JComboTipoDoc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        conexion.isConexionClose();
    }

    public DefaultComboBoxModel getModel() {
        return model;
    }

}
