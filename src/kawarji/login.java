/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kawarji;

import java.awt.BorderLayout;

/**
 *
 * @author Jaloul1
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        
        fond.setSize(1021, 436);
        this.add(fond, BorderLayout.CENTER);
        this.pack();
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_Login = new javax.swing.JTextField();
        TXT_MotPass = new javax.swing.JTextField();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(1021, 436));
        setMinimumSize(new java.awt.Dimension(1021, 436));
        getContentPane().setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fb.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 240, 60, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jButton2.setBorder(null);
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 230, 97, 29);

        jButton1.setBackground(new java.awt.Color(255, 144, 67));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/signup.png"))); // NOI18N
        jButton1.setBorder(null);
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 270, 100, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 200, 90, 30);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 160, 80, 30);

        TXT_Login.setToolTipText("");
        TXT_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_Login);
        TXT_Login.setBounds(220, 160, 220, 28);

        TXT_MotPass.setToolTipText("");
        TXT_MotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_MotPassActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_MotPass);
        TXT_MotPass.setBounds(220, 200, 220, 28);

        fond.setIcon(new javax.swing.ImageIcon("/Users/Jaloul1/Dropbox/Projet c++/java/kawarji/src/image/1192805705_1024x768_football-on-the-grass copie.jpg")); // NOI18N
        fond.setMaximumSize(new java.awt.Dimension(923, 435));
        fond.setMinimumSize(new java.awt.Dimension(923, 435));
        fond.setPreferredSize(new java.awt.Dimension(923, 435));
        getContentPane().add(fond);
        fond.setBounds(0, 0, 1020, 435);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_LoginActionPerformed

    private void TXT_MotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_MotPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_MotPassActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXT_Login;
    private javax.swing.JTextField TXT_MotPass;
    private javax.swing.JLabel fond;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}