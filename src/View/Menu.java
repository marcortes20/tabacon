/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controlator.management_Menu;
import Model.staff;
import View.login.frm_SignIn;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    
    management_Menu management = new management_Menu();

   private staff User = new staff();

    public Menu(staff user_loged) {
        
      User = user_loged;
      
        initComponents();
        
         this.setExtendedState(MAXIMIZED_BOTH);
         
         set_user_acount(User);
         
         
         
       

    }

    public Menu() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
         lb_user.setText("Marco Cortes Castillo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop_menu_user = new javax.swing.JPopupMenu();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        sub_pop_update = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        sub_pop_log_out = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/tabacon.jpg"));
        Image image = icon.getImage();
        desk = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){ g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        lb_user = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        sub_menu_reserve = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        sub_menu_room = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        sub_menu_customer = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        sub_menu_report = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        sub_menu_exit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();

        pop_menu_user.setBackground(new java.awt.Color(0, 0, 0));
        pop_menu_user.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        pop_menu_user.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pop_menu_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pop_menu_user.setLabel("User configuration");
        pop_menu_user.add(jSeparator13);

        sub_pop_update.setText("Update your personal information");
        pop_menu_user.add(sub_pop_update);
        pop_menu_user.add(jSeparator12);

        sub_pop_log_out.setText("Log out");
        sub_pop_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_pop_log_outActionPerformed(evt);
            }
        });
        pop_menu_user.add(sub_pop_log_out);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal menú");
        setState(6);

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        lb_user.setBackground(new java.awt.Color(0, 0, 0));
        lb_user.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        lb_user.setForeground(new java.awt.Color(0, 0, 0));
        lb_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_image.png"))); // NOI18N
        lb_user.setToolTipText("Right click");
        lb_user.setComponentPopupMenu(pop_menu_user);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tabacon_icon.jpeg"))); // NOI18N
        jLabel1.setText("Tabacon Thermal Resort & Spa");
        jLabel1.setIgnoreRepaint(true);
        jLabel1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/intagram.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(148, 34));

        sub_menu_reserve.setBackground(new java.awt.Color(0, 0, 0));
        sub_menu_reserve.setForeground(new java.awt.Color(0, 0, 0));
        sub_menu_reserve.setText("Archieve");
        sub_menu_reserve.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        sub_menu_reserve.add(jSeparator2);
        sub_menu_reserve.add(jSeparator3);

        sub_menu_room.setText("Rooms");
        sub_menu_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_roomActionPerformed(evt);
            }
        });
        sub_menu_reserve.add(sub_menu_room);
        sub_menu_reserve.add(jSeparator4);

        sub_menu_customer.setText("Customers");
        sub_menu_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_customerActionPerformed(evt);
            }
        });
        sub_menu_reserve.add(sub_menu_customer);
        sub_menu_reserve.add(jSeparator5);

        jMenuItem2.setText("Reserve");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        sub_menu_reserve.add(jMenuItem2);
        sub_menu_reserve.add(jSeparator6);

        sub_menu_report.setText("Invoicing report");
        sub_menu_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_reportActionPerformed(evt);
            }
        });
        sub_menu_reserve.add(sub_menu_report);
        sub_menu_reserve.add(jSeparator7);

        sub_menu_exit.setText("Exit");
        sub_menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_menu_exitActionPerformed(evt);
            }
        });
        sub_menu_reserve.add(sub_menu_exit);

        jMenuBar1.add(sub_menu_reserve);

        jMenu3.setBackground(new java.awt.Color(0, 0, 0));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Window");
        jMenu3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jMenu3.add(jSeparator1);

        jMenuItem6.setText("Cascadind windows");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator8);

        jMenuItem7.setText("Parallel windows");
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator9);

        jMenu2.setText("Close");

        jMenuItem8.setText("Current window");
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator10);

        jMenuItem9.setText("All windows");
        jMenu2.add(jMenuItem9);

        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 0, 0));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setText("Help");
        jMenu4.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N

        jMenuItem10.setText("Content");
        jMenu4.add(jMenuItem10);
        jMenu4.add(jSeparator11);

        jMenuItem11.setText("About hotel");
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(lb_user, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_user, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addComponent(desk))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_menu_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_customerActionPerformed
        ifrm_customer customer;
       try {
           
           customer = new ifrm_customer();
           
            desk.add(customer);
            
            customer.setVisible(true);
            
       } catch (PropertyVetoException ex) {
           
           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_sub_menu_customerActionPerformed

    private void sub_menu_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_roomActionPerformed
       try {
           ifrm_rooms rooms = new ifrm_rooms();
           
           desk.add(rooms);
           
           rooms.setVisible(true);
           
       } catch (PropertyVetoException ex) {
           
           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_sub_menu_roomActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        URL url = null;

        try {

            url = new URL("https://www.facebook.com/tabacon/");

            try {

                Desktop.getDesktop().browse(url.toURI());

            } catch (IOException | URISyntaxException e) {

                e.printStackTrace();

            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        URL url = null;

        try {

            url = new URL("https://www.instagram.com/tabaconresort/");

            try {
                Desktop.getDesktop().browse(url.toURI());

            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();

            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sub_menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_exitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_sub_menu_exitActionPerformed

    private void sub_menu_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_menu_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_menu_reportActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       try {
           
           ifrm_reserve reserve = new ifrm_reserve();
           
           desk.add(reserve);
           
           reserve.setVisible(true);
           
       } catch (PropertyVetoException ex) {
           
           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void sub_pop_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_pop_log_outActionPerformed
        open_signIn();
    }//GEN-LAST:event_sub_pop_log_outActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lb_user;
    private javax.swing.JPopupMenu pop_menu_user;
    private javax.swing.JMenuItem sub_menu_customer;
    private javax.swing.JMenuItem sub_menu_exit;
    private javax.swing.JMenuItem sub_menu_report;
    private javax.swing.JMenu sub_menu_reserve;
    private javax.swing.JMenuItem sub_menu_room;
    private javax.swing.JMenuItem sub_pop_log_out;
    private javax.swing.JMenuItem sub_pop_update;
    // End of variables declaration//GEN-END:variables

public void set_user_acount(staff user){
    
    lb_user.setText(user.getName() + " " + user.getLast_name());
    
}

   public void open_signIn() {

        this.dispose();

        frm_SignIn signIn = new frm_SignIn();

        signIn.setVisible(true);
    }
}
