/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import models.ChangeValuesOfTrazas;
import models.TrazaporVerificacion;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetDates extends JFrame {

    private final JRadioButton jrbAnyDate;
    private final JRadioButton especifica;
    private final JRadioButton compuesta;
    private final JComboBox jcEspecifico;
    private final JComboBox jctipodoc;
    private final JComboBox jctipousuario;
    private final JComboBox jcCompuesto;
    private final JLabel simple;
    private final JLabel entre;
    private final JLabel jlnumTrazas;
    private final JLabel jlnumAcep;
    private final JLabel jlnumRech;
    private final JLabel jlnumNull;
    private final TipoVerificacion verificacion;
    private final JButton next;
    private GetDatesFromTraza datesFromTraza;
    private TrazaporVerificacion trazav;

    public GetDates(JRadioButton especifica, JRadioButton compuesta, JComboBox jcEspecifico, JComboBox jcCompuesto, JLabel simple, JLabel entre, JLabel jlnumTrazas, JLabel jlnumAcep, JLabel jlnumRech, JLabel jlnumNull, TipoVerificacion verificacion, JButton jbnext, TrazaporVerificacion trazav, JComboBox tipodoc, JComboBox tipousuario, JRadioButton jrbAnyDate) throws HeadlessException {
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
        this.trazav = trazav;
        this.jctipodoc = tipodoc;
        this.jctipousuario = tipousuario;
        this.jrbAnyDate = jrbAnyDate;
        anydateActionPerformed();
        especificaActionPerformed();
        compuestaActionPerformed();
        nextActionPerformed();
    }

    private void anydateActionPerformed() {
        this.jrbAnyDate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                jcEspecifico.setEnabled(false);
                jcCompuesto.setVisible(false);
                entre.setVisible(false);
                simple.setText("");
            }
        });
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

    private void llenarJCEspecifico() {
        datesFromTraza = new GetDatesFromTraza(trazav, "asc");
        jcEspecifico.setModel(datesFromTraza.getDateFrom());
    }

    private void compuestaActionPerformed() {
        this.compuesta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llenarJCEspecifico();
                jcEspecifico.setEnabled(true);
                jcCompuesto.setVisible(true);
                simple.setText("Fecha ENTRE");
                entre.setVisible(true);
                entre.setText("Y");
                datesFromTraza = new GetDatesFromTraza(trazav, "desc");
                jcCompuesto.setModel(datesFromTraza.getDateFrom());
            }
        });
    }

    private TrazaporVerificacion changeValuesOFtraza() {

        return new ChangeValuesOfTrazas(jrbAnyDate, jcEspecifico, jctipodoc, jctipousuario, jcCompuesto, jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, trazav).getTrazav();
    }

    private void nextActionPerformed() {
        this.next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                trazav = changeValuesOFtraza();
                System.out.println(trazav);
            }
        });
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
