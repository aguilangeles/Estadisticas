/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import estadisticas.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 * cargará combos de selección con las fechas registradas en la database
 *
 * @author aguilangeles@gmail.com
 */
public class GetDatesFromTraza {

    private DefaultComboBoxModel dates = new DefaultComboBoxModel();

    public GetDatesFromTraza() {
    }

    public DefaultComboBoxModel getDates(String condicion, String order) {
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = " SELECT distinct date(fecha_control) "
                    + " FROM qualitys.traza "
                    + condicion
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
        return dates;
    }

}
