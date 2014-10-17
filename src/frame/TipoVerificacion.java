/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
//import models.ChangeValuesOfTrazas;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TipoVerificacion extends JFrame {
    
    private javax.swing.JComboBox jComboCompuesto;
    private javax.swing.JComboBox jComboExpecifico;
    private javax.swing.JComboBox jcTipoUsuario;
    private javax.swing.JComboBox jcTipodoc;
    
    private javax.swing.JLabel jlFirstDate;
    private javax.swing.JLabel jlLastDate;
    private javax.swing.JLabel jlNameTipodoc;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JLabel jlnumAcep;
    private javax.swing.JLabel jlnumNull;
    private javax.swing.JLabel jlnumRech;
    private javax.swing.JLabel jlnumTrazas;
    private javax.swing.JRadioButton jrbCalidad;
    private javax.swing.JRadioButton jrbCompuesta;
    private javax.swing.JRadioButton jrbEspecifica;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JCheckBox jchDocumento;
    private javax.swing.JCheckBox jchFecha;
    private javax.swing.JCheckBox jchTodos;
    private javax.swing.JCheckBox jchUsuario;
    private JComboTipoDoc jComboTipoDoc;
    private JCTipoUsuario tipoUsuario;
//    private GetDates dates;
    private GetCantidadVerificacion cantidadverificacion;
    private ActivarJCombos combo;
    private GetCantidadVerificacion cantidades;
    private Filtro filtro = new Filtro();
    
    public TipoVerificacion() {
    }
    
    public TipoVerificacion(JRadioButton jrbCalidad, JRadioButton jrbDocumento, JCheckBox jchfecha, JCheckBox jchdocumento, JCheckBox jchusuario, GetCantidadVerificacion cantidades) {
//        this.jcTipoUsuario = jcTipoUsuario;
//        this.jcTipodoc = jcTipodoc;
//        this.jlFirstDate = jlFirstDate;
//        this.jlLastDate = jlLastDate;
//        this.jchTodos = jchtodos;
        this.jchFecha = jchfecha;
        this.jchDocumento = jchdocumento;
        this.jchUsuario = jchusuario;
        this.cantidades = cantidades;
        this.jrbCalidad=jrbCalidad;
        this.jrbDocumento=jrbDocumento;
//        this.combo = new ActivarJCombos(jrbCompuesta, jrbEspecifica, jcTipoUsuario, jcTipodoc);
        calidadActionPerformed();
        documentoActionPerformed();
    }
//    public TipoVerificacion(final JComboBox jComboCompuesto, final JComboBox jComboExpecifico, JComboBox jcTipoUsuario, JComboBox jcTipodoc, JLabel jlFirstDate, JLabel jlLastDate, JLabel jlNameTipodoc, JLabel jlUsername, JLabel jlnumAcep, JLabel jlnumNull, JLabel jlnumRech, JLabel jlnumTrazas, JRadioButton jrbCalidad, JRadioButton jrbCompuesta, JRadioButton jrbDocumento, JRadioButton jrbEspecifica, JCheckBox jchtodos, JCheckBox jchfecha, JCheckBox jchdocumento, JCheckBox jchusuario, GetCantidadVerificacion cantidades) {
//        this.jComboCompuesto = jComboCompuesto;
//        this.jComboExpecifico = jComboExpecifico;
//        this.jcTipoUsuario = jcTipoUsuario;
//        this.jcTipodoc = jcTipodoc;
//        this.jlFirstDate = jlFirstDate;
//        this.jlLastDate = jlLastDate;
//        this.jlNameTipodoc = jlNameTipodoc;
//        this.jlUsername = jlUsername;
//        this.jlnumAcep = jlnumAcep;
//        this.jlnumNull = jlnumNull;
//        this.jlnumRech = jlnumRech;
//        this.jlnumTrazas = jlnumTrazas;
//        this.jrbCalidad = jrbCalidad;
//        this.jrbCompuesta = jrbCompuesta;
//        this.jrbDocumento = jrbDocumento;
//        this.jrbEspecifica = jrbEspecifica;
//        this.jchTodos = jchtodos;
//        this.jchFecha = jchfecha;
//        this.jchDocumento = jchdocumento;
//        this.jchUsuario = jchusuario;
//        this.cantidades = cantidades;
//        this.combo = new ActivarJCombos(jrbCompuesta, jrbEspecifica, jcTipoUsuario, jcTipodoc);
//        calidadActionPerformed();
//        documentoActionPerformed();
//    }

    /**
     * *********************************************************************************
     * PREPARO LOS ELEMENTOS PARA FILTRAR SEGUN LA VERIFICACION SELECCIONADA
     * *********************************************************************************
     */
    private void calidadActionPerformed() {
        this.jrbCalidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtro.setId(1);
                prepareFrame();
            }
        });
    }
    
    private void documentoActionPerformed() {
        this.jrbDocumento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtro.setId(2);
                prepareFrame();
            }
        });
    }
    
    private void prepareFrame() {
        setAllCheckBox();//habilito los filtros
//        String condition = new ChangeValuesOfTrazas().valuedefault();//preparo query
        String condition = filtro.toString();//preparo query
        setTrazaByVerification(condition);//traigo los resultados desde database
    }

    /**
     * *********************************************************************************
     * TRAIGO LOS RESULTADOS DE LA SELECCION SEGUN LA FECHA
     * *********************************************************************************
     */
    public void actionComboEspecifico() {
        this.jComboExpecifico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                setTrazaByDate();
            }
        });
    }
    
    public void actionComboCompuesto() {
        jComboCompuesto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                setTrazaByDate();
            }
            
        });
    }

    public Filtro getFiltro() {
        return filtro;
    }
    
    
