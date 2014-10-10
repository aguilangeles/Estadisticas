/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import models.TrazaporVerificacion;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetDates extends JFrame {

    private final JRadioButton especifica;
    private final JRadioButton compuesta;
    private final JComboBox jcEspecifico;
    private final JComboBox jcCompuesto;
    private final JLabel simple;
    private final JLabel entre;
    private GetDatesFromTraza datesFromTraza;
    private TrazaporVerificacion trazav;

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre, TrazaporVerificacion trazav) throws HeadlessException {
        this.especifica = especifica;
        this.compuesta = compuesta;
        this.jcEspecifico = jcEspecifico;
        this.jcCompuesto = jcCompuesto;
        this.simple = simple;
        this.entre = entre;
        this.trazav = trazav;
        especificaActionPerformed();
        compuestaActionPerformed();
    }

    private void especificaActionPerformed() {
        this.especifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcEspecifico.setEnabled(true);
                jcCompuesto.setVisible(false);
                entre.setVisible(false);
                simple.setText("Fecha: ");
                llenarJCEspecifico();
            }
        });
    }

    private void compuestaActionPerformed() {
        this.compuesta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llenarJCEspecifico();
                jcEspecifico.setEnabled(true);
                jcCompuesto.setVisible(true);
                jcCompuesto.setEnabled(true);
                simple.setText("Fecha ENTRE");
                entre.setVisible(true);
                entre.setText("Y");
                llenarLastDate();
            }
        });
    }

    private void llenarJCEspecifico() {
        datesFromTraza = new GetDatesFromTraza(trazav, "asc");
        jcEspecifico.setModel(datesFromTraza.getDateFrom());
    }

    private void llenarLastDate() {
        datesFromTraza = new GetDatesFromTraza(trazav, "desc");
        jcCompuesto.setModel(datesFromTraza.getDateFrom());
    }
}
