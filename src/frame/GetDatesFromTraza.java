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
import models.TrazaporVerificacion;

/**
 * cargará combos de selección con las fechas registradas en la database
 *
 * @author aguilangeles@gmail.com
 */
public class GetDatesFromTraza {

    private final String order;
    private final TrazaporVerificacion traza;
    private final DefaultComboBoxModel dates = new DefaultComboBoxModel();

    public GetDatesFromTraza(TrazaporVerificacion trazav, String order) {
        this.traza = trazav;
        this.order = order;
        int idverificacion = traza.getIdVerificacion();
        getDates(idverificacion, order);
    }

    private void getDates(int idverificacion, String order) {
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
    }

    public DefaultComboBoxModel getDateFrom() {
        return dates;
    }

}
