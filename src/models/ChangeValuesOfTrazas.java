/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import frame.SetTrazaFromDoctype;
import frame.SetTrazaFromUser;
import frame.TipoVerificacion;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ChangeValuesOfTrazas {

    private final JRadioButton jrbAnyDate;
    private final JComboBox jcEspecifico;
    private final JComboBox jctipodoc;
    private final JComboBox jctipousuario;
    private final JComboBox jcCompuesto;
    private final JLabel jlnumTrazas;
    private final JLabel jlnumAcep;
    private final JLabel jlnumRech;
    private final JLabel jlnumNull;
    private final TrazaporVerificacion traza;
    TipoVerificacion verificacion;

    public ChangeValuesOfTrazas(JRadioButton jrbAnyDate, JComboBox jcEspecifico, JComboBox jctipodoc, JComboBox jctipousuario, JComboBox jcCompuesto, JLabel jlnumTrazas, JLabel jlnumAcep, JLabel jlnumRech, JLabel jlnumNull, TrazaporVerificacion traza) {
        this.jrbAnyDate = jrbAnyDate;
        this.jcEspecifico = jcEspecifico;
        this.jctipodoc = jctipodoc;
        this.jctipousuario = jctipousuario;
        this.jcCompuesto = jcCompuesto;
        this.jlnumTrazas = jlnumTrazas;
        this.jlnumAcep = jlnumAcep;
        this.jlnumRech = jlnumRech;
        this.jlnumNull = jlnumNull;
        this.traza = traza;
    }

    public void valuesDefault() {
        String condition = ";";
        verificacion = new TipoVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jctipodoc, jctipousuario, traza, condition);
    }

    public void valuesFromDate() {
        String condition = conditionFromDate();
        verificacion = new TipoVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jctipodoc, jctipousuario, traza, condition);
    }

    public void valuesFromDoctype() {
        String condition = conditionFromTypedoc();
        verificacion = new TipoVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jctipodoc, jctipousuario, traza, condition);
    }

    public void valuesFromUser() {
        String condition = conditionFromUser();
        verificacion = new TipoVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jctipodoc, jctipousuario, traza, condition);
    }

    private String conditionFromDate() {
        String condition;
        String firstDate = jcEspecifico.getSelectedItem() + "%";
        String lastDate = null;
        if (jrbAnyDate.isSelected()) {
            condition = ";";
        } else if (!jcCompuesto.isVisible()) {
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

    private String conditionFromTypedoc() {
        String condition = null;
        if (jctipodoc.getSelectedItem().equals("Todos")) {
            condition = ";";
        } else {
            int id = new SetTrazaFromDoctype(jctipodoc.getSelectedItem() + "").getIdDoctype();
            condition = " and idtipodocumento = '" + id + "';";
        }
        System.out.println("condition" + condition);
        return condition;
    }

    private String conditionFromUser() {
        String condition = null;
        if (jctipousuario.getSelectedItem().equals("Todos")) {
            condition = ";";
        } else {
            int id = new SetTrazaFromUser(jctipousuario.getSelectedItem() + "").getIdUsuario();
            condition = " and idusuarios = " + id + ";";
        }
        System.out.println("condition" + condition);
        return condition;
    }

    public TrazaporVerificacion getTrazav() {
        return verificacion.getTraza();
    }

}
