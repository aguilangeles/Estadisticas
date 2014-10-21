/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import frame.EnableFilters;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import models.ChangeValuesOfTrazas;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetDates extends JFrame {

    private final JRadioButton simpleDate;
    private final JRadioButton compoustDate;
    private final JComboBox jcFirstDate;
    private final JComboBox jcLastDate;
    private final JLabel fecha;
    private final JLabel entre;
    private final ButtonGroup buttongroup;
    private GetDatesFromTraza datesFromTraza;
    private final Filtro filtro;
    private EnableFilters allow;

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre, ButtonGroup bg, Filtro filtro, EnableFilters allow) throws HeadlessException {
        this.simpleDate = especifica;
        this.compoustDate = compuesta;
        this.jcFirstDate = jcEspecifico;
        this.jcLastDate = jcCompuesto;
        this.fecha = simple;
        this.entre = entre;
        this.buttongroup = bg;
        this.filtro = filtro;
        this.allow = allow;

    }

    private void actionLastCombo() {
        jcLastDate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String acondicion = new ChangeValuesOfTrazas().dateCondition(jcFirstDate, jcLastDate);
                filtro.setFechas(acondicion);

            }
        });
    }

    private void actionFirstCombo() {
        jcFirstDate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String acondicion = new ChangeValuesOfTrazas().dateCondition(jcFirstDate, jcLastDate);
                filtro.setFechas(acondicion);

            }
        });
    }

//    public void activarDate(String condicion, boolean isDateSelected) {
//        simpleDate.setEnabled(isDateSelected);
//        compoustDate.setEnabled(isDateSelected);
//
//        if (isDateSelected) {
//
//            actionSelectSimple(condicion);
//            actionSelectCompuesta(condicion);
//            actionFirstCombo();
//            actionLastCombo();
//
//        } else {
//            resetDates();
//        }
//    }
    public void active(String condicion) {
        simpleDate.setEnabled(true);
        compoustDate.setEnabled(true);
        actionSelectSimple(condicion);
        actionSelectCompuesta(condicion);
        actionFirstCombo();
        actionLastCombo();
    }

    public void desactive() {
        resetDates();
    }

    public void resetDates() {
        simpleDate.setEnabled(false);
        compoustDate.setEnabled(false);
        buttongroup.clearSelection();
        jcFirstDate.removeAllItems();
        jcFirstDate.setModel(modeldefault());
        jcFirstDate.setEnabled(false);
        jcLastDate.removeAllItems();
        jcLastDate.setModel(modeldefault());
        jcLastDate.setEnabled(false);
        jcLastDate.setVisible(false);
        entre.setVisible(false);
        fecha.setText("Fecha ");
        filtro.setFechas("");
    }

    public void actionSelectSimple(final String condicion) {
        this.simpleDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                jcFirstDate.setEnabled(true);
                setFirstModel(condicion);
                //esconder lo referente al secundo combo
                jcLastDate.setVisible(false);
                entre.setVisible(false);
                fecha.setText("Fecha ");
            }
        });
    }

    public void actionSelectCompuesta(final String condicion) {
        this.compoustDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //llenar el primer combo y visibilizarlo
                jcFirstDate.setEnabled(true);
                jcLastDate.setVisible(true);
                jcLastDate.setEnabled(true);
                //activar y visibilizar los labels
                fecha.setText("Fecha ENTRE");
                entre.setVisible(true);
                entre.setText("Y");
                setFirstModel(condicion);
                setLastModel(condicion);
            }
        });
    }

    private void setFirstModel(String condicion) {
        //llenar el primer combo y visiblilizarlo
        datesFromTraza = new GetDatesFromTraza();
        jcFirstDate.setModel(datesFromTraza.getDates(condicion, "asc"));
    }

    private void setLastModel(String condicion) {
        //llenar el segundo combo y visibilizarlo
        datesFromTraza = new GetDatesFromTraza();

        jcLastDate.setModel(datesFromTraza.getDates(condicion, "desc"));
    }

    /**
     * ***MODELO VACIO EN CASO DE QUE SE DESESTIME LA FECHA
     */
    private DefaultComboBoxModel modeldefault() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("aaaa-mm-dd");
        return model;
    }

    public void clearSeleccion() {

    }
}
