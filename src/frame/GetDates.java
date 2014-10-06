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
import javax.swing.JButton;
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
    private final JLabel jlnumTrazas;
    private final JLabel jlnumAcep;
    private final JLabel jlnumRech;
    private final JLabel jlnumNull;
    private final Verificacion verificacion;
    private final JButton next;
    private GetDatesFromTraza datesFromTraza;
    private int id;

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre, JLabel jlnumTrazas, JLabel jlnumAcep, JLabel jlnumRech, JLabel jlnumNull, Verificacion verificacion, JButton jbnext) throws HeadlessException {
        this.especifica = especifica;
        this.compuesta = compuesta;
        this.jcEspecifico = jcEspecifico;
        this.jcCompuesto = jcCompuesto;
        this.simple = simple;
        this.entre = entre;
        this.jlnumTrazas = jlnumTrazas;
        this.jlnumAcep = jlnumAcep;
        this.jlnumRech = jlnumRech;
        this.jlnumNull = jlnumNull;
        this.verificacion = verificacion;
        this.next = jbnext;

        actionRadioButton();
        especificaActionPerformed();
        compuestaActionPerformed();
        nextActionPerformed();
    }


    private void llenarJCEspecifico() {
        id = verificacion.getIdTraza();
        datesFromTraza = new GetDatesFromTraza(id, "asc");
        jcEspecifico.setModel(datesFromTraza.getDateFrom());
    }
    private void especificaActionPerformed() {
        this.especifica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                int id = verificacion.getIdTraza();
                llenarJCEspecifico();
                jcCompuesto.setVisible(true);
                simple.setText("Fecha ENTRE");
                entre.setVisible(true);
                entre.setText("Y");
                datesFromTraza = new GetDatesFromTraza(id, "desc");
                jcCompuesto.setModel(datesFromTraza.getDateFrom());

            }

        });
    }


    private GetCantidadVerificacion changeValuesOFtraza(int id1) {
        GetCantidadVerificacion cantidadVerificacion;
        String condition;
        String firstDate = jcEspecifico.getSelectedItem() + "%";
        if (!jcCompuesto.isVisible()) {
            condition = " and fecha_control like '" + firstDate + "';";

        } else {
            String lastDate = jcCompuesto.getSelectedItem() + "%";
            condition = " and fecha_control "
                    + " between '" + firstDate + "'"
                    + " and '" + lastDate + "';";
        }
        cantidadVerificacion
                = new GetCantidadVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, id1, condition);
        return cantidadVerificacion;
    }
    
    private void nextActionPerformed() {
        this.next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                id = verificacion.getIdTraza();
                changeValuesOFtraza(id);
            }
        });
    }

    private void actionRadioButton() {
        group = new ButtonGroup();
        group.add(especifica);
        group.add(compuesta);
    }

//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
//        if(rButtonEspecifico.isSelected()){
//            String fecha_1 = jcomboEspecifico.getSelectedItem()+"%";
//            GetTrazaSegunFecha trazaSegunFecha = new GetTrazaSegunFecha(1, fecha_1);
//        }else if(rButtonBetween.isSelected()){
//            String fecha_1 = jcomboEspecifico.getSelectedItem()+"%";
//            String fecha_2 = comboBetween.getSelectedItem()+"%";
//            GetTrazaSegunFecha trazaSegunFecha = new GetTrazaSegunFecha(1, fecha_1, fecha_2);
//        }
//    }    
}
