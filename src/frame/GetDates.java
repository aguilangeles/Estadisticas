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
    private final GetDatesFromTraza datesFromTraza = new GetDatesFromTraza();

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre) throws HeadlessException {
        this.especifica = especifica;
        this.compuesta = compuesta;
        this.jcEspecifico = jcEspecifico;
        this.jcCompuesto = jcCompuesto;
        this.simple = simple;
        this.entre = entre;
    }

    public void activar(boolean algo) {
        especifica.setEnabled(algo);
        compuesta.setEnabled(algo);

    }

    public void especificaActionPerformed(final String condicion) {
        this.especifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcEspecifico.setEnabled(true);
                jcCompuesto.setVisible(false);
                entre.setVisible(false);
                simple.setText("Fecha: ");
                llenarJCEspecifico(condicion);
            }
        });
    }

    public void compuestaActionPerformed(final String condicion) {
        this.compuesta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llenarJCEspecifico(condicion);
                jcEspecifico.setEnabled(true);
                jcCompuesto.setVisible(true);
                jcCompuesto.setEnabled(true);
                simple.setText("Fecha ENTRE");
                entre.setVisible(true);
                entre.setText("Y");
                llenarLastDate(condicion);
            }
        });
    }

    private void llenarJCEspecifico(String condicion) {
        jcEspecifico.setModel(datesFromTraza.getDates(condicion, "asc"));
    }

    private void llenarLastDate(String condicion) {
        jcCompuesto.setModel(datesFromTraza.getDates(condicion, "desc"));
    }
}
