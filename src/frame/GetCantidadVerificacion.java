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
import javax.swing.JLabel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetCantidadVerificacion {

    private final JLabel numTrazas;
    private final JLabel numAcept;
    private final JLabel numRech;
    private final JLabel numNull;
    private final int idTraza;

    public GetCantidadVerificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech, JLabel numNull, int idTraza) {
        this.numTrazas = numTrazas;
        this.numAcept = numAcept;
        this.numRech = numRech;
        this.numNull = numNull;
        this.idTraza = idTraza;
        getQuantityofTrazas();
        getQuantityof(numAcept, idTraza, "= '1'", "Total Aceptados: ");// llena label de aceptados
        getQuantityof(numRech, idTraza, "= '0'", "Total Rechazados: ");//llena label de rechazados
        getQuantityof(numNull, idTraza, "IS NULL", "Total Nulos: ");// llena label null
    }

    private void getQuantityofTrazas() {
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*) FROM qualitys.traza  where idVerificacion =" + idTraza + ";";
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    int result = conexion.resulset.getInt(1);
                    numTrazas.setText("Cantidad de trazas: " + result);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetCantidadVerificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
    }

    private void getQuantityof(JLabel aLabel, int idTraza, String value, String cantidadde) {
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*) FROM qualitys.traza "
                    + " where idverificacion = " + idTraza
                    + " and estadoLote " + value + ";";
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    int result = conexion.resulset.getInt(1);
                    aLabel.setText(cantidadde + result);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetCantidadVerificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
    }

}
