/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniele
 */
public class HomeManFinal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public HomeManFinal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ManageEmployeeButton = new javax.swing.JButton();
        SalesRevenueManager = new javax.swing.JButton();
        SalesRevenueManager1 = new javax.swing.JButton();
        ExitButton24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        Title.setFont(new java.awt.Font("STKaiti", 0, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Mormors Kager");
        jPanel3.add(Title, new java.awt.GridBagConstraints());

        Title1.setFont(new java.awt.Font("STKaiti", 0, 24)); // NOI18N
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Manager");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 108, 6, 0);
        jPanel3.add(Title1, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        ManageEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manageemployee.png"))); // NOI18N
        ManageEmployeeButton.setText("Manage Employee");
        ManageEmployeeButton.setToolTipText("");
        ManageEmployeeButton.setActionCommand("");
        ManageEmployeeButton.setIconTextGap(2);
        ManageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEmployeeButtonActionPerformed(evt);
            }
        });

        SalesRevenueManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/revenue.png"))); // NOI18N
        SalesRevenueManager.setText("Sales & Revenue");
        SalesRevenueManager.setToolTipText("");
        SalesRevenueManager.setActionCommand("");
        SalesRevenueManager.setIconTextGap(2);
        SalesRevenueManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesRevenueManagerActionPerformed(evt);
            }
        });

        SalesRevenueManager1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        SalesRevenueManager1.setText("Edit Profile");
        SalesRevenueManager1.setToolTipText("");
        SalesRevenueManager1.setActionCommand("");
        SalesRevenueManager1.setIconTextGap(2);
        SalesRevenueManager1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesRevenueManager1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(ManageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(SalesRevenueManager, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(SalesRevenueManager1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalesRevenueManager, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalesRevenueManager1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        ExitButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        ExitButton24.setToolTipText("");
        ExitButton24.setMaximumSize(new java.awt.Dimension(56, 49));
        ExitButton24.setMinimumSize(new java.awt.Dimension(56, 49));
        ExitButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(ExitButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEmployeeButtonActionPerformed
        // go to manage employee
         ManEmplFinal a = new ManEmplFinal();
        a.setVisible(true);
        a.setDefaultCloseOperation(ManEmplFinal.DISPOSE_ON_CLOSE);
        this.dispose();
                      
    }//GEN-LAST:event_ManageEmployeeButtonActionPerformed

    private void SalesRevenueManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesRevenueManagerActionPerformed
      //  go to Revenue
        ManRevenueFinal a = new ManRevenueFinal();
        a.setVisible(true);
        a.setDefaultCloseOperation(ManRevenueFinal.DISPOSE_ON_CLOSE);
        this.dispose();
    

    }//GEN-LAST:event_SalesRevenueManagerActionPerformed

    private void ExitButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButton24ActionPerformed

    private void SalesRevenueManager1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesRevenueManager1ActionPerformed
 // go to Personal Page Manager
       ManPersFinal a = new ManPersFinal();
        a.setVisible(true);
        a.setDefaultCloseOperation(ManPersFinal.DISPOSE_ON_CLOSE);
        this.dispose();
                               
    }//GEN-LAST:event_SalesRevenueManager1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogManFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogManFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogManFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogManFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeManFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton24;
    private javax.swing.JButton ManageEmployeeButton;
    private javax.swing.JButton SalesRevenueManager;
    private javax.swing.JButton SalesRevenueManager1;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
