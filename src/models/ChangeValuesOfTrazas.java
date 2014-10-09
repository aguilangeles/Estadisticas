/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import frame.GetDatesFromTraza;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders;

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
    private TrazaporVerificacion trazav;

    public ChangeValuesOfTrazas(JRadioButton jrbAnyDate, JComboBox jcEspecifico, JComboBox jctipodoc, JComboBox jctipousuario, JComboBox jcCompuesto, JLabel jlnumTrazas, JLabel jlnumAcep, JLabel jlnumRech, JLabel jlnumNull) {
        this.jrbAnyDate = jrbAnyDate;
        this.jcEspecifico = jcEspecifico;
        this.jctipodoc = jctipodoc;
        this.jctipousuario = jctipousuario;
        this.jcCompuesto = jcCompuesto;
        this.jlnumTrazas = jlnumTrazas;
        this.jlnumAcep = jlnumAcep;
        this.jlnumRech = jlnumRech;
        this.jlnumNull = jlnumNull;
        changeValuesOFtraza();
    }
    
    

    private TrazaporVerificacion changeValuesOFtraza() {
        frame.Verificacion verificacion = null;
        String condition;
        String firstDate = jcEspecifico.getSelectedItem() + "%";
        if (jrbAnyDate.isSelected()) {
            condition = ";";

        } else if (!jcCompuesto.isVisible()) {
            condition = " and fecha_control like '" + firstDate + "';";

        } else {
            String lastDate = jcCompuesto.getSelectedItem() + "%";
            condition = " and fecha_control "
                    + " between '" + firstDate + "'"
                    + " and '" + lastDate + "';";
            trazav.setLastDate(lastDate);
        }
        trazav.setFirstDate(firstDate);
        trazav = new frame.Verificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jctipodoc, jctipousuario, trazav, condition).getTraza();
        return trazav;
    }

    public TrazaporVerificacion getTrazav() {
        return trazav;
    }
    
}
