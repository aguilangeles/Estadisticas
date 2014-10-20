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
import javax.swing.JLabel;

/**
 * TRAE LAS CANTIDADES DE TRAZAS, ACEPTADAS, RECHAZADAS Y NULAS SEGUN EL ID
 * VERIFICAION.
 *
 * @author aguilangeles@gmail.com
 */
public class GetCantidadVerificacion {

//    private String condition;
////    private final ValuesTraza traza;
//    private DefaultComboBoxModel doctypeCombo;
//    private DefaultComboBoxModel userCombo;
    private final JLabel total, aceptadas, rechazadas, nulas;

//    public GetCantidadVerificacion(String condition, ValuesTraza traza, JLabel total, JLabel aceptadas, JLabel rechazadas, JLabel nulas) {
//        this.condition = condition;
//        this.traza = traza;
//        int id = traza.getIdVerificacion();
//        setvalueoftraza(id, condition);
//
//        setlabels(total, aceptadas, rechazadas, nulas);
//        this.doctypeCombo = modelDoctype(condition);
//        this.userCombo = modelUsername(condition);
//
//    }
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
        int tot = getQuantityofTrazas(condition1);
        int aceptada = getQuantityof("= '1'", condition1);
        int rechazado = getQuantityof("= '0'", condition1);
        int nula = getQuantityof("IS NULL", condition1);
        //
        setlabels(tot, aceptada, rechazado, nula);
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
    public void reset(){
         setlabels(0, 0, 0, 0);
    }

   

//    public final DefaultComboBoxModel modelDoctype(String condition) {
//        JComboTipoDoc jComboTipoDoc = new JComboTipoDoc(traza.getIdVerificacion(), condition);
//        return jComboTipoDoc.getModel();
//    }
//
//    public final DefaultComboBoxModel modelUsername(String condition) {
//        JCTipoUsuario tipoUsuario = new JCTipoUsuario(traza.getIdVerificacion(), condition);
//        return tipoUsuario.getModel();
//    }
//
//    public DefaultComboBoxModel getDoctypeCombo() {
//        return doctypeCombo;
//    }
//
//    public DefaultComboBoxModel getUserCombo() {
//        return userCombo;
//    }

}
