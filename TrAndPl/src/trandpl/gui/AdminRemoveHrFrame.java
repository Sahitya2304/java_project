/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trandpl.dao.HrDAO;
import trandpl.dao.UserDAO;
import trandpl.pojo.CurrentUser;
import trandpl.pojo.HrPojo;

/**
 *
 * @author ashut
 */
public class AdminRemoveHrFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    
    public AdminRemoveHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Admin Remove HR Frame");
        lblName.setText(CurrentUser.getName());
        model=(DefaultTableModel)tblAllHr.getModel();
        loadHrDetails();
    }
    private void loadHrDetails(){
        try
        {
            List<HrPojo> allHrList=HrDAO.getAllHr();
            for(HrPojo hr:allHrList){
                Vector<String> row=new Vector();
                row.add(hr.getHrId());
                row.add(hr.getUserId());
                row.add(hr.getHrName());
                row.add(hr.getPhone());
                row.add(hr.getCompanyName());
                model.addRow(row);
            }
            if(allHrList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No Hr Present!","Hr Not Present!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
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
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllHr = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        btnRemoveHr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 192, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 930, 144));

        btnLogOut.setBackground(new java.awt.Color(173, 192, 234));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 124, 41));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 134, 42));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 3, 20)); // NOI18N
        jLabel4.setText("Welcome ,");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 108, 42));

        lblName.setFont(new java.awt.Font("Lucida Fax", 3, 20)); // NOI18N
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 281, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 190));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel5.setText("All Hr's -");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 160, 40));

        tblAllHr.setBackground(new java.awt.Color(173, 192, 234));
        tblAllHr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "        Hr Id", "       User Id", "         Name", "     Phone No", "  Company Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllHr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 710, 190));

        jTextField2.setBackground(new java.awt.Color(243, 246, 254));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 930, 10));

        btnRemoveHr.setBackground(new java.awt.Color(173, 192, 234));
        btnRemoveHr.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRemoveHr.setText("Remove HR");
        btnRemoveHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
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
        AdminHrModuleFrame af=new AdminHrModuleFrame();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveHrActionPerformed
        int row=tblAllHr.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"Please select a row first!");
            return;
        }
        String hrid=(String)tblAllHr.getValueAt(row, 0);
        int resp=JOptionPane.showConfirmDialog(null,"Are you sure, you want to remove"+hrid+" ?","Conformation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        if(resp==JOptionPane.OK_OPTION){
            try{
                String userId=(String)tblAllHr.getValueAt(row,1);
                boolean result=UserDAO.removeUser(userId);
                if(result==true){
                    JOptionPane.showMessageDialog(null,"Record Deleted!","Success!",JOptionPane.INFORMATION_MESSAGE);
                    model.removeRow(row);
                    if(model.getRowCount()==0){
                        btnRemoveHr.setEnabled(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Could Not Delete The Record!","Deletion Failed!",JOptionPane.INFORMATION_MESSAGE);
                }               
            }
            catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
          }
            
        }
        

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
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRemoveHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRemoveHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRemoveHr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAllHr;
    // End of variables declaration//GEN-END:variables
}