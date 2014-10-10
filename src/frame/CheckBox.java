/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class CheckBox {

    private final JCheckBox todos;
    private final JCheckBox fecha;
    private final JCheckBox documento;
    private final JCheckBox usuario;
    private final TipoVerificacion verificacion;
    private final GetDates dates;
    public CheckBox(final JCheckBox todos, final JCheckBox fecha, final JCheckBox documento, final JCheckBox usuario, final TipoVerificacion verificacion, GetDates dates) {
        this.todos = todos;
        this.fecha = fecha;
        this.documento = documento;
        this.usuario = usuario;
        this.verificacion = verificacion;
        this.dates=dates;

        this.todos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean selected = selected();
                fecha.setSelected(selected);
                documento.setSelected(selected);
                usuario.setSelected(selected);
                verificacion.habilitarFiltros(selected);
                verificacion.getDate();
                verificacion.setdoctype();
                verificacion.setusername();
            }

            private boolean selected() {
                boolean selected;
                if (todos.isSelected()) {
                    selected = true;
                } else {
                    selected = false;
                }
                return selected;
            }
        });

    }

}
