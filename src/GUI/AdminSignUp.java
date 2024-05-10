/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author avumi
 */
public class AdminSignUp extends javax.swing.JFrame {

    /**
     * Creates new form AdminSignUp
     */
    public AdminSignUp() {
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

        jAdminFirstName = new javax.swing.JTextField();
        jAdminLastName = new javax.swing.JTextField();
        jAdminPassword = new javax.swing.JTextField();
        jAdminConfirmPassword = new javax.swing.JTextField();
        jAdminSignUp = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jAdminSignUpBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAdminFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdminFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(jAdminFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 390, 40));
        getContentPane().add(jAdminLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 400, 40));
        getContentPane().add(jAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 400, 40));
        getContentPane().add(jAdminConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 270, 40));

        jAdminSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managers/AdminSignUpsized.png"))); // NOI18N
        getContentPane().add(jAdminSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundPics/home icon resized.jpg"))); // NOI18N
        jButtonHome.setBorder(null);
        getContentPane().add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 80, 100, 50));

        jButtonInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundPics/info button resized.jpg"))); // NOI18N
        jButtonInfo.setBorder(null);
        getContentPane().add(jButtonInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 90, 50));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundPics/back button resized.jpg"))); // NOI18N
        jButtonBack.setBorder(null);
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 50));

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundPics/next button resized.jpg"))); // NOI18N
        jButtonNext.setBorder(null);
        getContentPane().add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 90, 50));

        jAdminSignUpBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\avumi\\OneDrive\\Documents\\NetBeansProjects\\PATAvumileG12\\src\\BackgroundPics\\adminsignupsized.png")); // NOI18N
        getContentPane().add(jAdminSignUpBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAdminFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdminFirstNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jAdminFirstNameActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAdminConfirmPassword;
    private javax.swing.JTextField jAdminFirstName;
    private javax.swing.JTextField jAdminLastName;
    private javax.swing.JTextField jAdminPassword;
    private javax.swing.JLabel jAdminSignUp;
    private javax.swing.JLabel jAdminSignUpBackground;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonNext;
    // End of variables declaration//GEN-END:variables
}
