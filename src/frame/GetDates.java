/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetDates extends JFrame {

    private ButtonGroup group;
    private final JRadioButton especifica;
    private final JRadioButton compuesta;
    private final JComboBox jcEspecifico;
    private final JComboBox jcCompuesto;
    private final JLabel simple;
    private final JLabel entre;
    private final Verificacion verificacion;
    private GetDatesFromTraza datesFromTraza;

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre, Verificacion verificacion) throws HeadlessException {
        this.especifica = especifica;
        this.compuesta = compuesta;
        this.jcEspecifico = jcEspecifico;
        this.jcCompuesto = jcCompuesto;
        this.simple = simple;
        this.entre = entre;
        this.verificacion = verificacion;

        actionRadioButton();
        especificaActionPerformed();
        compuestaActionPerformed();
        int id = verificacion.getIdTraza();
        datesFromTraza = new GetDatesFromTraza(id, "asc");
        jcEspecifico.setModel(datesFromTraza.getDateFrom());
    }

    private void especificaActionPerformed() {
        this.especifica.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcCompuesto.setVisible(false);
                entre.setVisible(false);
                int id = verificacion.getIdTraza();
                datesFromTraza = new GetDatesFromTraza(id, "asc");
                jcEspecifico.setModel(datesFromTraza.getDateFrom());
            }
        });
    }

    private void compuestaActionPerformed() {
        this.compuesta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int id = verificacion.getIdTraza();
                jcCompuesto.setVisible(true);
                entre.setVisible(true);
                datesFromTraza = new GetDatesFromTraza(id, "desc");
                jcCompuesto.setModel(datesFromTraza.getDateFrom());
            }
        });
    }

    private void actionRadioButton() {
        group = new ButtonGroup();
        group.add(especifica);
        group.add(compuesta);
    }

//        private void rButtonEspecificoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
//        comboBetween.setVisible(false);
//    }                                                 
//
//    private void rButtonBetweenActionPerformed(java.awt.event.ActionEvent evt) {                                               
//        dateFromTraza = new GetDatesFromTraza(1, "desc");
//        comboBetween.setModel(dateFromTraza.getDateFrom());
//        comboBetween.setVisible(true);
//    }                                              
//
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        if(rButtonEspecifico.isSelected()){
//            String fecha_1 = jcomboEspecifico.getSelectedItem()+"%";
//            GetTrazaSegunFecha trazaSegunFecha = new GetTrazaSegunFecha(1, fecha_1);
//        }else if(rButtonBetween.isSelected()){
//            String fecha_1 = jcomboEspecifico.getSelectedItem()+"%";
//            String fecha_2 = comboBetween.getSelectedItem()+"%";
//            GetTrazaSegunFecha trazaSegunFecha = new GetTrazaSegunFecha(1, fecha_1, fecha_2);
//        }
//       
//    }    
}
