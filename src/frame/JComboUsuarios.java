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
public class JComboUsuarios {
    
    private DefaultComboBoxModel model = new DefaultComboBoxModel();
    private final int id;
    
    public JComboUsuarios(int id) {
        this.id = id;
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
                    + "where t.idVerificacion = " + id + ";";
            
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    model.addElement(conexion.resulset.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JComboUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        conexion.isConexionClose();
    }

    /*  private void getDates(int idverificacion, String order) {
     Conexion conexion = new Conexion();
     if (conexion.isConexion()) {
     String query = " SELECT distinct date(fecha_control) "
     + " FROM qualitys.traza "
     + " where idVerificacion = " + idverificacion
     + " order by fecha_control " + order + ";";
     conexion.executeQuery(query);
     try {
     while (conexion.resulset.next()) {
     dates.addElement(conexion.resulset.getDate(1));
     }
     } catch (SQLException ex) {
     Logger.getLogger(GetDatesFromTraza.class.getName()).log(Level.SEVERE, null, ex);
     }
     }
     conexion.isConexionClose();
     }*/
    public DefaultComboBoxModel getModel() {
        return model;
    }
}
