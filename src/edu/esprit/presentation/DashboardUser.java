/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.presentation;

import api.RSSReader;
import edu.esprit.dao.EquipeDAO;
import edu.esprit.dao.FavoritsDAO;
import edu.esprit.entite.Equipe;
import edu.esprit.entite.Favorits;
import edu.esprit.entite.Utilisateur;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;

/**
 *
 * @author slimkhan
 */
public class DashboardUser extends javax.swing.JFrame {

    static Utilisateur u = null;
    
    /**
     * Creates new form DashboardUser
     */
    public DashboardUser() {
        initComponents();
        
        RSSReader reader = new RSSReader();
        news.setText(reader.parse("http://www.clubafricain.com/rss.asp"));
          Icon i=new ImageIcon("image/ca.png");
        Eq1.setIcon(i);
    }
    public DashboardUser(Utilisateur u) {
        initComponents();
        this.u = u;
        user.setText(u.getPrenom()+" "+u.getNom());
        
        Favorits f = new Favorits();
        Equipe e = new Equipe();
        FavoritsDAO fv = new FavoritsDAO();
        f = fv.readFavoritsID(u.getId());
        EquipeDAO eq = new EquipeDAO();
        e = eq.readEquipeID(f.getId_equipe());
        
        RSSReader reader = new RSSReader();
        news.setText(reader.parse(e.getFlux()));
        //reader.parse1("http://www.clubafricain.com/rss.asp");
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        play = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Eq2 = new javax.swing.JLabel();
        Eq1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        imgProfil = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        news = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fond = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 773));
        setMinimumSize(new java.awt.Dimension(1200, 773));
        getContentPane().setLayout(null);

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(860, 20, 70, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/equipicon.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 20, 90, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 10, 1207, 78);

        Eq2.setText("jLabel4");
        getContentPane().add(Eq2);
        Eq2.setBounds(530, 390, 45, 16);

        Eq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/est.png"))); // NOI18N
        getContentPane().add(Eq1);
        Eq1.setBounds(100, 370, 60, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rest.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 350, 540, 90);

        user.setText("Nom Prenom");
        getContentPane().add(user);
        user.setBounds(1050, 180, 190, 20);

        jButton1.setText("Ajouter favories");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 70, 160, 29);

        jButton2.setText("Afficher les équipes");
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 110, 160, 29);

        jButton4.setText("Voir les joueurs ");
        getContentPane().add(jButton4);
        jButton4.setBounds(550, 150, 160, 30);

        imgProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile/face1.png"))); // NOI18N
        imgProfil.setMaximumSize(new java.awt.Dimension(100, 100));
        imgProfil.setPreferredSize(new java.awt.Dimension(100, 100));
        imgProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgProfilMouseClicked(evt);
            }
        });
        getContentPane().add(imgProfil);
        imgProfil.setBounds(1010, 10, 160, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile/nom.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1010, 170, 160, 41);

        news.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(news);
        news.setBounds(30, 470, 610, 240);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/news.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 450, 650, 280);

        fond.setForeground(new java.awt.Color(255, 255, 255));
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fond2.png"))); // NOI18N
        fond.setMaximumSize(new java.awt.Dimension(1200, 773));
        fond.setMinimumSize(new java.awt.Dimension(1200, 773));
        getContentPane().add(fond);
        fond.setBounds(0, 0, 1200, 750);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Favorits fav=new Favorits(0, u.getId(),0);
        new AjouterFavorits(fav).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imgProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProfilMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_imgProfilMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Favorits f = new Favorits();
        Equipe e = new Equipe();
        FavoritsDAO fv = new FavoritsDAO();
        f = fv.readFavoritsID(u.getId());
        new tachkila(f.getId_equipe()).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_playMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eq1;
    private javax.swing.JLabel Eq2;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel imgProfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel news;
    private javax.swing.JLabel play;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
