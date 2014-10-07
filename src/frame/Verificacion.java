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

    private final JLabel numTrazas;
    private final JLabel numAcept;
    private final JLabel numRech;
    private final JLabel numNull;
    private final JRadioButton calidad;
    private final JRadioButton documento;
    private final JComboBox jcTipoDoc, jcTipoUsuario;
    private final JLabel jcNameTipoDoc;
    private ButtonGroup group;
    private int idTraza;
    private JComboTipoDoc jComboTipoDoc;
    private JCTipoUsuario tipoUsuario;
    private TrazaporVerificacion traza;

    public Verificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech,
            JLabel numNull, JRadioButton calidad, JRadioButton documento,
            JComboBox jcTipodoc, JLabel jlNameTipodoc, JComboBox jcTipoUsuario,
            Object par9, TrazaporVerificacion traza) throws HeadlessException {
        this.numTrazas = numTrazas;
        this.numAcept = numAcept;
        this.numRech = numRech;
        this.calidad = calidad;
        this.numNull = numNull;
        this.documento = documento;
        this.jcTipoDoc = jcTipodoc;
        this.jcNameTipoDoc = jlNameTipodoc;
        this.jcTipoUsuario = jcTipoUsuario;
        this.traza = traza;
        actionButtonGroup();
        calidadActionPerformed();
        documentoActionPerformed();
    }

    private void calidadActionPerformed() {
        this.calidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idTraza = 1;
                setValuesOfVerificacion();
                llenarTipoDoc();
                llenarTipoUsuario();

            }
        });
    }

    private void documentoActionPerformed() {
        this.documento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                idTraza = 2;
                setValuesOfVerificacion();
                llenarTipoDoc();
                llenarTipoUsuario();
            }
        });
    }

    private void setValuesOfVerificacion() {
        GetCantidadVerificacion cantidadVerificacion
                = new GetCantidadVerificacion(numTrazas, numAcept, numRech, numNull, idTraza, ";");
    }

    private void llenarTipoDoc() {
        jComboTipoDoc = new JComboTipoDoc(idTraza, ";");
        jcTipoDoc.setModel(jComboTipoDoc.getModel());
    }

    private void llenarTipoUsuario() {
        tipoUsuario = new JCTipoUsuario(idTraza, ";");
        jcTipoUsuario.setModel(tipoUsuario.getModel());

    }

    private void actionButtonGroup() {
        group = new ButtonGroup();
        group.add(calidad);
        group.add(documento);
    }

    public int getIdTraza() {
        if (calidad.isSelected()) {
            idTraza = 1;
        }
        if (documento.isSelected()) {
            idTraza = 2;
        }
        return idTraza;
    }

}
