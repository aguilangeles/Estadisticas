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
 * TRAE LAS CANTIDADES DE TRAZAS, ACEPTADAS, RECHAZADAS Y NULAS SEGUN EL ID
 * VERIFICAION.
 *
 * @author aguilangeles@gmail.com
 */
public class GetCantidadVerificacion {

    private final JLabel total, aceptadas, rechazadas, nulas;
    private int ftotal, facept, frech, fnull;

    public GetCantidadVerificacion(JLabel total, JLabel aceptadas, JLabel rechazadas, JLabel nulas) {
        this.total = total;
        this.aceptadas = aceptadas;
        this.rechazadas = rechazadas;
        this.nulas = nulas;
    }

    private void setlabels(int t, int a, int r, int n) {

        total.setText("Total Trazas: " + t);
        aceptadas.setText("Total Aceptadas: " + a);
        rechazadas.setText("Total Rechazadas: " + r);
        nulas.setText("Total Nulas: " + n);
    }

    public void setvalueoftraza(String condition1) {
        //
        ftotal = getQuantityofTrazas(condition1);
        facept = getQuantityof("= '1'", condition1);
        frech = getQuantityof("= '0'", condition1);
        fnull = getQuantityof("IS NULL", condition1);
        //
        setlabels(ftotal, facept, frech, fnull);
    }

    private int getQuantityofTrazas(String condition) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*)"
                    + " FROM qualitys.traza "
                    + condition;
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {

                    result = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetCantidadVerificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return result;
    }

    private int getQuantityof(String value, String condition) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*) "
                    + " FROM qualitys.traza "
                    + condition
                    + " and estadoLote "
                    + value;
            conexion.executeQuery(query);
            try {
                while (conexion.resulset.next()) {
                    result = conexion.resulset.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GetCantidadVerificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conexion.isConexionClose();
        }
        return result;
    }

    public void reset() {
        setlabels(0, 0, 0, 0);
    }

    public int getFacept() {
        return facept;
    }

    public int getFrech() {
        return frech;
    }



}