//    private void setTrazaByDate() {
//        String condition = new ChangeValuesOfTrazas(traza).dateCondition(jComboExpecifico, jComboCompuesto);
//        setTrazaByVerification(condition);
//    }
//    
//    public void getDate() {
//        dates = new GetDates(jrbEspecifica, jrbCompuesta, jComboExpecifico,
//                jComboCompuesto, jlFirstDate, jlLastDate, getTraza());
//        
//    }

    /**
     * *********************************************************************************
     * HABILITO LAS ACCIONES DE TIPO DE DOCUMENTO Y DE TIPO DE USUARIO
     * *********************************************************************************
     */
//    public void setModelUsername() {
//        jcTipoUsuario.setModel(cantidadverificacion.getUserCombo());
//    }
//    
//    public void setModelTypedoc() {
//        jcTipodoc.setModel(cantidadverificacion.getDoctypeCombo());
//    }
//    
//    public void actionComboUsername() {
//        this.jcTipoUsuario.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = jcTipoUsuario.getSelectedItem() + "";
//                jlUsername.setText("Usuario: " + username);
//                traza.setUsername(username);
//                String condition = new ChangeValuesOfTrazas().usernameCondition(jcTipoUsuario);
//                setTrazaByVerification(condition);
//            }
//        });
//    }
//    
//    public void actionComboTypedoc() {
//        this.jcTipodoc.addActionListener(new ActionListener() {
//            
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String doctype = jcTipodoc.getSelectedItem() + "";
//                traza.setDoctype(doctype);
//                jlNameTipodoc.setText("Tipo de Doc : " + doctype);
//                String condition = new ChangeValuesOfTrazas().typedocCondition(jcTipodoc);
//                setTrazaByVerification(condition);
//            }
//        });
//    }

//
    private void setAllCheckBox() {
//        this.jchTodos.setEnabled(true);
        this.jchFecha.setEnabled(true);
        this.jchDocumento.setEnabled(true);
        this.jchUsuario.setEnabled(true);
    }
    
    public void setTrazaByVerification(String condition) {
        cantidades.setvalueoftraza(condition);
//        cantidadverificacion = new GetCantidadVerificacion(condition, traza, jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull);
//        traza = cantidadverificacion.getTraza();
    }
    
//    public int getIdTraza() {
//        return traza.getIdVerificacion();
//    }
//    
//    public ValuesTraza getTraza() {
//        return traza;
//    }
//    
//    public void setTraza(ValuesTraza traza) {
//        this.traza = traza;
//    }

    /**
     * *********************************************************************************
     * ACTIVAR LOS FILTROS SEGUN EL COMBO BOX SELECCIONADO
     * ********************************************************************************
     */
    public void allFilters(boolean select) {
        combo.setAll(select);
    }
    
    public void onlyDate(boolean select) {
        combo.setdateGroup(select);
    }
    
    public void onlyTypedoc(boolean select) {
        combo.setTypeDoc(select);
        
    }
    
    public void onlyUsername(boolean select) {
        combo.setUsername(select);
    }
}
