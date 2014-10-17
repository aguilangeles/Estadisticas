///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package frame;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JCheckBox;
//
///**
// *
// * @author aguilangeles@gmail.com
// */
//public class CheckBox {
//
//    private final JCheckBox todos;
//    private final JCheckBox fecha;
//    private final JCheckBox documento;
//    private final JCheckBox usuario;
//    private final TipoVerificacion verificacion;
//    private ActivarJCombos combo;
//
//    public CheckBox(final JCheckBox todos, final JCheckBox fecha, final JCheckBox documento, final JCheckBox usuario, final TipoVerificacion verificacion) {
//        this.todos = todos;
//        this.fecha = fecha;
//        this.documento = documento;
//        this.usuario = usuario;
//        this.verificacion = verificacion;
//
//        setActionTodos();
//        setActionFecha();
//        setActionDocument();
//        setActionUsername();
//
//    }
//
//    private void setActionTodos() {
//        this.todos.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                boolean selected = isSelected();
//                fecha.setSelected(selected);
//                documento.setSelected(selected);
//                usuario.setSelected(selected);
//                verificacion.allFilters(selected);
//                verificacion.getDate();
//                verificacion.actionComboCompuesto();
//                verificacion.actionComboEspecifico();
//                //TODO arreglar que los filtros no se pisen
//                verificacion.setModelTypedoc();
//                verificacion.actionComboTypedoc();
//                verificacion.setModelUsername();
//                verificacion.actionComboUsername();
//            }
//
//            private boolean isSelected() {
//                boolean selected;
//                if (todos.isSelected()) {
//                    selected = true;
//                } else {
//                    selected = false;
//                }
//                return selected;
//            }
//        });
//    }
//    /* TRAE LA O LAS FECHAS Y SETEA LOS VALORES */
//
//    private void setActionFecha() {
//        this.fecha.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                boolean isselsected = fechaisselected();
//                verificacion.getDate();
//                verificacion.onlyDate(isselsected);
//                verificacion.actionComboCompuesto();
//                verificacion.actionComboEspecifico();
//            }
//
//            private boolean fechaisselected() {
//                boolean isfecha;
//                if (fecha.isSelected()) {
//                    isfecha = true;
//                } else {
//
//                    isfecha = false;
//                }
//                return isfecha;
//            }
//        });
//    }
//
//    private void setActionUsername() {
//        this.usuario.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                verificacion.onlyUsername(true);
//                verificacion.actionComboUsername();
//
//            }
//        });
//    }
//
//    private void setActionDocument() {
//        this.documento.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                verificacion.onlyTypedoc(true);
//                verificacion.actionComboTypedoc();
//            }
//        });
//    }
//
//}
