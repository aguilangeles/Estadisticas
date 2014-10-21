/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class EnableFilters {

    private final javax.swing.JCheckBox jchDocumento;
    private final javax.swing.JCheckBox jchFecha;
    private final javax.swing.JCheckBox jchUsuario;
    private final JButton jbchecks, jbPrevius, jbGo, jbReset;
    private boolean allow;

    public EnableFilters(JCheckBox jchDocumento, JCheckBox jchFecha, JCheckBox jchUsuario, JButton jbchecks, JButton jbPrevius, JButton jbGo, JButton jbReset) {
        this.jchDocumento = jchDocumento;
        this.jchFecha = jchFecha;
        this.jchUsuario = jchUsuario;
        this.jbchecks = jbchecks;
        this.jbPrevius = jbPrevius;
        this.jbGo = jbGo;
        this.jbReset = jbReset;
    }

    public void allowFilters(boolean isenabled) {
        allow = isenabled;
        jchDocumento.setEnabled(isenabled);
        jchFecha.setEnabled(isenabled);
        jchUsuario.setEnabled(isenabled);
        jbchecks.setEnabled(isenabled);
        jbPrevius.setEnabled(isenabled);
        jbGo.setEnabled(isenabled);
        jbReset.setEnabled(isenabled);

    }

    public void setselected() {
        jchFecha.setSelected(false);
        jchUsuario.setSelected(false);
        jbchecks.setSelected(false);
    }

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }

}
