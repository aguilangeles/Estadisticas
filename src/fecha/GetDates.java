/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

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

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre, ButtonGroup bg) throws HeadlessException {
        this.simpleDate = especifica;
        this.compoustDate = compuesta;
        this.jcFirstDate = jcEspecifico;
        this.jcLastDate = jcCompuesto;
        this.fecha = simple;
        this.entre = entre;
        this.buttongroup = bg;
    }

    public void activarDate(String condicion, boolean isDateSelected) {
        simpleDate.setEnabled(isDateSelected);
        compoustDate.setEnabled(isDateSelected);

        if (isDateSelected) {
           
//                actionSelectSimple(condicion);
            
                actionSelectCompuesta(condicion);
            
        } else {
            buttongroup.clearSelection();
            jcFirstDate.removeAllItems();
            jcFirstDate.setModel(modeldefault());
            jcFirstDate.setEnabled(false);
            jcLastDate.removeAllItems();
            jcLastDate.setModel(modeldefault());
            jcLastDate.setEnabled(false);
        }
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
}
