/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controlator.management_customers;
import Model.customers;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;

/**
 *
 * @author mcortes19
 */
public class ifrm_customer extends javax.swing.JInternalFrame {

    management_customers management = new management_customers();
    customers customer;

    public ifrm_customer() throws PropertyVetoException {
        initComponents();
        this.setMaximum(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        win_customer = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        txt_customer_id = new javax.swing.JTextField();
        txt_adress = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txt_company = new javax.swing.JTextField();
        txt_last_name = new javax.swing.JTextField();
        txt_phone_number = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_SignUp = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_guardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_editar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_eliminar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btn_imprimir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_cerrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jPanel1 = new javax.swing.JPanel();
        lb_total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();

        win_customer.setSize(new java.awt.Dimension(698, 681));
        win_customer.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(153, 153, 153,80));
        jPanel11.setForeground(new java.awt.Color(0, 0, 0));

        jLabel59.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel59.setText("Name:");

        jLabel64.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel64.setText(" ID:");

        jLabel65.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel65.setText("Last name:");

        jLabel66.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel66.setText("Company:");

        jLabel67.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel67.setText("Phone number:");

        jLabel68.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel68.setText("Email:");

        txt_customer_id.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_customer_id.setForeground(new java.awt.Color(0, 0, 0));

        txt_adress.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_adress.setForeground(new java.awt.Color(0, 0, 0));

        txt_name.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(0, 0, 0));

        jLabel70.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel70.setText("Adress:");

        txt_company.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_company.setForeground(new java.awt.Color(0, 0, 0));

        txt_last_name.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_last_name.setForeground(new java.awt.Color(0, 0, 0));

        txt_phone_number.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_phone_number.setForeground(new java.awt.Color(0, 0, 0));

