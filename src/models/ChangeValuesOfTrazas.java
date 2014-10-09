/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

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
        changeValuesOFtraza();
    }

    private void changeValuesOFtraza() {
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
        verificacion = new TipoVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jctipodoc, jctipousuario, traza, condition);
        traza.setFirstDate(firstDate);
        traza.setLastDate(lastDate);
    }

    public TrazaporVerificacion getTrazav() {
        return verificacion.getTraza();
    }

}
