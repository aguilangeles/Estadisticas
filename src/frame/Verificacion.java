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
import models.TrazaporVerificacion;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Verificacion extends JFrame {

    private JLabel numTrazas;
    private JLabel numAcept;
    private JLabel numRech;
    private JLabel numNull;
    private JRadioButton calidad;
    private JRadioButton documento;
    private JComboBox jcTipoDoc, jcTipoUsuario;
    private JLabel jcNameTipoDoc;
    private ButtonGroup group;
    private int idTraza;
    private JComboTipoDoc jComboTipoDoc;
    private JCTipoUsuario tipoUsuario;
    private TrazaporVerificacion traza;
    private String condition = ";";

    public Verificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech, JLabel numNull, JRadioButton calidad, JRadioButton documento, JComboBox jcTipodoc, JLabel jlNameTipodoc, JComboBox jcTipoUsuario, TrazaporVerificacion atraza) throws HeadlessException {
        this.numTrazas = numTrazas;
        this.numAcept = numAcept;
        this.numRech = numRech;
        this.calidad = calidad;
        this.numNull = numNull;
        this.documento = documento;
        this.jcTipoDoc = jcTipodoc;
        this.jcNameTipoDoc = jlNameTipodoc;
        this.jcTipoUsuario = jcTipoUsuario;
        this.traza = atraza;
        actionButtonGroup();
        calidadActionPerformed();
        documentoActionPerformed();
    }

    public Verificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech, JLabel numNull, JComboBox jcTipoDoc, JComboBox jcTipoUsuario, TrazaporVerificacion traza) throws HeadlessException {
        this.numTrazas = numTrazas;
        this.numAcept = numAcept;
        this.numRech = numRech;
        this.numNull = numNull;
        this.jcTipoDoc = jcTipoDoc;
        this.jcTipoUsuario = jcTipoUsuario;
        this.traza = traza;
    }


    private void calidadActionPerformed() {
        this.calidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traza.setIdVerificacion(1);
                setValuesOfVerificacion(condition);

            }
        });
    }

    private void documentoActionPerformed() {
        this.documento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traza.setIdVerificacion(2);
                setValuesOfVerificacion(condition);
            }
        });
    }

    public void setValuesOfVerificacion(String condition) {
        traza = new GetCantidadVerificacion(traza, condition).getTraza();
        numTrazas.setText("total trazas: " + traza.getTrazas());
        numAcept.setText("total aceptadas: " + traza.getAceptadas());
        numRech.setText("total rechazadas: " + traza.getRechazadas());
        numNull.setText("total nulas: " + traza.getNulas());
        llenarTipoDoc(condition);
        llenarTipoUsuario(condition);
    }

    public void llenarTipoDoc(String condition) {
        jComboTipoDoc = new JComboTipoDoc(traza.getIdVerificacion(), condition);
        jcTipoDoc.setModel(jComboTipoDoc.getModel());
    }

    public void llenarTipoUsuario(String condition) {
        tipoUsuario = new JCTipoUsuario(traza.getIdVerificacion(), condition);
        jcTipoUsuario.setModel(tipoUsuario.getModel());

    }

    private void actionButtonGroup() {
        group = new ButtonGroup();
        group.add(calidad);
        group.add(documento);
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
