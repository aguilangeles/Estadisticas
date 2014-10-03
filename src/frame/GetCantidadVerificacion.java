/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import estadisticas.Conexion;
import estadisticas.Estadisticas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetCantidadVerificacion {

    private JLabel numTrazas;
    private JLabel numAcept;
    private JLabel numRech;
    private int idTraza;

    public GetCantidadVerificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech, int idTraza) {
        this.numTrazas = numTrazas;
        this.numAcept = numAcept;
        this.numRech = numRech;
        this.idTraza = idTraza;
        getQuantityofTrazas();
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

}
