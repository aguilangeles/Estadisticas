/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JComboBox;

/**
 * AGREGA A LA QUERY PRINCIPAL CONDICIONES SEGUN EL FILTRO ESPECIFICADO
 *
 * @author aguilangeles@gmail.com
 */
public class AddConditionsByFilter {

    public AddConditionsByFilter() {
    }
    /*TRAE LA O LAS FECHAS ESTABLECIDAS EN EL FILTRO*/

    public String dateCondition(JComboBox simpleDate, JComboBox dobleDate) {
        String condition;
        String firstDate = simpleDate.getSelectedItem() + "%";
        String lastDate = null;

        if (!dobleDate.isVisible()) {
            condition = " and fecha_control like '" + firstDate + "'";
        } else {
            lastDate = dobleDate.getSelectedItem() + "%";
            condition = " and fecha_control "
                    + " between '" + firstDate + "'"
                    + " and '" + lastDate + "'";
        }

        return condition;
    }

    /*AGREGA LA CONDICION DE TIPO DE DOCUMENTO*/
    public String typedocCondition(int id) {
        return " and idtipodocumento = " + id;
    }

    /*AGREGA LA CONDICION DE NOMBRE DE USUARIO*/
    public String usernameCondition(int id) {
        return " and idusuarios = " + id;
    }

}
