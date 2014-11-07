/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import ErroresPorTraza.Procesar;
import ErroresPorTraza.TabbedForm;
import fecha.GetDates;
import usuario.GetUsername;
import documento.GetTypedocs;
import java.util.List;
import javax.swing.ButtonGroup;
import models.Filtro;

/**
 *
 * @author aguilangeles@gmail.com
 */
public class PanelSeleccion extends javax.swing.JFrame {

    private boolean selected;
    private ButtonGroup groupDate;
    private ButtonGroup groupVerificacion;

    private final GetCantidadVerificacion cantidades;
    private final ChBoxList list;
    private GetDates dates;
    private final Filtro filtro;
    private GetTypedocs typedocs;
    private GetUsername username;
    private final EnableFilters allow;
    private int valor;

    /**
     * Creates new form PanelSeleccion
     */
    public PanelSeleccion() {
        initComponents();
        setTitle("Estadísticas Qualitys");
        actionVerificacionButtonGroup();
        actionDatesRadioButton();
        this.setResizable(false);
        jComboCompuesto.setVisible(false);
        jlLastDate.setVisible(false);
        cantidades = new GetCantidadVerificacion(jlnumTrazas, jlnumAcep, jlnumRech, jlnumNull);
        list = new ChBoxList(jchFecha, jchDocumento, jchUsuario);
        allow = new EnableFilters(jchDocumento, jchFecha, jchUsuario, jbChecks, jbPrevius, jbGo, jbReset);
        TipoVerificacion verificacion = new TipoVerificacion(jrbCalidad, jrbDocumento, jchFecha, jchDocumento, jchUsuario, cantidades, jbChecks, allow);
        filtro = verificacion.getFiltro();

    }

    private void actionVerificacionButtonGroup() {
        groupVerificacion = new ButtonGroup();
        groupVerificacion.add(jrbCalidad);
        groupVerificacion.add(jrbDocumento);
    }

