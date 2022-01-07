/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_stock_management;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Sale_Price_Set extends javax.swing.JFrame {
    //Set connection
    
     DefaultTableModel model;
        Connection con;
        PreparedStatement pst;
        PreparedStatement pst1;
        PreparedStatement pst2;
        PreparedStatement pst3;
        PreparedStatement pst4;
        
        ResultSet rs=null;

    /**
     * Creates new form Sale_Price_Set
     */
    public Sale_Price_Set() {
        initComponents();
         con = (Connection) ClientHomeDB.connect();
        updateCombo();//run update combo 
        updateCombo1();
        Update_table();
        jPanel2.setBackground(new Color(255,255,255,180));
        jPanel1.setBackground(new Color(255,255,255,180));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Salling Price Set for Product");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 20, 270, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Product" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(390, 140, 100, 30);

        jLabel2.setText("Select Product");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 140, 110, 30);

        jLabel4.setText("Product Code");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 180, 110, 30);

        jLabel5.setText("Cost Price - per item");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 220, 110, 30);

        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 260, 110, 30);

        jLabel7.setText("Profit /lost - per item");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 340, 120, 30);

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(390, 180, 100, 30);

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(390, 220, 100, 30);

        jTextField4.setEditable(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(390, 260, 100, 30);

        jTextField5.setEditable(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(390, 340, 100, 30);

        jButton1.setText("Set");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 400, 73, 30);

        jLabel8.setText("Selling Price - per item");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 300, 110, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(390, 300, 100, 30);

        jTabbedPane1.addTab("Price Set & Selling", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "Sale_Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 220, 720, 270);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Change");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(530, 160, 90, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("New Sale Price ");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 160, 140, 30);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setEnabled(false);
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(190, 120, 180, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Previous Sale Price");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 120, 140, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(190, 160, 180, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Select Item");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 80, 100, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=Select Item=" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(190, 80, 180, 30);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Item ID");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(370, 80, 100, 30);
        jPanel2.add(jLabel21);
        jLabel21.setBounds(480, 80, 70, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Selling Price Change");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(220, 10, 270, 40);

        jTabbedPane1.addTab("Selling Price Change", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(120, 110, 770, 550);

        jButton4.setText("Admin Home");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(120, 70, 100, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel12);
        jLabel12.setBounds(740, 70, 150, 20);

        jButton3.setText("Log out");
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
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 90, 150, 23);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ABC Stock Management (PVT)Ltd");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(150, 10, 700, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/warehouse-icon-green-vector-19381797.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1000, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

     // update combobox
    private void updateCombo(){
        String sql = "select * from warehouse1";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                jComboBox1.addItem(rs.getString("Item_Name"));
                
            }
        
        
        
        } catch (Exception e){
        }
    
    }
    private void updateCombo1(){
        String sql = "select * from  ready_to_sales_stock";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                jComboBox2.addItem(rs.getString("Product_Name"));
                
            }
        
        
        
        } catch (Exception e){
        }
    
    }
    
    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        // combo box item click & get price in to the label
        System.out.println(jComboBox1.getSelectedItem().toString());

        String tmp = (String) jComboBox1.getSelectedItem();
        String sql = "SELECT * FROM warehouse1 WHERE Item_Name=?";
        try {
            pst = con.prepareStatement(sql);//1
            pst.setString(1, tmp);//1
            rs = pst.executeQuery();//1
            if(rs.next()){//1
                String add1 = rs.getString("Item_Code");//1
                jTextField2.setText(add1);//1
                
                String add2 = rs.getString("Item_Price");//1
                jTextField3.setText(add2);//1
                
                String add3 = rs.getString("Quantity");//1
                jTextField4.setText(add3);//1


                
            }//1
        } catch (Exception e) {//1
            JOptionPane.showMessageDialog(null, e);//1
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        set();
    }//GEN-LAST:event_jButton1ActionPerformed

     public void set()     // insert data to mysql
    {
     
         String Pname = (String) jComboBox1.getSelectedItem();
        
        String Item_Cod1 = jTextField2.getText();
        String SaleP = jTextField1.getText();
        
        String Quantity1 = jTextField4.getText();
        
        
        try {
             String query1 = "insert into ready_to_sales_stock(Product_ID,Product_Name,Sale_Price,Quantity)values(?,?,?,?)";
            
            pst2 = con.prepareStatement(query1,Statement.RETURN_GENERATED_KEYS);
            pst2.setString(1, Item_Cod1);
            pst2.setString(2, Pname);
            pst2.setString(3, SaleP);
            pst2.setString(4, Quantity1);
            
           
            
            
            pst2.executeUpdate();
            rs = pst2.getGeneratedKeys();
            
            
            
        }catch (SQLException e) {
            Logger.getLogger(Sale_Price_Set.class.getName()).log(Level.SEVERE, null, e);
        
        }
        delete();
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

     public void delete()     // insert data to mysql
     {
         try{
             
             String id = jTextField2.getText();
             
             
             
             pst4=con.prepareStatement("delete from warehouse1 where Item_Code = ?");
             pst4.setString(1, id);
             
             pst4.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "Salling Price Change & Move to the Ready to sale !!!");
             
         
            
            
                    
         }catch (SQLException e) {
             Logger.getLogger(Sale_Price_Set.class.getName()).log(Level.SEVERE, null, e);
         
             
         }
     }
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
         // Multipel ITEMS & PRICE
        
        double a,b,c;
        a=Double.parseDouble(jTextField1.getText());
        b=Double.parseDouble(jTextField3.getText());
        c=a-b;

        //set decimal format
        DecimalFormat df = new DecimalFormat("#.##");
        jTextField5.setText(df.format(c));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:

        // combo box item click & get price in to the label
        System.out.println(jComboBox2.getSelectedItem().toString());

        String tmp = (String) jComboBox2.getSelectedItem();
        String sql = "SELECT * FROM ready_to_sales_stock WHERE Product_Name=?";
        try {
            pst = con.prepareStatement(sql);//1
            pst.setString(1, tmp);//1
            rs = pst.executeQuery();//1
            if(rs.next()){//1
                String add1 = rs.getString("Sale_Price");//1
                jLabel13.setText(add1);//1

                String add3 = rs.getString("Product_ID");//2
                jLabel21.setText(add3);//2

                jTextField1.requestFocus();
            }//1
        } catch (Exception e) {//1
            JOptionPane.showMessageDialog(null, e);//1
        }
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
       
        String limit = jTextField1.getText();

        //          get length of string
        int length = limit.length();
        char c = evt.getKeyChar();

        // check for number 0 to 9
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){

            // check for length not more than 5 digit
            if(length<5){
                jTextField1.setEditable(true);
            }else{
                jTextField1.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jTextField1.setEditable(true);
            }else{
                jTextField1.setEditable(true);
            }
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        change();
    }//GEN-LAST:event_jButton2MouseClicked

     public void change()    { // updte data to mysql......................................................................
           try { 
               String query3 = "update ready_to_sales_stock set Sale_Price = ? where Product_ID = ? ";//1
               pst = con.prepareStatement(query3);//1
               
               {
                String name1 = (String) jLabel21.getText();//1
                String newprice = jTextField6.getText();//1

                pst.setString(1, newprice);//1
                pst.setString(2, name1);//1
                pst.executeUpdate();//1
            }
               
               JOptionPane.showMessageDialog(this, "Product Price Change....!");
               
               }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
           Update_table();
           }
     
     private void Update_table(){ //sql data view in jtable
        
        try {
        String sql = "select * from  ready_to_sales_stock";
        
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            Logger.getLogger(Sale_Price_Set.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
            
        }
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Admin_Home lf = new Admin_Home();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        Admin_Home.jLabel9.setText(Sale_Price_Set.jLabel12.getText());
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Sale_Price_Set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Price_Set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Price_Set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Price_Set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale_Price_Set().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
