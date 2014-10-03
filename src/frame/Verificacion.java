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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class Verificacion extends JFrame {

    private final JLabel numTrazas;
    private final JLabel numAcept;
    private final JLabel numRech;
    private final JRadioButton calidad;
    private final JRadioButton documento;
    private ButtonGroup group;
    private int idTraza;

    public Verificacion(JLabel numTrazas, JLabel numAcept, JLabel numRech, JRadioButton calidad, JRadioButton documento) throws HeadlessException {
        this.numTrazas = numTrazas;
        this.numAcept = numAcept;
        this.numRech = numRech;
        this.calidad = calidad;
        this.documento = documento;
        actionButtonGroup();
        calidadActionPerformed();
        documentoActionPerformed();
    }

    
    private void calidadActionPerformed() {
        this.calidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idTraza=1;
                System.out.println("control de calidad basico");

            }
        });
    }

    private void documentoActionPerformed() {
        this.documento.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                idTraza=2;
                System.out.println("control  básico de documento");

            }
        });
    }

    private void actionButtonGroup() {
        group = new ButtonGroup();
        group.add(calidad);
        group.add(documento);
    }
 
}