    private void actionDatesRadioButton() {
        groupDate = new ButtonGroup();
        groupDate.add(jrbEspecifica);
        groupDate.add(jrbCompuesta);
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
        jPanel4 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jcTipodoc = new javax.swing.JComboBox();
        jlNameTipodoc = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jcTipoUsuario = new javax.swing.JComboBox();
        jlUsername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jrbEspecifica = new javax.swing.JRadioButton();
        jrbCompuesta = new javax.swing.JRadioButton();
        jlFirstDate = new javax.swing.JLabel();
        jlLastDate = new javax.swing.JLabel();
        jComboExpecifico = new javax.swing.JComboBox();
        jComboCompuesto = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jchFecha = new javax.swing.JCheckBox();
        jchDocumento = new javax.swing.JCheckBox();
        jchUsuario = new javax.swing.JCheckBox();
        jbChecks = new javax.swing.JButton();
        jbPrevius = new javax.swing.JButton();
        jbGo = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpVerificacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jrbCalidad = new javax.swing.JRadioButton();
        jrbDocumento = new javax.swing.JRadioButton();
        jlnumTrazas = new javax.swing.JLabel();
        jlnumAcep = new javax.swing.JLabel();
        jlnumRech = new javax.swing.JLabel();
        jlnumNull = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especifique Tipo de Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel4.setOpaque(false);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jcTipodoc.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jcTipodoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Documento", " " }));
        jcTipodoc.setEnabled(false);

        jlNameTipodoc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlNameTipodoc.setText("------");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jcTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNameTipodoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlNameTipodoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jcTipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especifique Nombre De Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel5.setOpaque(false);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jcTipoUsuario.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jcTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario" }));
        jcTipoUsuario.setEnabled(false);

        jlUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlUsername.setText("------");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jcTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jcTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator4))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especifique la o las fechas de filtrado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jrbEspecifica.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jrbEspecifica.setText("Fecha Específica");
        jrbEspecifica.setEnabled(false);

        jrbCompuesta.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jrbCompuesta.setText("Entre Dos Fechas");
        jrbCompuesta.setEnabled(false);

        jlFirstDate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlFirstDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFirstDate.setText("Primer Fecha");

        jlLastDate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlLastDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlLastDate.setText("Segunda Fecha");

        jComboExpecifico.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jComboExpecifico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aaaa-mm-dd" }));
        jComboExpecifico.setToolTipText("");
        jComboExpecifico.setEnabled(false);

        jComboCompuesto.setFont(new java.awt.Font("Arimo", 0, 12)); // NOI18N
        jComboCompuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aaaa-mm-dd" }));
        jComboCompuesto.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbCompuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jrbEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboCompuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboExpecifico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlLastDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlFirstDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbEspecifica)
                        .addGap(18, 18, 18)
                        .addComponent(jrbCompuesta)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jlFirstDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboExpecifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlLastDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Seleccione los filtros que desea aplicar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel3.setOpaque(false);

        jchFecha.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jchFecha.setText("Fecha");
        jchFecha.setEnabled(false);

        jchDocumento.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jchDocumento.setText("Documento");
        jchDocumento.setEnabled(false);

        jchUsuario.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jchUsuario.setText("Usuario");
        jchUsuario.setEnabled(false);

        jbChecks.setBackground(new java.awt.Color(204, 255, 255));
        jbChecks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1413845271_checked-20.png"))); // NOI18N
        jbChecks.setToolTipText("Confirmar los filtros");
        jbChecks.setEnabled(false);
        jbChecks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChecksActionPerformed(evt);
            }
        });

        jbPrevius.setBackground(new java.awt.Color(204, 255, 255));
        jbPrevius.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye-20.png"))); // NOI18N
        jbPrevius.setToolTipText("");
        jbPrevius.setEnabled(false);
        jbPrevius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreviusActionPerformed(evt);
            }
        });

        jbGo.setBackground(new java.awt.Color(204, 255, 255));
        jbGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next-20.png"))); // NOI18N
        jbGo.setEnabled(false);
        jbGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGoActionPerformed(evt);
            }
        });

        jbReset.setBackground(new java.awt.Color(204, 255, 255));
        jbReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross-16.png"))); // NOI18N
        jbReset.setEnabled(false);
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arimo", 2, 12)); // NOI18N
        jLabel1.setText("Vista Previa");

        jLabel2.setFont(new java.awt.Font("Arimo", 2, 12)); // NOI18N
        jLabel2.setText("Aceptar");

        jLabel3.setFont(new java.awt.Font("Arimo", 2, 12)); // NOI18N
        jLabel3.setText("Rechazar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jchFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jchDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPrevius)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbGo)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbChecks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbChecks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jchDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jchFecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPrevius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpVerificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 204, 255)), "Seleccione Tipo de Verificación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arimo", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jpVerificacion.setOpaque(false);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jrbCalidad.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jrbCalidad.setText("Control básico de Calidad");

        jrbDocumento.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jrbDocumento.setText("Contol básico de Documento");

        jlnumTrazas.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jlnumTrazas.setText("Cantidad de trazas:");

        jlnumAcep.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jlnumAcep.setText("Total Aceptados");

        jlnumRech.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
        jlnumRech.setText("Total Rechazados");

        jlnumNull.setFont(new java.awt.Font("Arimo", 1, 12)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap()
                .addGroup(jpVerificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVerificacionLayout.createSequentialGroup()
                        .addComponent(jlnumTrazas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jlnumAcep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlnumRech, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlnumNull, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpVerificacionLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jrbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jpVerificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbChecksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChecksActionPerformed
        int valores = getValor();
        String condicion = filtro.toString();
        dates = new GetDates(jrbEspecifica, jrbCompuesta, jComboExpecifico, jComboCompuesto, jlFirstDate, jlLastDate, groupDate, filtro, allow);
        typedocs = new GetTypedocs(jcTipodoc, jlNameTipodoc, filtro);
        username = new GetUsername(jcTipoUsuario, jlUsername, filtro);
        SeleccionChecks jButtonSeleccin = new SeleccionChecks(valor, condicion, dates, typedocs, username);

    }//GEN-LAST:event_jbChecksActionPerformed

    private void jbPreviusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreviusActionPerformed
        cantidades.setvalueoftraza(filtro.toString());

    }//GEN-LAST:event_jbPreviusActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        //todo poner esto en otra clase.
        groupVerificacion.clearSelection();
        list.remove();
        filtro.setId(0);
        filtro.setFechas("");
        filtro.setDocumento("");
        filtro.setUsuario("");
        //filtros set enables
        allow.allowFilters(false);

        jchDocumento.setSelected(false);
        jchFecha.setSelected(false);
        jchUsuario.setSelected(false);
        groupDate.clearSelection();
        dates = new GetDates(jrbEspecifica, jrbCompuesta, jComboExpecifico, jComboCompuesto, jlFirstDate, jlLastDate, groupDate, filtro, allow);
        dates.desactivar();
        typedocs = new GetTypedocs(jcTipodoc, jlNameTipodoc, filtro);
        typedocs.desactivar();
        username = new GetUsername(jcTipoUsuario, jlUsername, filtro);
        username.desactivar();
        cantidades.reset();
        setValor(0);

    }//GEN-LAST:event_jbResetActionPerformed

    private void jbGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoActionPerformed
        cantidades.setvalueoftraza(filtro.toString());//porque no lo hace?
        int aceptadas = cantidades.getFacept();
        int rechazadas = cantidades.getFrech();
        filtro.setNombreDocumento(jlNameTipodoc.getText());
        filtro.setLastusuario(jlUsername.getText());
        final Procesar procesor = new Procesar(filtro, aceptadas, rechazadas);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabbedForm(procesor).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_jbGoActionPerformed
    public int getValor() {
        //TODO pasar esto a la clase de la lista
        List lista = list.getChecks();

        if (lista.size() == 3 && lista.contains("Fecha") && lista.contains("Documento") && lista.contains("Usuario")) {
            valor = 1;
        } else if (lista.size() == 2 && lista.contains("Fecha") && lista.contains("Documento")) {
            valor = 2;
        } else if (lista.size() == 2 && lista.contains("Fecha") && lista.contains("Usuario")) {
            valor = 3;
        } else if (lista.size() == 2 && lista.contains("Documento") && lista.contains("Usuario")) {
            valor = 4;
        } else if (lista.size() == 1 && lista.contains("Fecha")) {
            valor = 5;
        } else if (lista.size() == 1 && lista.contains("Documento")) {
            valor = 6;
        } else if (lista.size() == 1 && lista.contains("Usuario")) {
            valor = 7;
        }
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbChecks;
    private javax.swing.JButton jbGo;
    private javax.swing.JButton jbPrevius;
    private javax.swing.JButton jbReset;
    private javax.swing.JComboBox jcTipoUsuario;
    private javax.swing.JComboBox jcTipodoc;
    private javax.swing.JCheckBox jchDocumento;
    private javax.swing.JCheckBox jchFecha;
    private javax.swing.JCheckBox jchUsuario;
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
