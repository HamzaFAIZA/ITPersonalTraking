/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerEquipe;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author faiza
 */
public class ViewEquipe extends javax.swing.JFrame {

    /**
     * Creates new form ViewEquipe
     */
    public ViewEquipe() {
        initComponents();
    }

    public JTable getjTableEquipe() {
        return jTableEquipe;
    }

    public JTextField getjTextIdEquipe() {
        return jTextIdEquipe;
    }

    public JButton getjButtonAjoutEquipe() {
        return jButtonAjoutEquipe;
    }

    public JComboBox getjComboBoxListeRessource() {
        return jComboBoxListeRessource;
    }

    public JButton getjButtonAjoutRessource() {
        return jButtonAjoutRessource;
    }

    public JComboBox getjComboEquipe() {
        return jComboEquipe;
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
        jLabel2 = new javax.swing.JLabel();
        jTextIdEquipe = new javax.swing.JTextField();
        jComboBoxListeRessource = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipe = new javax.swing.JTable();
        jButtonAjoutEquipe = new javax.swing.JButton();
        jButtonAjoutRessource = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboEquipe = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Liste des Ressources :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Identifiant de l'équipe :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));
        getContentPane().add(jTextIdEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, 30));

        getContentPane().add(jComboBoxListeRessource, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 160, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Gestion des équipes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 330, 50));

        jTableEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(jTableEquipe);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 190, 210));

        jButtonAjoutEquipe.setText("Ajouter une équipe");
        getContentPane().add(jButtonAjoutEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, 30));

        jButtonAjoutRessource.setText("Ajouter la ressource à l'équipe");
        getContentPane().add(jButtonAjoutRessource, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Liste des Equipes :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 120, 30));

        jComboEquipe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Séléctionner une équipe---" }));
        getContentPane().add(jComboEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/gestion-financiere-gain-pmu.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewEquipe v=new ViewEquipe();
                ControllerEquipe c=new ControllerEquipe(v);
                v.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjoutEquipe;
    private javax.swing.JButton jButtonAjoutRessource;
    private javax.swing.JComboBox jComboBoxListeRessource;
    private javax.swing.JComboBox jComboEquipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquipe;
    private javax.swing.JTextField jTextIdEquipe;
    // End of variables declaration//GEN-END:variables
}
