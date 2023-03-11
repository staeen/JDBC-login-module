/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

/**
 *
 * @author stan
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    public Result() {
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

        bgPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTable = new javax.swing.JTable();
        jLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));

        sidePanel.setBackground(new java.awt.Color(0, 153, 153));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icons8-processor-100.png"))); // NOI18N

        title.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("8 Bits Engineer");

        title1.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Creating Solutions");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(title1)
                    .addComponent(title)
                    .addComponent(icon))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title)
                .addGap(48, 48, 48)
                .addComponent(title1)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icons8-cancel-35.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        outputTable.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        outputTable.setForeground(new java.awt.Color(0, 153, 153));
        outputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(outputTable);

        jLabel.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 153, 153));
        jLabel.setText("Result ");

        logoutButton.setBackground(new java.awt.Color(0, 153, 153));
        logoutButton.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LogOut");
        logoutButton.setMaximumSize(new java.awt.Dimension(38, 15));
        logoutButton.setMinimumSize(new java.awt.Dimension(38, 15));
        logoutButton.setPreferredSize(new java.awt.Dimension(38, 15));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addComponent(closeLabel)
                .addGap(29, 29, 29)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/icons8-back-arrow-30.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(backLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        
        Userac ac = new Userac();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backLabelMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.hide();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel icon;
    public static javax.swing.JLabel jLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    public static javax.swing.JTable outputTable;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
