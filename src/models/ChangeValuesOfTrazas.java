/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import frame.SetTrazaFromDoctype;
import frame.SetTrazaFromUser;
import javax.swing.JComboBox;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ChangeValuesOfTrazas {

    private TrazaporVerificacion traza;
  

    public ChangeValuesOfTrazas() {
    }

    public ChangeValuesOfTrazas(TrazaporVerificacion traza) {
        this.traza = traza;
    }

    public String valuedefault() {
        return ";";
    }

    public String dateCondition(JComboBox jcEspecifico, JComboBox jcCompuesto) {
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

    public String typedocCondition(JComboBox jctipodoc) {
        String condition = null;
        int id = new SetTrazaFromDoctype(jctipodoc.getSelectedItem() + "").getIdDoctype();
        condition = " and idtipodocumento = '" + id + "';";
        return condition;
    }

    public String usernameCondition(JComboBox jctipouser) {
        String condition = null;
        int id = new SetTrazaFromUser(jctipouser.getSelectedItem() + "").getIdUsuario();
        condition = " and idusuarios = " + id + ";";
        return condition;
    }

    public TrazaporVerificacion getTrazav() {
        return traza;
    }

}
