/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import frame.SetTrazaFromDoctype;
import frame.SetTrazaFromUser;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ChangeValuesOfTrazas {

    private JLabel jlnumTrazas;
    private JLabel jlnumAcep;
    private JLabel jlnumRech;
    private JLabel jlnumNull;
    private TrazaporVerificacion traza;

    public ChangeValuesOfTrazas() {
    }

    public ChangeValuesOfTrazas(TrazaporVerificacion traza) {
        this.traza = traza;
    }
//
//    public void valuesDefault() {
//        String condition = ";";
//        verificacion.setTrazaByVerification(condition);
//        verificacion.setdoctype();
//        verificacion.setusername();
//    }

    public String conditionFromDate(JComboBox jcEspecifico, JComboBox jcCompuesto) {
        String condition;
        String firstDate = jcEspecifico.getSelectedItem() + "%";
        String lastDate = null;

        if (!jcCompuesto.isVisible()) {
            condition = " and fecha_control like '" + firstDate + "';";
        } else {
            lastDate = jcCompuesto.getSelectedItem() + "%";
            condition = " and fecha_control "
                    + " between '" + firstDate + "'"
                    + " and '" + lastDate + "';";
        }
        traza.setFirstDate(firstDate);
        traza.setLastDate(lastDate);
        return condition;
    }

    public String conditionFromTypedoc(JComboBox jctipodoc) {
        String condition = null;
        if (jctipodoc.getSelectedItem().equals("Todos")) {
            condition = ";";
        } else {
            int id = new SetTrazaFromDoctype(jctipodoc.getSelectedItem() + "").getIdDoctype();
            condition = " and idtipodocumento = '" + id + "';";
        }
        return condition;
    }

    public String conditionFromUser(JComboBox jctipouser) {
        String condition = null;
        if (jctipouser.getSelectedItem().equals("Todos")) {
            condition = ";";
        } else {
            int id = new SetTrazaFromUser(jctipouser.getSelectedItem() + "").getIdUsuario();
            condition = " and idusuarios = " + id + ";";
        }
        return condition;
    }

    public TrazaporVerificacion getTrazav() {
        return traza;
    }

}
