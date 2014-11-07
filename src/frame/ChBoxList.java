/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class ChBoxList {

    private final javax.swing.JCheckBox jchDocumento;
    private final javax.swing.JCheckBox jchFecha;
    private final javax.swing.JCheckBox jchUsuario;
    private final List<String> checks = new ArrayList<>();

    public ChBoxList(JCheckBox jchFecha, JCheckBox jchDocumento, JCheckBox jchUsuario) {
        this.jchDocumento = jchDocumento;
        this.jchFecha = jchFecha;
        this.jchUsuario = jchUsuario;
        actionListenerChecks(jchFecha);
        actionListenerChecks(jchDocumento);
        actionListenerChecks(jchUsuario);
    }

    private void actionListenerChecks(final JCheckBox aCheck) {
        aCheck.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (aCheck.isSelected()) {
                    if (!checks.contains(aCheck.getText())) {
                        checks.add(aCheck.getText());
                    }
                } else {
                    checks.remove(aCheck.getText());
                }

            }
        });
    }

    public List<String> getChecks() {
        return checks;
    }

    public void remove() {
        boolean removeAll = checks.removeAll(checks);
    }

}
