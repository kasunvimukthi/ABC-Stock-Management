/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_stock_management;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Supplier_Register extends javax.swing.JFrame {

    /**
     * Creates new form Supplier_Register
     */
    public Supplier_Register() {
        initComponents();
        jPanel2.setBackground(new Color(255,255,255,180));
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("New Supplier Register");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(160, 0, 280, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(300, 80, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Address");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 220, 190, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 80, 190, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(90, 150, 190, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("E-mail");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 290, 190, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contact number");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(90, 360, 190, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(300, 220, 220, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField5FocusLost(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(300, 290, 220, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(300, 150, 220, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(300, 360, 220, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(370, 430, 150, 40);

        jButton4.setText("Admin Home");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 20, 100, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel12);
        jLabel12.setBounds(470, 20, 150, 20);

        jButton3.setText("Log_Out");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(470, 40, 150, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 100, 630, 500);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ABC Stock Management (PVT)Ltd");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(150, 10, 700, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/warehouse-icon-green-vector-19381797.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(4, 4, 1000, 750);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().trim().toLowerCase().equals("supplier_name"))
        {
            jTextField1.setText("");
            jTextField1.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText().trim().equals("") ||
            jTextField1.getText().trim().toLowerCase().equals("supplier_name"))
        {
            jTextField1.setText("supplier_name");
            jTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if(jTextField2.getText().trim().toLowerCase().equals("id"))
        {
            jTextField2.setText("");
            jTextField2.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        if(jTextField2.getText().trim().equals("") ||
            jTextField2.getText().trim().toLowerCase().equals("id"))
        {
            jTextField2.setText("id");
            jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        if(jTextField3.getText().trim().toLowerCase().equals("contact_number"))
        {
            jTextField3.setText("");
            jTextField3.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        if(jTextField3.getText().trim().equals("") ||
            jTextField3.getText().trim().toLowerCase().equals("contact_number"))
        {
            jTextField3.setText("contact_number");
            jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jTextField2.getText();
        String name = jTextField1.getText();
        String address = jTextField4.getText();
        String email = jTextField5.getText();
        String phone = jTextField3.getText();

        if(verifyFields())
        {
            if(!ID(id))
            {
                PreparedStatement ps;
                ResultSet rs;

                String registerUserQuery = "INSERT INTO `supplier`(`Supplier_ID`, `Supplier_Name`, `Address`, `Contact_Number`, `Email`) VALUES (?,?,?,?,?)";

                try {
                    ps = ClientDB.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, id);
                    ps.setString(2, name);
                    ps.setString(3, address);
                    ps.setString(4, phone);
                    ps.setString(5, email);

                    if(ps.executeUpdate() !=0){
                        JOptionPane.showMessageDialog(null, "Supplier Registerd Now");

                        Order_Product lf = new Order_Product();
                        lf.setVisible(true);
                        lf.pack();
                        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                        Order_Product.jLabel12.setText(Supplier_Register.jLabel12.getText());

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Supplier_Register.class.getName()).log(Level.SEVERE, null, ex);

                }
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // create a function to verify the empty fields  
    public boolean verifyFields()
    {
        String id = jTextField2.getText();
        String name = jTextField1.getText();
        String address = jTextField4.getText();
        String email = jTextField5.getText();
        String phone = jTextField3.getText();
        
        // check empty fields
        if(name.trim().equals("") || phone.trim().equals("") || id.trim().equals("") || address.trim().equals("")  
           || email.trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    // create a unction to check if the entred username already exists in the database
    public boolean ID(String ID){
        
        PreparedStatement st;
        ResultSet rs;
        boolean ID_exist = false;
        
        String query = "SELECT * FROM `supplier` WHERE `Supplier_ID` = ?";
        
        try {
            
            st = AdminDB.getConnection().prepareStatement(query);
            st.setString(1, ID);
            rs = st.executeQuery();
        
            if(rs.next())
            {
                ID_exist = true;
                JOptionPane.showMessageDialog(null, "This Supplier ID is Already Registerd, Choose Another One", "Supplier ID Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Supplier_Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ID_exist;
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        if(jTextField4.getText().trim().toLowerCase().equals("address"))
        {
            jTextField4.setText("");
            jTextField4.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        if(jTextField4.getText().trim().equals("") ||
            jTextField4.getText().trim().toLowerCase().equals("address"))
        {
            jTextField4.setText("address");
            jTextField4.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
        if(jTextField5.getText().trim().toLowerCase().equals("e_mail"))
        {
            jTextField5.setText("");
            jTextField5.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusLost
        // TODO add your handling code here:
        if(jTextField5.getText().trim().equals("") ||
            jTextField5.getText().trim().toLowerCase().equals("e_mail"))
        {
            jTextField5.setText("e_mail");
            jTextField5.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField5FocusLost

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Admin_Home lf = new Admin_Home();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        Admin_Home.jLabel9.setText(Supplier_Register.jLabel12.getText());
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Admin_Login lf = new Admin_Login();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }//GEN-LAST:event_jTextField3KeyTyped

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
            java.util.logging.Logger.getLogger(Supplier_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
