/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_stock_management;

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        
        
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setViewportBorder(null);
        
        jTextArea2.setBorder(null);
        jTextArea2.setBackground(new Color(255,255,255,180));
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
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(798, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(798, 750));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ABC Stock Management ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 10, 800, 50);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel1.setText("Developed By : ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 620, 160, 20);

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("M19980307007");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 660, 310, 20);

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel3.setText("CINEC ID        :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 660, 160, 20);

        jLabel4.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("M.Kasun Vimukthii Perera");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 620, 310, 20);

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("(PVT) Ltd");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 70, 800, 50);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("\t\tABC stock management company is a privately run stock warehouse \nbased in Katunayaka, Sri Lanka. This Application ");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(80, 170, 630, 410);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loading-43.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 750);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 750);

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
