/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class GetUsername {

    private final JComboBox usuario;
    private final JLabel nameusuario;
    private final JCTipoUsuario typeuser = new JCTipoUsuario();
    private final Filtro filtro;

    public GetUsername(JComboBox user, JLabel nameusuario, Filtro filtro) {
        this.usuario = user;
        this.nameusuario = nameusuario;
        this.filtro = filtro;
    }

    private void actionUserCombo(final JComboBox username1) {
        username1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //cuando se selecciona el valor, se graba en el jlabel 
                // y de paso se obtiene el id, para usar en el filtro.
                String nombre = "" + username1.getSelectedItem();
                int id = typeuser.getiddocument(nombre);
                String result = id + "-" + nombre;
                nameusuario.setText(result);
            }
        }
        );
    }

    public void activarUsername(String condicion, boolean isActiveUser) {
        usuario.setEnabled(true);
        if (isActiveUser) {
            //se llena el combo y se le agrega la action
            typeuser.getUsuarios(condicion);
            usuario.setModel(typeuser.getModel());
            actionUserCombo(usuario);
        } else {
            //se vuelven los valores a default
            usuario.setEnabled(false);
            usuario.setModel(getDefault());
            nameusuario.setText("-----");

        }

    }

    private DefaultComboBoxModel getDefault() {
        DefaultComboBoxModel defaultDco = new DefaultComboBoxModel();
        defaultDco.addElement("Usuario");
        return defaultDco;
    }
}
