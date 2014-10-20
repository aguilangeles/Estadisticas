/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documento;

import documento.JCTiipoDoc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetTypedocs {

    private final JComboBox typedoc;
    private final JLabel nametypedoc;
    private final JCTiipoDoc jComboTipoDoc = new JCTiipoDoc();

    public GetTypedocs(JComboBox typedoc, JLabel nametypedoc) {
        this.typedoc = typedoc;
        this.nametypedoc = nametypedoc;
    }

    private void actionTypeCombo(final JComboBox typedoc1) {
        typedoc1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //cuando se selecciona el valor, se graba en el jlabel 
                // y de paso se obtiene el id, para usar en el filtro.
                String valor = "" + typedoc1.getSelectedItem();
                int id = jComboTipoDoc.getiddocument(valor);
                String result = id + "-" + valor;
                nametypedoc.setText(result);
            }
        }
        );
    }

    public void activarTypeDoc(String condicion, boolean isActiveDoc) {
        typedoc.setEnabled(true);
        if (isActiveDoc) {
            //se llena el combo y se le agrega la action
            jComboTipoDoc.getdocumentos(condicion);
            typedoc.setModel(jComboTipoDoc.getModel());
            actionTypeCombo(typedoc);
        } else {
            //se vuelven los valores a default
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
