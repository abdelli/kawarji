/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import edu.esprit.dao.FavoritsDAO;
import edu.esprit.entite.Favorits;

import javax.swing.JOptionPane;

/**
 *
 * @author Wael Mallek
 */
public class AfficherFavorits extends javax.swing.JFrame {

    static Favorits e;
    /**
     * Creates new form AfficherEmployeFavorits
     */
    public AfficherFavorits() {
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeFavorits = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        bntModifier = new javax.swing.JButton();
        Btnsupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Liste Favorits");

        ListeFavorits.setModel(new edu.esprit.presentation.FavoritsTableModel());
        jScrollPane1.setViewportView(ListeFavorits);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Retour.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bntModifier.setText("Modifier");
        bntModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntModifierActionPerformed(evt);
            }
        });

        Btnsupprimer.setText("Supprimer");
        Btnsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btnsupprimer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntModifier)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntModifier)
                    .addComponent(Btnsupprimer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DashboardAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       // entreprise_name.setText(e.getLibelle_entreprise());
    }//GEN-LAST:event_formWindowOpened

    private void bntModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntModifierActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),0).toString());
        int idUtilisateur = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),1).toString());
        int idequipe = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),2).toString());
        Favorits fav=new Favorits(id,idUtilisateur,idequipe);
        this.setVisible(false);
        new AjouterFavorits(fav).setVisible(true);
    }//GEN-LAST:event_bntModifierActionPerformed

    private void BtnsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsupprimerActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),0).toString());
        int idUtilisateur = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),1).toString());
        int idequipe = Integer.parseInt(ListeFavorits.getValueAt(ListeFavorits.getSelectedRow(),2).toString());
        Favorits equipe=new Favorits(id, idUtilisateur,idequipe);
        FavoritsDAO employeDAO = new FavoritsDAO();
        
        if(employeDAO.deleteFavorits(equipe)){
            JOptionPane.showMessageDialog(this, "Supprission effectué avec succès !");
            ListeFavorits.setModel(new edu.esprit.presentation.FavoritsTableModel());

        }
        
    }//GEN-LAST:event_BtnsupprimerActionPerformed

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
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfficherFavorits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfficherFavorits().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnsupprimer;
    private javax.swing.JTable ListeFavorits;
    private javax.swing.JButton bntModifier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
