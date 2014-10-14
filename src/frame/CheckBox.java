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

    public CheckBox(final JCheckBox todos, final JCheckBox fecha, final JCheckBox documento, final JCheckBox usuario, final TipoVerificacion verificacion) {
        this.todos = todos;
        this.fecha = fecha;
        this.documento = documento;
        this.usuario = usuario;
        this.verificacion = verificacion;

        setActionTodos(fecha, documento, usuario, verificacion, todos);
        setActionFecha();
        setActionDocument();
        setActionUsername();

    }

    private void setActionUsername() {
        this.usuario.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                verificacion.enableUserName(true);
                verificacion.setJCUserNAme();

            }
        });
    }

    private void setActionDocument() {
        this.documento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                verificacion.enableDoctype(true);
                verificacion.setJCDoctype();
            }
        });
    }

    private void setActionFecha() {
        this.fecha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                verificacion.enableDate(true);
                verificacion.getDate();
//                verificacion.setComboCompuesto();
//                verificacion.setComboEspecifico();

            }
        });
    }

    private void setActionTodos(final JCheckBox fecha1, final JCheckBox documento1, final JCheckBox usuario1, final TipoVerificacion verificacion1, final JCheckBox todos1) {
        this.todos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean selected = selected();
                fecha1.setSelected(selected);
                documento1.setSelected(selected);
                usuario1.setSelected(selected);
                verificacion1.habilitarFiltros(selected);
                verificacion1.getDate();
                verificacion1.setdoctype();
                verificacion1.setusername();
            }

            private boolean selected() {
                boolean selected;
                if (todos1.isSelected()) {
                    selected = true;
                } else {
                    selected = false;
                }
                return selected;
            }
        });
    }

}
