/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControllerPekerja;
import controller.ControllerDashboard;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author A409JB
 */
public class dashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form dashboardAdmin
     */
    ControllerDashboard ctDs;
    ControllerPekerja ctPkr;
    
    public dashboardAdmin() {
        initComponents();
        ctPkr = new ControllerPekerja(this);
        ctDs = new ControllerDashboard(this);
        ctDs.isiTabel();
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
        txtCariPekerja = new javax.swing.JTextField();
        panel2 = new java.awt.Panel();
        btnCariPekerja = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnDashboardAdmin = new javax.swing.JButton();
        btnAktivitas = new javax.swing.JButton();
        btnAkunProfil = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPekerja = new javax.swing.JTable();
        txtNamaPekerja = new javax.swing.JTextField();
        txtIdPekerja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDeletePekerja = new javax.swing.JButton();
        btnSavePekerja1 = new javax.swing.JButton();
        btnEditPekerja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 249, 249));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("OVERVIEW");

        txtCariPekerja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCariPekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariPekerjaActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        btnCariPekerja.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCariPekerja.setText("Cari");
        btnCariPekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPekerjaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnCariPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCariPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCariPekerja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCariPekerja, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDashboardAdmin.setBackground(new java.awt.Color(63, 81, 181));
        btnDashboardAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDashboardAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboardAdmin.setText("DASHBOARD");

        btnAktivitas.setBackground(new java.awt.Color(63, 81, 181));
        btnAktivitas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAktivitas.setForeground(new java.awt.Color(255, 255, 255));
        btnAktivitas.setText("AKTIVITAS");
        btnAktivitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAktivitasActionPerformed(evt);
            }
        });

        btnAkunProfil.setBackground(new java.awt.Color(63, 81, 181));
        btnAkunProfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAkunProfil.setForeground(new java.awt.Color(255, 255, 255));
        btnAkunProfil.setText("AKUN");
        btnAkunProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAkunProfilActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(63, 81, 181));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGO");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboardAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAktivitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAkunProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnDashboardAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnAktivitas)
                .addGap(18, 18, 18)
                .addComponent(btnAkunProfil)
                .addContainerGap(497, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PEKERJA");

        tabelPekerja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Pekerja", "ID Pekerja"
            }
        ));
        tabelPekerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPekerjaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPekerja);

        txtNamaPekerja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtIdPekerja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdPekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPekerjaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nama Pekerja");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID Pekerja");

        btnDeletePekerja.setText("HAPUS");
        btnDeletePekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePekerjaActionPerformed(evt);
            }
        });

        btnSavePekerja1.setText("SIMPAN");
        btnSavePekerja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePekerja1ActionPerformed(evt);
            }
        });

        btnEditPekerja.setText("EDIT");
        btnEditPekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPekerjaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNamaPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSavePekerja1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDeletePekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEditPekerja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletePekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSavePekerja1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariPekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPekerjaActionPerformed
        ctDs.search();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariPekerjaActionPerformed

    private void txtCariPekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariPekerjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariPekerjaActionPerformed
    // TODO add your handling code here:

    private void btnAktivitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAktivitasActionPerformed
        AktivitasAwal Aa =  new AktivitasAwal();
        Aa.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnAktivitasActionPerformed

    private void btnAkunProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAkunProfilActionPerformed
        Accounts acc =  new Accounts();
        acc.setVisible(true);
        this.dispose();//        // TODO add your handling code here:
    }//GEN-LAST:event_btnAkunProfilActionPerformed

    private void txtIdPekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPekerjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPekerjaActionPerformed

    private void btnEditPekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPekerjaActionPerformed
        ctPkr.update();
        ctPkr.reset();
        ctDs.isiTabel();// TODO add your handling code here:
    }//GEN-LAST:event_btnEditPekerjaActionPerformed

    private void btnSavePekerja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePekerja1ActionPerformed
        ctPkr.insert();
        ctPkr.reset();
        ctDs.isiTabel();// TODO add your handling code here:
    }//GEN-LAST:event_btnSavePekerja1ActionPerformed

    private void btnDeletePekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePekerjaActionPerformed
        ctPkr.delete();
        ctPkr.reset(); 
        ctDs.isiTabel();// TODO add your handling code here:
    }//GEN-LAST:event_btnDeletePekerjaActionPerformed

    private void tabelPekerjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPekerjaMouseClicked
        int row = tabelPekerja.getSelectedRow();
        ctDs.isiField(row);        // TODO add your handling code here:
    }//GEN-LAST:event_tabelPekerjaMouseClicked

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
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new dashboardAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAktivitas;
    private javax.swing.JButton btnAkunProfil;
    private javax.swing.JButton btnCariPekerja;
    private javax.swing.JButton btnDashboardAdmin;
    private javax.swing.JButton btnDeletePekerja;
    private javax.swing.JButton btnEditPekerja;
    private javax.swing.JButton btnSavePekerja1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTable tabelPekerja;
    private javax.swing.JTextField txtCariPekerja;
    private javax.swing.JTextField txtIdPekerja;
    private javax.swing.JTextField txtNamaPekerja;
    // End of variables declaration//GEN-END:variables
    public JButton getBtnCariPekerja() {
        return btnCariPekerja;
    }

    public JTextField getTxtCariPekerja() {
        return txtCariPekerja;
    }
    
    public JTable getTabelPekerja(){
        return tabelPekerja;
    }
    
    public JButton getBtnDashboardAdmin() {
        return btnDashboardAdmin;
    }

    public JButton getBtnAktivitas() {
        return btnAktivitas;
    }

    public JButton getBtnAkunProfil() {
        return btnAkunProfil;
    }
    
    public JTextField gettxtIdPekerja() {
        return txtIdPekerja;
    }
    
    public JTextField gettxtNamaPekerja() {
        return txtNamaPekerja;
    }
}