        txt_email.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 0, 0));

        btn_save.setBackground(new java.awt.Color(153, 153, 0));
        btn_save.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setActionCommand("Sign up");
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_SignUp.setBackground(new java.awt.Color(153, 153, 0));
        btn_SignUp.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        btn_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        btn_SignUp.setText("Cancel");
        btn_SignUp.setActionCommand("Sign up");
        btn_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel70)
                    .addComponent(jLabel66)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txt_adress, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txt_company, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txt_phone_number, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txt_last_name, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txt_customer_id)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addGap(532, 532, 532))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_phone_number, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_SignUp)
                .addGap(37, 37, 37))
        );

        win_customer.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 360, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tabacon_Thermal_Resort_and_Spa-Fortuna-Wellness_Area-4-83971.jpg"))); // NOI18N
        win_customer.getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 680));

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Customers");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1495573745-jd06_84493.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_guardar.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document-add_114467.png"))); // NOI18N
        btn_guardar.setText("Save");
        btn_guardar.setFocusable(false);
        btn_guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_guardar);
        jToolBar1.add(jSeparator1);

        btn_editar.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/document-edit_114472.png"))); // NOI18N
        btn_editar.setText("Edit");
        btn_editar.setFocusable(false);
        btn_editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_editar);
        jToolBar1.add(jSeparator4);

        btn_eliminar.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1486504830-delete-dustbin-empty-recycle-recycling-remove-trash_81361.png"))); // NOI18N
        btn_eliminar.setText("Delete");
        btn_eliminar.setFocusable(false);
        btn_eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_eliminar);
        jToolBar1.add(jSeparator5);

        btn_imprimir.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer_78349.png"))); // NOI18N
        btn_imprimir.setText("Print");
        btn_imprimir.setFocusable(false);
        btn_imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_imprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btn_imprimir);
        jToolBar1.add(jSeparator3);

        btn_cerrar.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salida.png"))); // NOI18N
        btn_cerrar.setText("Close");
        btn_cerrar.setFocusable(false);
        btn_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cerrar);
        jToolBar1.add(jSeparator2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lb_total.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User id", "Name", "Las name", "Max. Customers", "Address", "Company", "Email", "Phone number"
            }
        ));
        jScrollPane1.setViewportView(table_customer);

        jToolBar2.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar2.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jButton1.setText("Exel");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        win_customer.setTitle("Save customer");

        win_customer.setLocationRelativeTo(null);

        txt_customer_id.setEditable(true);

        clean_fields();

        win_customer.setVisible(true);


    }//GEN-LAST:event_btn_guardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        generate_exel();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        load_table();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        win_customer.setLocationRelativeTo(null);

        txt_customer_id.setEditable(false);

        int fila = table_customer.getSelectedRow();

        if (fila != -1) {

            win_customer.setTitle("Edit customer");

            customer = new customers();

            customer.setCustomer_id(Integer.parseInt(table_customer.getValueAt(fila, 0).toString()));

            management.searchCustomer(customer);

            txt_customer_id.setText(String.valueOf(customer.getCustomer_id()));

            txt_name.setText(customer.getName());

            txt_last_name.setText(customer.getLast_name());

            txt_adress.setText(customer.getAddress());

            txt_company.setText(customer.getCompany());

            txt_email.setText(customer.getEmail());

            txt_phone_number.setText(String.valueOf(customer.getPhone_number()));

            win_customer.setVisible(true);

        } else {

            JOptionPane.showMessageDialog(this, "Select customer to edit", "Edit", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        if (validate_data().isEmpty()) {

            customer = new customers();

            customer.setCustomer_id(Integer.parseInt(txt_customer_id.getText()));

            customer.setName(txt_name.getText());

            customer.setLast_name(txt_last_name.getText());

            customer.setAddress(txt_adress.getText());

            customer.setCompany(txt_company.getText());

            customer.setEmail(txt_email.getText());

            customer.setPhone_number(Integer.parseInt(txt_phone_number.getText()));

            if (win_customer.getTitle().equals("Save customer")) {

                if (management.registerCustomer(customer)) {

                    JOptionPane.showMessageDialog(win_customer, "customer was registered ", "Successfully!", JOptionPane.INFORMATION_MESSAGE);

                    win_customer.dispose();

                    load_table();

                } else {

                    JOptionPane.showMessageDialog(win_customer, "Error:", "Customer hasn't registered!", JOptionPane.ERROR_MESSAGE);
                }

            }

            if (win_customer.getTitle().equals("Edit customer")) {

                if (management.editCustomer(customer)) {

                    JOptionPane.showMessageDialog(win_customer, "Customer was edited ", "Successfully!", JOptionPane.INFORMATION_MESSAGE);

                    win_customer.dispose();

                    load_table();
                }

            }
        } else {

            JOptionPane.showMessageDialog(win_customer, "EMPTY FIELDS:" + validate_data(), "You must fill in all fields!", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        int fila = table_customer.getSelectedRow();

        if (fila != -1) {

            int customer_id = Integer.parseInt(table_customer.getValueAt(fila, 0).toString());

            int resp = JOptionPane.showConfirmDialog(rootPane, "Are you sure to delete this customer? " + customer_id,
                    "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (resp == JOptionPane.YES_OPTION) {

                if (management.deleteCustomer(customer_id)) {

                    JOptionPane.showMessageDialog(rootPane, "Customer has been removed", "Delete", JOptionPane.INFORMATION_MESSAGE);

                    load_table();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error to delete customer", "Delete", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Select customer to delete", "Delete", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed
        win_customer.dispose();
    }//GEN-LAST:event_btn_SignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    public javax.swing.JButton btn_SignUp;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_imprimir;
    public javax.swing.JButton btn_save;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lb_total;
    private javax.swing.JTable table_customer;
    private javax.swing.JTextField txt_adress;
    private javax.swing.JTextField txt_company;
    private javax.swing.JTextField txt_customer_id;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone_number;
    private javax.swing.JDialog win_customer;
    // End of variables declaration//GEN-END:variables

    public void generate_exel() {
        management.generate_xml();
    }

    public void load_table() {

        management.load_table(table_customer, lb_total);

    }

    public void clean_fields() {

        txt_customer_id.setText("");

        txt_name.setText("");

        txt_last_name.setText("");

        txt_adress.setText("");

        txt_company.setText("");

        txt_email.setText("");

        txt_email.setText("");
    }

    public String validate_data() {

        String empty_fields = "";

        if (txt_customer_id.getText().isEmpty()) {

            txt_customer_id.requestFocus();

            empty_fields += "\nCustomer id.";

        } else if (management.validate_int_format(txt_customer_id.getText())) {

            JOptionPane.showMessageDialog(win_customer, "'ID' should only have numbers!", "Critical error:", JOptionPane.ERROR_MESSAGE);

            txt_customer_id.setText("");

            empty_fields += "\ncustomer ID:";

        } else if (management.validate_customer_id(Integer.parseInt(txt_customer_id.getText()))) {

            JOptionPane.showMessageDialog(win_customer, "this customer id is already exist! try again:", "Error!", JOptionPane.ERROR_MESSAGE);

            txt_customer_id.setText("");

            empty_fields += "\ncustomer ID:";

        }

        if (txt_name.getText().trim().isEmpty()) {

            txt_name.requestFocus();

            empty_fields += "\nName:";
        }

        if (txt_last_name.getText().trim().isEmpty()) {

            txt_last_name.requestFocus();

            empty_fields += "\nLast name:";
        }

        if (txt_company.getText().trim().isEmpty()) {

            txt_company.requestFocus();

            empty_fields += "\nCompany:";
        }
        if (txt_email.getText().trim().isEmpty()) {

            txt_email.requestFocus();

            empty_fields += "\nEmail:";
        }

        if (txt_phone_number.getText().trim().isEmpty()) {

            txt_phone_number.requestFocus();

            empty_fields += "\nPhone number:";
        } else if (management.validate_int_format(txt_phone_number.getText())) {

            JOptionPane.showMessageDialog(win_customer, "'Phone number' should only have numbers!", "Critical error:", JOptionPane.ERROR_MESSAGE);

            txt_phone_number.setText("");

            empty_fields += "\nPhone number:";

        }
        return empty_fields;

    }
}
