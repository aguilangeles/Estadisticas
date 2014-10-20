/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JComboBox;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ChangeValuesOfTrazas {

    public ChangeValuesOfTrazas() {
    }

    public String dateCondition(JComboBox jcEspecifico, JComboBox jcCompuesto) {
        String condition;
        String firstDate = jcEspecifico.getSelectedItem() + "%";
        String lastDate = null;

        if (!jcCompuesto.isVisible()) {
            condition = " and fecha_control like '" + firstDate + "'";
        } else {
            lastDate = jcCompuesto.getSelectedItem() + "%";
            condition = " and fecha_control "
                    + " between '" + firstDate + "'"
                    + " and '" + lastDate + "'";
        }

        return condition;
    }

    public String typedocCondition(int id) {
        return " and idtipodocumento = " + id + "";
    }
//
//    public String usernameCondition(JComboBox jctipouser) {
//        String condition = null;
//        int id = new SetTrazaFromUser(jctipouser.getSelectedItem() + "").getIdUsuario();
//        condition = " and idusuarios = " + id + ";";
//        return condition;
//    }
//    public ValuesTraza getTrazav() {
//        return traza;
//    }
}
