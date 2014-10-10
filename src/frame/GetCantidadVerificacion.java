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
import models.TrazaporVerificacion;

/**
 * TRAE LAS CANTIDADES DE TRAZAS, ACEPTADAS, RECHAZADAS Y NULAS SEGUN EL ID
 * VERIFICAION.
 *
 * @author aguilangeles@gmail.com
 */
public class GetCantidadVerificacion {

    private final String condition;
    private final TrazaporVerificacion traza;
    private final DefaultComboBoxModel doctypeCombo;
    private final DefaultComboBoxModel userCombo;

    public GetCantidadVerificacion(String condition, TrazaporVerificacion traza, JLabel total, JLabel aceptadas, JLabel rechazadas, JLabel nulas) {
        this.condition = condition;
        this.traza = traza;
        int id = traza.getIdVerificacion();
        setvalueoftraza(id, condition);

        setlabels(total, aceptadas, rechazadas, nulas);
        this.doctypeCombo = modelDoctype(condition);
        this.userCombo = modelUsername(condition);

    }

    private void setlabels(JLabel total, JLabel aceptadas, JLabel rechazadas, JLabel nulas) {

        total.setText("Total Trazas: " + traza.getTrazas());
        aceptadas.setText("Total Aceptadas: " + traza.getAceptadas());
        rechazadas.setText("Total Rechazadas: " + traza.getRechazadas());
        nulas.setText("Total Nulas: " + traza.getNulas());
    }

    private void setvalueoftraza(int id, String condition1) {
        //
        int tot = getQuantityofTrazas(id, condition1);
        int aceptada = getQuantityof(id, "= '1'", condition1);
        int rechazado = getQuantityof(id, "= '0'", condition1);
        int nula = getQuantityof(id, "IS NULL", condition1);
        //
        this.traza.setTrazas(tot);
        this.traza.setAceptadas(aceptada);
        this.traza.setRechazadas(rechazado);
        this.traza.setNulas(nula);
    }

    private int getQuantityofTrazas(int id, String condition) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*)"
                    + " FROM qualitys.traza "
                    + " where idVerificacion = "
                    + id + condition;
            conexion.executeQuery(query);
            System.out.println(query);
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

    private int getQuantityof(int idTraza, String value, String condition) {
        int result = 0;
        Conexion conexion = new Conexion();
        if (conexion.isConexion()) {
            String query = "SELECT count(*) "
                    + " FROM qualitys.traza "
                    + " where idverificacion = " + idTraza
                    + " and estadoLote "
                    + value + condition;
            conexion.executeQuery(query);
            System.out.println(query);
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

    public TrazaporVerificacion getTraza() {
        return traza;
    }

    public final DefaultComboBoxModel modelDoctype(String condition) {
        JComboTipoDoc jComboTipoDoc = new JComboTipoDoc(traza.getIdVerificacion(), condition);
        return jComboTipoDoc.getModel();
    }

    public final DefaultComboBoxModel modelUsername(String condition) {
        JCTipoUsuario tipoUsuario = new JCTipoUsuario(traza.getIdVerificacion(), condition);
        return tipoUsuario.getModel();
    }

    public DefaultComboBoxModel getDoctypeCombo() {
        return doctypeCombo;
    }

    public DefaultComboBoxModel getUserCombo() {
        return userCombo;
    }
    


}
