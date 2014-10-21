/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import models.ChangeValuesOfTrazas;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetTypedocs {

    private final JComboBox typedoc;
    private final JLabel nametypedoc;
    private final Filtro filtro;
    private final JCTiipoDoc jComboTipoDoc = new JCTiipoDoc();

    public GetTypedocs(JComboBox typedoc, JLabel nametypedoc, Filtro filtro) {
        this.typedoc = typedoc;
        this.nametypedoc = nametypedoc;
        this.filtro = filtro;

    }

    private void actionTypeCombo(final JComboBox typedoc1) {
        typedoc1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //cuando se selecciona el valor, se graba en el jlabel 
                // y de paso se obtiene el id, para usar en el filtro.
                String valor = "" + typedoc1.getSelectedItem();
                int id = jComboTipoDoc.getiddocument(valor);
                String adoc = new ChangeValuesOfTrazas().typedocCondition(id);
                filtro.setDocumento(adoc);
                nametypedoc.setText(valor);
            }
        }
        );
    }

    public void activar(String condicion) {
        typedoc.setEnabled(true);
        jComboTipoDoc.getdocumentos(condicion);
        typedoc.setModel(jComboTipoDoc.getModel());
        actionTypeCombo(typedoc);
    }

    public void desactivar() {
        typedoc.setEnabled(false);
        typedoc.setModel(getDefault());
        nametypedoc.setText("-----");
        filtro.setDocumento("");
    }

    private DefaultComboBoxModel getDefault() {
        DefaultComboBoxModel defaultDco = new DefaultComboBoxModel();
        defaultDco.addElement("Tipo de Documento");
        return defaultDco;
    }

}
