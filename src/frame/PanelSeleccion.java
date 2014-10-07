/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import models.TrazaporVerificacion;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class PanelSeleccion extends javax.swing.JFrame {

    TrazaporVerificacion traza = new TrazaporVerificacion();

    /**
     * Creates new form PanelSeleccion
     */
    public PanelSeleccion() {
        initComponents();
        jcCompuesto.setVisible(false);
        jlLastDate.setVisible(false);
        Verificacion verificacion = new Verificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull, jrbCalidad, jrbDocumento, jcTipodoc, jlNameTipodoc, jcTipoUsuario, traza);
        GetDates dates = new GetDates(jrbEspecifica, jrbCompuesta, jcEspecifico,
                jcCompuesto, jlFirstDate, jlLastDate, jlnumTrazas, jlnumAcep, jlnumRech,
                jlnumNull, verificacion, jbNext, verificacion.getTraza(), jcTipodoc, jcTipoUsuario);

        this.traza = verificacion.getTraza();
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
        jLabel8 = new javax.swing.JLabel();
        jcTipodoc = new javax.swing.JComboBox();
        jlNameTipodoc = new javax.swing.JLabel();
        jbnext1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jcTipoUsuario = new javax.swing.JComboBox();
        jlUsername = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jrbEspecifica = new javax.swing.JRadioButton();
        jrbCompuesta = new javax.swing.JRadioButton();
        jlFirstDate = new javax.swing.JLabel();
        jcEspecifico = new javax.swing.JComboBox();
        jlLastDate = new javax.swing.JLabel();
        jcCompuesto = new javax.swing.JComboBox();
        jbNext = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo Documento"));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setText("Seleccione el tipo de Documento");

        jcTipodoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcTipodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipodocActionPerformed(evt);
            }
        });

        jlNameTipodoc.setText("Tipo de Documento");

        jbnext1.setText("next");

        jButton4.setText("add");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jcTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNameTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnext1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jbnext1)
                                .addGap(21, 21, 21)
                                .addComponent(jButton4))
                            .addComponent(jlNameTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuario"));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setText("Seleccione el usuario");

        jcTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoUsuarioActionPerformed(evt);
            }
        });

        jlUsername.setText("Usuario");

        jButton5.setText("next");

        jButton6.setText("add");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jcTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addComponent(jlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
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

        jcEspecifico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcEspecifico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlLastDate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlLastDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLastDate.setText("Segunda Fecha");

        jcCompuesto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcCompuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbNext.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbCompuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFirstDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcCompuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcEspecifico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlLastDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNext)
                    .addComponent(jButton2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jrbEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jrbCompuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlFirstDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlLastDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcTipodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipodocActionPerformed
        // TODO add your handling code here:
        String doctype = jcTipodoc.getSelectedItem() + "";
        traza.setDoctype(doctype);
        jlNameTipodoc.setText("Tipo de Doc : " + doctype);

    }//GEN-LAST:event_jcTipodocActionPerformed

    private void jcTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoUsuarioActionPerformed
        // TODO add your handling code here:
        String username = jcTipoUsuario.getSelectedItem() + "";
        jlUsername.setText("Usuario: " + username);
        traza.setUsername(username);

    }//GEN-LAST:event_jcTipoUsuarioActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbNext;
    private javax.swing.JButton jbnext1;
    private javax.swing.JComboBox jcCompuesto;
    private javax.swing.JComboBox jcEspecifico;
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
    private javax.swing.JRadioButton jrbCalidad;
    private javax.swing.JRadioButton jrbCompuesta;
    private javax.swing.JRadioButton jrbDocumento;
    private javax.swing.JRadioButton jrbEspecifica;
    // End of variables declaration//GEN-END:variables
}
