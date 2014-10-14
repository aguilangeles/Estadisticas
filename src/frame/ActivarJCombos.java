/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ActivarJCombos {

    private final javax.swing.JComboBox jComboUsername;
    private final javax.swing.JComboBox jComboTypedoc;
    private final javax.swing.JRadioButton jrbCompuesta;
    private final javax.swing.JRadioButton jrbEspecifica;

    public ActivarJCombos(JRadioButton jrbCompuesto, JRadioButton jrbEspecifico, JComboBox jComboUsername, JComboBox jComboTypedoc) {
        this.jrbCompuesta = jrbCompuesto;
        this.jrbEspecifica = jrbEspecifico;
        this.jComboUsername = jComboUsername;
        this.jComboTypedoc = jComboTypedoc;
    }

    public void setAll(boolean enabled) {
        jrbCompuesta.setEnabled(enabled);
        jrbEspecifica.setEnabled(enabled);
        jComboTypedoc.setEnabled(enabled);
        jComboUsername.setEnabled(enabled);

    }
    public void setdateGroup(boolean enabled){
        jrbCompuesta.setEnabled(enabled);
        jrbEspecifica.setEnabled(enabled);
        
    }

    public void setCompuesto(boolean enabled) {
        jrbCompuesta.setEnabled(enabled);

    }

    public void setEspecifico(boolean enabled) {
        jrbEspecifica.setEnabled(enabled);

    }

    public void setTypeDoc(boolean enabled) {
        jComboTypedoc.setEnabled(enabled);

    }

    public void setUsername(boolean enabled) {
        jComboUsername.setEnabled(enabled);

    }

}
