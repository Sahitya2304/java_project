/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import trandpl.pojo.CurrentUser;

/**
 *
 * @author ashut
 */
public class AdminHrModuleFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminHrModuleFrame
     */
    public AdminHrModuleFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Admin HR Module Frame");
        lblName.setText(CurrentUser.getName());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddNewHR = new javax.swing.JButton();
        btnRemoveHr = new javax.swing.JButton();
        btnModHr = new javax.swing.JButton();
        btnViewAllHr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 860, 144));

        btnLogOut.setBackground(new java.awt.Color(173, 192, 234));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 124, 41));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 134, 42));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        jLabel4.setText("Welcome ,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 108, 42));

        lblName.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 281, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addNewEmp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 259, 190, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 192, 195));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modify-emp.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewAllHr.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 197, -1));

        btnAddNewHR.setBackground(new java.awt.Color(173, 192, 234));
        btnAddNewHR.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnAddNewHR.setText("Add New HR");
        btnAddNewHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHRActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 472, 184, 47));

        btnRemoveHr.setBackground(new java.awt.Color(173, 192, 234));
        btnRemoveHr.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnRemoveHr.setText("Remove HR");
        btnRemoveHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 184, 47));

        btnModHr.setBackground(new java.awt.Color(173, 192, 234));
        btnModHr.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnModHr.setText("Modify HR");
        btnModHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnModHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 184, 47));

        btnViewAllHr.setBackground(new java.awt.Color(173, 192, 234));
        btnViewAllHr.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnViewAllHr.setText("View All HR's");
        btnViewAllHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 197, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminOptionsFrame af=new AdminOptionsFrame();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddNewHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHRActionPerformed
        // TODO add your handling code here:
        new AdminAddNewHrFrame().setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnAddNewHRActionPerformed

    private void btnViewAllHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllHrActionPerformed
        // TODO add your handling code here:
        new AdminViewAllHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllHrActionPerformed

    private void btnModHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModHrActionPerformed
        // TODO add your handling code here:
        new AdminModifyHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModHrActionPerformed

    private void btnRemoveHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveHrActionPerformed
        // TODO add your handling code here:
         new AdminRemoveHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRemoveHrActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHrModuleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewHR;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnModHr;
    private javax.swing.JButton btnRemoveHr;
    private javax.swing.JButton btnViewAllHr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}