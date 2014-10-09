/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.ButtonGroup;
import models.ChangeValuesOfTrazas;
import models.TrazaporVerificacion;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class PanelSeleccion extends javax.swing.JFrame {

    TrazaporVerificacion traza = new TrazaporVerificacion();
    private boolean selected;
    private ButtonGroup group;

    /**
     * Creates new form PanelSeleccion
     */
    public PanelSeleccion() {
        initComponents();
        actionVerificacionButtonGroup();
        actionDatesRadioButton();
        this.setResizable(false);
        jComboExpecifico.setEnabled(false);
        jComboCompuesto.setVisible(false);
        jlLastDate.setVisible(false);
        jrbAnyDate.setEnabled(false);
        jrbEspecifica.setEnabled(false);
        jrbCompuesta.setEnabled(false);
        jcTipodoc.setEnabled(false);
        jcTipoUsuario.setEnabled(false);
        TipoVerificacion verificacion = new TipoVerificacion(jComboCompuesto,
                jComboExpecifico, jbAddDate, jbAddDoctype, jbAddUsername,
                jbNextDate, jbNextUsername, jbnextDoctype, jcTipoUsuario,
                jcTipodoc, jlFirstDate, jlLastDate, jlNameTipodoc, jlUsername,
                jlnumAcep, jlnumNull, jlnumRech, jlnumTrazas, jrbCalidad,
                jrbCompuesta, jrbDocumento, jrbEspecifica, jrbAnyDate);

        this.traza = verificacion.getTraza();

    }

    private void actionVerificacionButtonGroup() {
        group = new ButtonGroup();
        group.add(jrbCalidad);
        group.add(jrbDocumento);
    }

    private void actionDatesRadioButton() {
        group = new ButtonGroup();
        group.add(jrbAnyDate);
        group.add(jrbEspecifica);
        group.add(jrbCompuesta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpVerificacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jrbCalidad = new javax.swing.JRadioButton();
        jrbDocumento = new javax.swing.JRadioButton();
        jlnumTrazas = new javax.swing.JLabel();
        jlnumAcep = new javax.swing.JLabel();
        jlnumRech = new javax.swing.JLabel();
        jlnumNull = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jcTipodoc = new javax.swing.JComboBox();
        jlNameTipodoc = new javax.swing.JLabel();
        jbnextDoctype = new javax.swing.JButton();
        jbAddDoctype = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jcTipoUsuario = new javax.swing.JComboBox();
        jlUsername = new javax.swing.JLabel();
        jbNextUsername = new javax.swing.JButton();
        jbAddUsername = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jrbEspecifica = new javax.swing.JRadioButton();
        jrbCompuesta = new javax.swing.JRadioButton();
        jlFirstDate = new javax.swing.JLabel();
        jlLastDate = new javax.swing.JLabel();
        jbNextDate = new javax.swing.JButton();
        jbAddDate = new javax.swing.JButton();
        jComboExpecifico = new javax.swing.JComboBox();
        jComboCompuesto = new javax.swing.JComboBox();
        jrbAnyDate = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 255, 216));

        jpVerificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione Tipo de Verificación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 2, 18), new java.awt.Color(255, 153, 153))); // NOI18N
        jpVerificacion.setOpaque(false);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jrbCalidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbCalidad.setText("Control básico de Calidad");

        jrbDocumento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbDocumento.setText("Contol básico de Documento");

        jlnumTrazas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlnumTrazas.setText("Cantidad de trazas:");

        jlnumAcep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlnumAcep.setText("Total Aceptados");

        jlnumRech.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlnumRech.setText("Total Rechazados");

        jlnumNull.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlnumNull.setText("Total Null");

        javax.swing.GroupLayout jpVerificacionLayout = new javax.swing.GroupLayout(jpVerificacion);
        jpVerificacion.setLayout(jpVerificacionLayout);
        jpVerificacionLayout.setHorizontalGroup(
            jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVerificacionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbCalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlnumTrazas, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jlnumAcep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlnumRech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlnumNull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpVerificacionLayout.setVerticalGroup(
            jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVerificacionLayout.createSequentialGroup()
                .addGroup(jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpVerificacionLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jrbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jrbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpVerificacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpVerificacionLayout.createSequentialGroup()
                                .addComponent(jlnumTrazas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlnumAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlnumRech, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlnumNull, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especifique Tipo de Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 2, 18), new java.awt.Color(255, 153, 153))); // NOI18N
        jPanel4.setOpaque(false);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jcTipodoc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTipodoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcTipodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipodocActionPerformed(evt);
            }
        });

        jlNameTipodoc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlNameTipodoc.setText("Tipo de Documento");

        jbnextDoctype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-20.png"))); // NOI18N

        jbAddDoctype.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-20.png"))); // NOI18N
        jbAddDoctype.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jcTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNameTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnextDoctype, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddDoctype, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jbnextDoctype)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAddDoctype))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jcTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlNameTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especifique Nombre De Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 2, 18), new java.awt.Color(255, 153, 153))); // NOI18N
        jPanel5.setOpaque(false);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jcTipoUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoUsuarioActionPerformed(evt);
            }
        });

        jlUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlUsername.setText("Usuario");

        jbNextUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-20.png"))); // NOI18N

        jbAddUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-20.png"))); // NOI18N
        jbAddUsername.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jcTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNextUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAddUsername)))
                .addGap(41, 41, 41))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especifique la o las fechas de filtrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 2, 18), new java.awt.Color(255, 153, 153))); // NOI18N
        jPanel2.setOpaque(false);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jrbEspecifica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbEspecifica.setText("Fecha Específica");

        jrbCompuesta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbCompuesta.setText("Entre Dos Fechas");

        jlFirstDate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlFirstDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFirstDate.setText("Primer Fecha");

        jlLastDate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlLastDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLastDate.setText("Segunda Fecha");

        jbNextDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-20.png"))); // NOI18N

        jbAddDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye-20.png"))); // NOI18N
        jbAddDate.setToolTipText("");
        jbAddDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddDateActionPerformed(evt);
            }
        });

        jComboExpecifico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboExpecifico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aaaa-mm-dd" }));
        jComboExpecifico.setToolTipText("");
        jComboExpecifico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboExpecificoActionPerformed(evt);
            }
        });

        jComboCompuesto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboCompuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aaaa-mm-dd" }));
        jComboCompuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCompuestoActionPerformed(evt);
            }
        });

        jrbAnyDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbAnyDate.setText("Fecha Indistinta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbCompuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jrbAnyDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlLastDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFirstDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboExpecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddDate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jrbAnyDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbCompuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlFirstDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboExpecifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jbNextDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlLastDate)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAddDate))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcTipodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipodocActionPerformed
        // TODO add your handling code here:
        String doctype = jcTipodoc.getSelectedItem() + "";
        traza.setDoctype(doctype);
        jlNameTipodoc.setText("Tipo de Doc : " + doctype);
        changeDoctype();

    }//GEN-LAST:event_jcTipodocActionPerformed

    private void jcTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoUsuarioActionPerformed
        // TODO add your handling code here:
        String username = jcTipoUsuario.getSelectedItem() + "";
        jlUsername.setText("Usuario: " + username);
        traza.setUsername(username);
        changeUser();


    }//GEN-LAST:event_jcTipoUsuarioActionPerformed

    private void jbAddDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddDateActionPerformed

    private void jComboExpecificoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboExpecificoActionPerformed
        // TODO add your handling code here:
        changeDates();

    }//GEN-LAST:event_jComboExpecificoActionPerformed

    private void jComboCompuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCompuestoActionPerformed
        // TODO add your handling code here:
        changeDates();
    }//GEN-LAST:event_jComboCompuestoActionPerformed
    private TrazaporVerificacion changeDates() {
        ChangeValuesOfTrazas change = new ChangeValuesOfTrazas(jrbAnyDate, jComboExpecifico, jcTipodoc, jcTipoUsuario, jComboCompuesto, jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, traza);
        change.valuesFromDate();
        return change.getTrazav();

    }

    private TrazaporVerificacion changeDoctype() {
        ChangeValuesOfTrazas change = new ChangeValuesOfTrazas(jrbAnyDate, jComboExpecifico, jcTipodoc, jcTipoUsuario, jComboCompuesto, jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, traza);
        change.valuesFromDoctype();
        return change.getTrazav();

    }

    private TrazaporVerificacion changeUser() {
        ChangeValuesOfTrazas change = new ChangeValuesOfTrazas(jrbAnyDate, jComboExpecifico, jcTipodoc, jcTipoUsuario, jComboCompuesto, jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, traza);
        change.valuesFromUser();
        return change.getTrazav();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelSeleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboCompuesto;
    private javax.swing.JComboBox jComboExpecifico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbAddDate;
    private javax.swing.JButton jbAddDoctype;
    private javax.swing.JButton jbAddUsername;
    private javax.swing.JButton jbNextDate;
    private javax.swing.JButton jbNextUsername;
    private javax.swing.JButton jbnextDoctype;
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
    private javax.swing.JPanel jpVerificacion;
    private javax.swing.JRadioButton jrbAnyDate;
    private javax.swing.JRadioButton jrbCalidad;
    private javax.swing.JRadioButton jrbCompuesta;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JRadioButton jrbEspecifica;
    // End of variables declaration//GEN-END:variables
}
