/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadora;
import Base_de_Datos.Busquedas;
import Base_de_Datos.Cliente;
import Base_de_Datos.Consultas;
import Base_de_Datos.Eliminar;
import Base_de_Datos.Ingresos;
import Base_de_Datos.conexionBD;
import java.sql.Connection;
import static java.lang.String.valueOf;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gganp
 */
public class CONTACTO extends javax.swing.JInternalFrame {

    /**
     * Creates new form CONTACTO
     */
          Consultas consulta = new Consultas();
    Busquedas src = new Busquedas();
    public static int tipo=0;
    Eliminar del =new Eliminar();
    Cliente cl = new Cliente();
    conexionBD con = new conexionBD();
    Connection cn = con.conexion();
    public CONTACTO() {
        initComponents();
        IGM2IngresarPagTxt13.setEnabled(false);
        if(tipo==2){IGM2IngresarPagTxt10.setEnabled(false);
       IGM2IngresarPagTxt13.setEnabled(false);
       IGM2IngresarPagTxt14.setEnabled(false);
      
       }
        consulta.mostrar_tabla4();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_ingreso_cts13 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        NOMBRE_CTO = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        CARGO_CTO = new javax.swing.JTextField();
        jLabel176 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TEL_CTO = new javax.swing.JTextArea();
        IGM2IngresarPagTxt8 = new javax.swing.JButton();
        IGM2IngresarPagTxt9 = new javax.swing.JButton();
        IGM2IngresarPagTxt10 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        TBL_CTO = new javax.swing.JTable();
        IGM2IngresarPagTxt13 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        TEL_CTO1 = new javax.swing.JTextArea();
        IGM2IngresarPagTxt14 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(1144, 764));
        setPreferredSize(new java.awt.Dimension(1144, 764));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeiconified(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panel_ingreso_cts13.setBackground(new java.awt.Color(102, 0, 0));
        panel_ingreso_cts13.setMaximumSize(new java.awt.Dimension(1144, 764));
        panel_ingreso_cts13.setPreferredSize(new java.awt.Dimension(1144, 764));

        jLabel90.setBackground(new java.awt.Color(0, 0, 51));
        jLabel90.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("CONTACTOS");
        jLabel90.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel43.setBackground(new java.awt.Color(0, 0, 51));
        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel43.setOpaque(false);

        jLabel170.setBackground(new java.awt.Color(0, 0, 51));
        jLabel170.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("NOMBRE");
        jLabel170.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NOMBRE_CTO.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        NOMBRE_CTO.setForeground(new java.awt.Color(0, 0, 51));
        NOMBRE_CTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel174.setBackground(new java.awt.Color(0, 0, 51));
        jLabel174.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("CARGO");
        jLabel174.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        CARGO_CTO.setFont(new java.awt.Font("Segoe UI Historic", 1, 16)); // NOI18N
        CARGO_CTO.setForeground(new java.awt.Color(0, 0, 51));
        CARGO_CTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel176.setBackground(new java.awt.Color(0, 0, 51));
        jLabel176.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("TELEFONOS / EMAIL");
        jLabel176.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TEL_CTO.setColumns(20);
        TEL_CTO.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        TEL_CTO.setRows(5);
        jScrollPane19.setViewportView(TEL_CTO);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel170, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CARGO_CTO)
                            .addComponent(NOMBRE_CTO, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE_CTO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CARGO_CTO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap())
        );

        IGM2IngresarPagTxt8.setBackground(new java.awt.Color(0, 0, 0));
        IGM2IngresarPagTxt8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        IGM2IngresarPagTxt8.setForeground(new java.awt.Color(255, 255, 255));
        IGM2IngresarPagTxt8.setText("LIMPIAR");
        IGM2IngresarPagTxt8.setBorder(null);
        IGM2IngresarPagTxt8.setBorderPainted(false);
        IGM2IngresarPagTxt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGM2IngresarPagTxt8limpiar18ActionPerformed(evt);
            }
        });

        IGM2IngresarPagTxt9.setBackground(new java.awt.Color(0, 0, 0));
        IGM2IngresarPagTxt9.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        IGM2IngresarPagTxt9.setForeground(new java.awt.Color(255, 255, 255));
        IGM2IngresarPagTxt9.setText("GUARDAR");
        IGM2IngresarPagTxt9.setBorder(null);
        IGM2IngresarPagTxt9.setBorderPainted(false);
        IGM2IngresarPagTxt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGM2IngresarPagTxt9limpiar18ActionPerformed(evt);
            }
        });

        IGM2IngresarPagTxt10.setBackground(new java.awt.Color(0, 0, 0));
        IGM2IngresarPagTxt10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        IGM2IngresarPagTxt10.setForeground(new java.awt.Color(255, 255, 255));
        IGM2IngresarPagTxt10.setText("MODIFICAR");
        IGM2IngresarPagTxt10.setBorder(null);
        IGM2IngresarPagTxt10.setBorderPainted(false);
        IGM2IngresarPagTxt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGM2IngresarPagTxt10limpiar18ActionPerformed(evt);
            }
        });

        TBL_CTO.setBackground(new java.awt.Color(0, 0, 51));
        TBL_CTO.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        TBL_CTO.setForeground(new java.awt.Color(255, 255, 255));
        TBL_CTO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TBL_CTO.setAlignmentX(1.0F);
        TBL_CTO.setAlignmentY(1.0F);
        TBL_CTO.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TBL_CTO.setRowHeight(30);
        TBL_CTO.setSelectionBackground(new java.awt.Color(0, 153, 255));
        TBL_CTO.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TBL_CTO.getTableHeader().setReorderingAllowed(false);
        TBL_CTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBL_CTOMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(TBL_CTO);

        IGM2IngresarPagTxt13.setBackground(new java.awt.Color(0, 0, 0));
        IGM2IngresarPagTxt13.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        IGM2IngresarPagTxt13.setForeground(new java.awt.Color(255, 255, 255));
        IGM2IngresarPagTxt13.setText("ACTUALIZAR");
        IGM2IngresarPagTxt13.setBorder(null);
        IGM2IngresarPagTxt13.setBorderPainted(false);
        IGM2IngresarPagTxt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGM2IngresarPagTxt13limpiar18ActionPerformed(evt);
            }
        });

        TEL_CTO1.setColumns(20);
        TEL_CTO1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        TEL_CTO1.setRows(5);
        jScrollPane20.setViewportView(TEL_CTO1);

        IGM2IngresarPagTxt14.setBackground(new java.awt.Color(0, 0, 0));
        IGM2IngresarPagTxt14.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        IGM2IngresarPagTxt14.setForeground(new java.awt.Color(255, 255, 255));
        IGM2IngresarPagTxt14.setText("ELIMINAR");
        IGM2IngresarPagTxt14.setBorder(null);
        IGM2IngresarPagTxt14.setBorderPainted(false);
        IGM2IngresarPagTxt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGM2IngresarPagTxt14limpiar18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_ingreso_cts13Layout = new javax.swing.GroupLayout(panel_ingreso_cts13);
        panel_ingreso_cts13.setLayout(panel_ingreso_cts13Layout);
        panel_ingreso_cts13Layout.setHorizontalGroup(
            panel_ingreso_cts13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ingreso_cts13Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel_ingreso_cts13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_ingreso_cts13Layout.createSequentialGroup()
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ingreso_cts13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IGM2IngresarPagTxt13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IGM2IngresarPagTxt10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IGM2IngresarPagTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IGM2IngresarPagTxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IGM2IngresarPagTxt14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ingreso_cts13Layout.createSequentialGroup()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ingreso_cts13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        panel_ingreso_cts13Layout.setVerticalGroup(
            panel_ingreso_cts13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ingreso_cts13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_ingreso_cts13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ingreso_cts13Layout.createSequentialGroup()
                        .addComponent(IGM2IngresarPagTxt9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IGM2IngresarPagTxt8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(IGM2IngresarPagTxt10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IGM2IngresarPagTxt13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IGM2IngresarPagTxt14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_ingreso_cts13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ASEGURADORAS", panel_ingreso_cts13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IGM2IngresarPagTxt8limpiar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGM2IngresarPagTxt8limpiar18ActionPerformed
        NOMBRE_CTO.setText("");
        CARGO_CTO.setText("");
        TEL_CTO.setText("");
        TEL_CTO1.setText("");
    }//GEN-LAST:event_IGM2IngresarPagTxt8limpiar18ActionPerformed

    private void IGM2IngresarPagTxt9limpiar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGM2IngresarPagTxt9limpiar18ActionPerformed
        Ingresos contacto =  new Ingresos();
        contacto.IngresosContacto();
        consulta.mostrar_tabla4();
        NOMBRE_CTO.setText("");
        CARGO_CTO.setText("");
        TEL_CTO.setText("");
        TEL_CTO1.setText("");
    }//GEN-LAST:event_IGM2IngresarPagTxt9limpiar18ActionPerformed

    private void IGM2IngresarPagTxt10limpiar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGM2IngresarPagTxt10limpiar18ActionPerformed
        int fila= TBL_CTO.getSelectedRow();
        if(fila>=0){
            IGM2IngresarPagTxt13.setEnabled(true);
            IGM2IngresarPagTxt9.setEnabled(false);
            NOMBRE_CTO.setText(TBL_CTO.getValueAt(fila,1).toString());
            CARGO_CTO.setText(TBL_CTO.getValueAt(fila,2).toString());
            TEL_CTO.setText(TEL_CTO1.getText());
        }else{ JOptionPane.showMessageDialog(null,"SELECCIONE UN REGISTRO");}
    }//GEN-LAST:event_IGM2IngresarPagTxt10limpiar18ActionPerformed

    private void TBL_CTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBL_CTOMouseClicked
        consulta.mostrar_textfield4(TBL_CTO.getValueAt(TBL_CTO.getSelectedRow(),0).toString());
    }//GEN-LAST:event_TBL_CTOMouseClicked

    private void IGM2IngresarPagTxt13limpiar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGM2IngresarPagTxt13limpiar18ActionPerformed
        try {
            String id = valueOf(TBL_CTO.getValueAt(TBL_CTO.getSelectedRow(),0));
            String sql = "UPDATE tbl_contacto_aseguradora SET NombreCompleto_cas='"+NOMBRE_CTO.getText()+"',Telefonos_cas='"+TEL_CTO.getText()+"'"
            + ",Cargo_cas='"+CARGO_CTO.getText()+"' WHERE IdContacto='"+id+"'";

            PreparedStatement pps = cn.prepareStatement(sql);
            pps.executeUpdate();

            consulta.mostrar_tabla4();
            NOMBRE_CTO.setText("");
            CARGO_CTO.setText("");
            TEL_CTO.setText("");
            TEL_CTO1.setText("");
            IGM2IngresarPagTxt9.setEnabled(true);
            IGM2IngresarPagTxt13.setEnabled(false);
            JOptionPane.showMessageDialog(null,"ACTUALIZADO");
        } catch (SQLException ex) {
            Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IGM2IngresarPagTxt13limpiar18ActionPerformed

    private void IGM2IngresarPagTxt14limpiar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGM2IngresarPagTxt14limpiar18ActionPerformed
        int fila= TBL_CTO.getSelectedRow();
        if(fila>=0){
            String sql = "DELETE  FROM tbl_contacto_aseguradora WHERE IdContacto ="+TBL_CTO.getValueAt(fila,0).toString()+"";
            try {
                PreparedStatement pps = cn.prepareStatement(sql);
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null,"CONTACTO ELIMINADO");

                consulta.mostrar_tabla4();
                NOMBRE_CTO.setText("");
                CARGO_CTO.setText("");
                TEL_CTO.setText("");
                TEL_CTO1.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(PRINCIPAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{ JOptionPane.showMessageDialog(null,"SELECCIONE UN REGISTRO");}
    }//GEN-LAST:event_IGM2IngresarPagTxt14limpiar18ActionPerformed

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
       this.setSize(1144, 764);
    }//GEN-LAST:event_formInternalFrameDeiconified

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
         this.setSize(200, 40);
    }//GEN-LAST:event_formInternalFrameIconified


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField CARGO_CTO;
    private javax.swing.JButton IGM2IngresarPagTxt10;
    private javax.swing.JButton IGM2IngresarPagTxt13;
    private javax.swing.JButton IGM2IngresarPagTxt14;
    private javax.swing.JButton IGM2IngresarPagTxt8;
    private javax.swing.JButton IGM2IngresarPagTxt9;
    public static javax.swing.JTextField NOMBRE_CTO;
    public static javax.swing.JTable TBL_CTO;
    public static javax.swing.JTextArea TEL_CTO;
    public static javax.swing.JTextArea TEL_CTO1;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_ingreso_cts13;
    // End of variables declaration//GEN-END:variables
}
