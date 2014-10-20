/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TipoVerificacion extends JFrame {
    
    private javax.swing.JLabel jlNameTipodoc;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JRadioButton jrbCalidad;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JCheckBox jchDocumento;
    private javax.swing.JCheckBox jchFecha;
    private javax.swing.JCheckBox jchUsuario;
    private JButton jbchecks;
    private GetCantidadVerificacion cantidades;
    private final Filtro filtro = new Filtro();
    private final EnableFilters allow;
    
    public TipoVerificacion(JRadioButton jrbCalidad, JRadioButton jrbDocumento, JCheckBox jchfecha, JCheckBox jchdocumento, JCheckBox jchusuario, GetCantidadVerificacion cantidades, JButton jbcheck, EnableFilters allow) {
        this.jchFecha = jchfecha;
        this.jchDocumento = jchdocumento;
        this.jchUsuario = jchusuario;
        this.cantidades = cantidades;
        this.jrbCalidad = jrbCalidad;
        this.jrbDocumento = jrbDocumento;
        this.jbchecks = jbcheck;
        this.allow = allow;
        calidadActionPerformed();
        documentoActionPerformed();
    }

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
        allow.allowFilters(true);
        String condition = filtro.toString();//preparo query
        setTrazaByVerification(condition);//traigo los resultados desde database
    }
    
    public Filtro getFiltro() {
        return filtro;
    }
    
    private void setAllCheckBox() {
        this.jchFecha.setEnabled(true);
        this.jchDocumento.setEnabled(true);
        this.jchUsuario.setEnabled(true);
        this.jbchecks.setEnabled(true);
    }
    
    public void setTrazaByVerification(String condition) {
        cantidades.setvalueoftraza(condition);
    }
    
}
