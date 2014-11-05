/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErroresPorTraza;

import java.awt.FlowLayout;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class TabbedForm extends javax.swing.JFrame {

    /**
     * Creates new form TabbedForm
     */
    public TabbedForm(Procesar procesor) {
        initComponents();
        jTable1.setModel(procesor.getErrorModel());
        jTable2.setModel(procesor.getCantidad());
        jTable3.setModel(procesor.getPormil());
        jTextArea1.setText(procesor.resultados());

        setChartCantidadErrores();
        setChartAceptadosRechazados();
        setChartCantidadErroresPorMil();

    }

    private void setChartCantidadErrores() {
        ChartErrores chartError = new ChartErrores();
        ChartPanel chartpanel1 = chartError.getChartPanel("Cantidad de errores", jTable1);
        jPanelChartError.removeAll();
        jPanelChartError.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanelChartError.add(chartpanel1);
        this.setLocationRelativeTo(null);
    }

    private void setChartCantidadErroresPorMil() {
        ChartErroresxMil chartErrores = new ChartErroresxMil();
        ChartPanel chartpanel1 = chartErrores.getChartPanel("Errores por mil", jTable3);
        jPanelMill.removeAll();
        jPanelMill.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanelMill.add(chartpanel1);
        this.setLocationRelativeTo(null);
    }

    private void setChartAceptadosRechazados() {
        Chartaceptrech aceptrech = new Chartaceptrech();
        ChartPanel chartpanel1 = aceptrech.getChartPanel("Estado de Trazas", jTable2);
        jPanelAceptRech.removeAll();
        jPanelAceptRech.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanelAceptRech.add(chartpanel1);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneErrores = new javax.swing.JTabbedPane();
        jPanelErrores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelChartError = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelCantidad = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanelAceptRech = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanelPorMil = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelMill = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelErrores.setBackground(new java.awt.Color(204, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanelChartError.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanelChartErrorLayout = new javax.swing.GroupLayout(jPanelChartError);
        jPanelChartError.setLayout(jPanelChartErrorLayout);
        jPanelChartErrorLayout.setHorizontalGroup(
            jPanelChartErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanelChartErrorLayout.setVerticalGroup(
            jPanelChartErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelErroresLayout = new javax.swing.GroupLayout(jPanelErrores);
        jPanelErrores.setLayout(jPanelErroresLayout);
        jPanelErroresLayout.setHorizontalGroup(
            jPanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelErroresLayout.createSequentialGroup()
                .addGroup(jPanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                .addGap(18, 77, Short.MAX_VALUE)
                .addComponent(jPanelChartError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelErroresLayout.setVerticalGroup(
            jPanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelErroresLayout.createSequentialGroup()
                .addGroup(jPanelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelErroresLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addComponent(jPanelChartError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneErrores.addTab("tab1", jPanelErrores);

        jPanelCantidad.setBackground(new java.awt.Color(255, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanelAceptRech.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanelAceptRechLayout = new javax.swing.GroupLayout(jPanelAceptRech);
        jPanelAceptRech.setLayout(jPanelAceptRechLayout);
        jPanelAceptRechLayout.setHorizontalGroup(
            jPanelAceptRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        jPanelAceptRechLayout.setVerticalGroup(
            jPanelAceptRechLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanelCantidadLayout = new javax.swing.GroupLayout(jPanelCantidad);
        jPanelCantidad.setLayout(jPanelCantidadLayout);
        jPanelCantidadLayout.setHorizontalGroup(
            jPanelCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCantidadLayout.createSequentialGroup()
                .addGroup(jPanelCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addGap(90, 90, 90)
                .addComponent(jPanelAceptRech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCantidadLayout.setVerticalGroup(
            jPanelCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCantidadLayout.createSequentialGroup()
                .addGroup(jPanelCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCantidadLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addComponent(jPanelAceptRech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneErrores.addTab("tab2", jPanelCantidad);

        jPanelPorMil.setBackground(new java.awt.Color(204, 255, 204));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanelMill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanelMillLayout = new javax.swing.GroupLayout(jPanelMill);
        jPanelMill.setLayout(jPanelMillLayout);
        jPanelMillLayout.setHorizontalGroup(
            jPanelMillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jPanelMillLayout.setVerticalGroup(
            jPanelMillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPorMilLayout = new javax.swing.GroupLayout(jPanelPorMil);
        jPanelPorMil.setLayout(jPanelPorMilLayout);
        jPanelPorMilLayout.setHorizontalGroup(
            jPanelPorMilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPorMilLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelMill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPorMilLayout.setVerticalGroup(
            jPanelPorMilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPorMilLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 263, Short.MAX_VALUE))
            .addGroup(jPanelPorMilLayout.createSequentialGroup()
                .addComponent(jPanelMill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneErrores.addTab("tab3", jPanelPorMil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneErrores, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneErrores)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TabbedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TabbedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TabbedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TabbedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TabbedForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAceptRech;
    private javax.swing.JPanel jPanelCantidad;
    private javax.swing.JPanel jPanelChartError;
    private javax.swing.JPanel jPanelErrores;
    private javax.swing.JPanel jPanelMill;
    private javax.swing.JPanel jPanelPorMil;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneErrores;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
