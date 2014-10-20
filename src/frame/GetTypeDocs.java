/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetTypeDocs {

    private final JComboBox typedoc;
    private final JLabel nametypedoc;

    public GetTypeDocs(JComboBox typedoc, JLabel nametypedoc) {
        this.typedoc = typedoc;
        this.nametypedoc = nametypedoc;
//        actionTypeCombo(typedoc);
    }

    private void actionTypeCombo(final JComboBox typedoc1) {
        typedoc1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                nametypedoc.setText("" + typedoc1.getSelectedItem());

            }
        }
        );
    }

    public void activarTypeDoc(String condicion, boolean isActiveDoc) {
        typedoc.setEnabled(true);
        if (isActiveDoc) {
            
            JComboTipoDoc jComboTipoDoc = new JComboTipoDoc(condicion);
            typedoc.setModel(jComboTipoDoc.getModel());
            actionTypeCombo(typedoc);
        } else {
            typedoc.setEnabled(false);
            typedoc.setModel(getDefault());
            nametypedoc.setText("-----");

        }

    }

    private DefaultComboBoxModel getDefault() {
        DefaultComboBoxModel defaultDco = new DefaultComboBoxModel();
        defaultDco.addElement("Tipo de Documento");
        return defaultDco;
    }

}
