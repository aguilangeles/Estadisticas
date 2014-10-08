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
import models.TrazaporVerificacion;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Verificacion extends JFrame {

    private ButtonGroup group;
    private int idTraza;
    private String condition = ";";
    TrazaporVerificacion traza = new TrazaporVerificacion();

    private javax.swing.JComboBox jComboCompuesto;
    private javax.swing.JComboBox jComboExpecifico;
    private javax.swing.JButton jbAddDate;
    private javax.swing.JButton jbAddDoctype;
    private javax.swing.JButton jbAddUsername;
    private javax.swing.JButton jbNextDate;
    private javax.swing.JButton jbNextUsername;
    private javax.swing.JButton jbnextDoctype;
    private javax.swing.JComboBox jcTipoUsuario;
    private javax.swing.JComboBox jcTipodoc;
    private javax.swing.JLabel jlFirstDate;
    private javax.swing.JLabel jlLastDate;
    private javax.swing.JLabel jlNameTipodoc;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JLabel jlnumAcep;
    private javax.swing.JLabel jlnumNull;
    private javax.swing.JLabel jlnumRech;
    private javax.swing.JLabel jlnumTrazas;
    private javax.swing.JRadioButton jrbCalidad;
    private javax.swing.JRadioButton jrbCompuesta;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JRadioButton jrbEspecifica;
    private JComboTipoDoc jComboTipoDoc;
    private JCTipoUsuario tipoUsuario;
    private GetDates dates;

    public Verificacion(JComboBox jComboCompuesto, JComboBox jComboExpecifico, JButton jbAddDate, JButton jbAddDoctype, JButton jbAddUsername, JButton jbNextDate, JButton jbNextUsername, JButton jbnextDoctype, JComboBox jcTipoUsuario, JComboBox jcTipodoc, JLabel jlFirstDate, JLabel jlLastDate, JLabel jlNameTipodoc, JLabel jlUsername, JLabel jlnumAcep, JLabel jlnumNull, JLabel jlnumRech, JLabel jlnumTrazas, JRadioButton jrbCalidad, JRadioButton jrbCompuesta, JRadioButton jrbDocumento, JRadioButton jrbEspecifica) {
        this.jComboCompuesto = jComboCompuesto;
        this.jComboExpecifico = jComboExpecifico;
        this.jbAddDate = jbAddDate;
        this.jbAddDoctype = jbAddDoctype;
        this.jbAddUsername = jbAddUsername;
        this.jbNextDate = jbNextDate;
        this.jbNextUsername = jbNextUsername;
        this.jbnextDoctype = jbnextDoctype;
        this.jcTipoUsuario = jcTipoUsuario;
        this.jcTipodoc = jcTipodoc;
        this.jlFirstDate = jlFirstDate;
        this.jlLastDate = jlLastDate;
        this.jlNameTipodoc = jlNameTipodoc;
        this.jlUsername = jlUsername;
        this.jlnumAcep = jlnumAcep;
        this.jlnumNull = jlnumNull;
        this.jlnumRech = jlnumRech;
        this.jlnumTrazas = jlnumTrazas;
        this.jrbCalidad = jrbCalidad;
        this.jrbCompuesta = jrbCompuesta;
        this.jrbDocumento = jrbDocumento;
        this.jrbEspecifica = jrbEspecifica;
        calidadActionPerformed();
        documentoActionPerformed();
    }

    private void habilitarFiltros() {
        jrbEspecifica.setEnabled(true);
        jrbCompuesta.setEnabled(true);
        jcTipodoc.setEnabled(true);
        jcTipoUsuario.setEnabled(true);
        dates = new GetDates(jrbEspecifica, jrbCompuesta, jComboExpecifico,
                jComboCompuesto, jlFirstDate, jlLastDate, jlnumTrazas, jlnumAcep, jlnumRech,
                jlnumNull, this, jbNextDate, getTraza(), jcTipodoc, jcTipoUsuario);
    }

    public Verificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech, JLabel numNull, JComboBox jcTipoDoc, JComboBox jcTipoUsuario, TrazaporVerificacion traza) throws HeadlessException {
        this.jlnumTrazas = numTrazas;
        this.jlnumAcep = numAcept;
        this.jlnumRech = numRech;
        this.jlnumNull = numNull;
        this.jcTipodoc = jcTipoDoc;
        this.jcTipoUsuario = jcTipoUsuario;
    }

    private void calidadActionPerformed() {
        this.jrbCalidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traza.setIdVerificacion(1);
                setValuesOfVerificacion(condition);
                habilitarFiltros();

            }
        });
    }

    private void documentoActionPerformed() {
        this.jrbDocumento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traza.setIdVerificacion(2);
                setValuesOfVerificacion(condition);
                habilitarFiltros();
            }
        });
    }

    public void setValuesOfVerificacion(String condition) {
        traza = new GetCantidadVerificacion(traza, condition).getTraza();
        jlnumTrazas.setText("total trazas: " + traza.getTrazas());
        jlnumAcep.setText("total aceptadas: " + traza.getAceptadas());
        jlnumRech.setText("total rechazadas: " + traza.getRechazadas());
        jlnumNull.setText("total nulas: " + traza.getNulas());
        llenarTipoDoc(condition);
        llenarTipoUsuario(condition);
    }

    public void llenarTipoDoc(String condition) {
        jComboTipoDoc = new JComboTipoDoc(traza.getIdVerificacion(), condition);
        jcTipodoc.setModel(jComboTipoDoc.getModel());
    }

    public void llenarTipoUsuario(String condition) {
        tipoUsuario = new JCTipoUsuario(traza.getIdVerificacion(), condition);
        jcTipoUsuario.setModel(tipoUsuario.getModel());

    }

    public int getIdTraza() {

        return traza.getIdVerificacion();
    }

    public TrazaporVerificacion getTraza() {
        return traza;
    }

    public void setTraza(TrazaporVerificacion traza) {
        this.traza = traza;
    }

}
