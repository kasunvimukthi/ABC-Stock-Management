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

import java.text.DateFormat;
import java.text.DecimalFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author ASUS
 */
public class Client_Home1 extends javax.swing.JFrame {
    // Set date
    DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    DefaultTableModel model;
    
            
    
    
    
    
     //Set connection
        Connection con;
        PreparedStatement pst;
        PreparedStatement pst1;
        PreparedStatement pst2;
        PreparedStatement pst3;
        PreparedStatement pst4;
        
        ResultSet rs=null;
        
        int total=0;
        int cash=0;
        int balance = 0;
        
        //int balance1;
        int [] balance2 = new int[10];
    
    

    

    /**
     * Creates new form Client_Home
     */
    public Client_Home1() {
        
        
        
        initComponents();
        
        con = (Connection) ClientHomeDB.connect();
        updateCombo();//run update combo 
        
        jLabel11.setText(" " + dateFormat.format(date));// Date apply to the Lable 
        //setLocationRealativeTo(null);
        jPanel3.setBackground(new Color(204,204,204,180));
        jPanel2.setBackground(new Color(255,255,255,180));
        Update_table2();
        
    }
    //void usernames(String users){
        //jTextField2.setText(users);
    
    //}
    
    
    public void sales()     // insert data to mysql
    {
        double totalcost,balance1;
        
        String name = jLabel12.getText();
        totalcost = Double.parseDouble(jLabel17.getText());
        String pay = jTextField2.getText();
        balance1 = Double.parseDouble(jLabel16.getText());
        String date1 = jLabel11.getText();
        String status = "Pending";
        
        
        int id = 0;
        
        
        try {
            String query = "insert into sales(Name,Date,Total_Cost,Payment,Balance,Approve)values(?,?,?,?,?,?)";
            
            pst1 = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pst1.setString(1, name);
            pst1.setString(2, date1);
            pst1.setDouble(3, totalcost);
            pst1.setString(4, pay);
            pst1.setDouble(5, balance1);
            pst1.setString(6, status);
            
            pst1.executeUpdate();
            rs = pst1.getGeneratedKeys();
            
            if (rs.next())
            {
                id = rs.getInt(1);
            
            }
            int rows = jTable1.getRowCount();
            
            
            String query1 = "insert into sales_product(Invoice_No,Product_ID,Product_Name,Price,Quantity,Total)values(?,?,?,?,?,?)";
            
            pst2 = con.prepareStatement(query1);
            
            String Product_ID;
            String Product_Name = "";
            double Total,Price;
            String Quantity;
            Total = 0;
            
            for(int i =0; i<jTable1.getRowCount(); i++)
            {
                Product_ID = (String)jTable1.getValueAt(i, 1);
                Product_Name = (String)jTable1.getValueAt(i, 2);
                Price = Double.valueOf(jTable1.getValueAt(i, 3).toString());
                Quantity = (String)jTable1.getValueAt(i, 4);
                Total = Double.valueOf(jTable1.getValueAt(i, 5).toString());
                
                
                pst2.setInt(1, id);
                pst2.setString(2, Product_ID);
                pst2.setString(3, Product_Name);
                pst2.setDouble(4, Price);
                pst2.setString(5, Quantity);
                pst2.setDouble(6, Total);
                
                pst2.executeUpdate();
            
                jLabel7.setText(Integer.toString(id));
               
                
            }
            
            

                JOptionPane.showMessageDialog(this, "Your Request Sent for Admin....!");
        
        //.......................................................................................
           
          
        } catch (SQLException e) {
            Logger.getLogger(Client_Home1.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
    Update_table2();
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
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setLayout(null);

        jButton3.setText("Log_out");
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
        jPanel3.add(jButton3);
        jButton3.setBounds(790, 30, 150, 23);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLabel12);
        jLabel12.setBounds(790, 10, 150, 20);

        jButton5.setText("Home");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(20, 10, 100, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Company" }));
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
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(170, 10, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Select Company");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 10, 100, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(170, 90, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("One Share Price");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 50, 140, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 50, 220, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(280, 550, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Quantity");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 90, 140, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Add ");
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
        jButton2.setBounds(430, 170, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Cost");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 390, 140, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 170, 220, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Date");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 130, 140, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(170, 130, 220, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Company_ID", "Company", "Price", "Quantity", "Value"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 210, 520, 170);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Payment");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 430, 140, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Your Invoice Number");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(0, 510, 150, 30);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.setOpaque(true);
        jLabel16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel16KeyTyped(evt);
            }
        });
        jPanel2.add(jLabel16);
        jLabel16.setBounds(170, 470, 220, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(170, 430, 220, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Cost");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 170, 140, 30);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.setOpaque(true);
        jPanel2.add(jLabel17);
        jLabel17.setBounds(170, 390, 220, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(170, 510, 220, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Balance");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(0, 470, 140, 30);
        jPanel2.add(jLabel19);
        jLabel19.setBounds(390, 90, 110, 30);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Company  ID");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(320, 10, 100, 30);
        jPanel2.add(jLabel21);
        jLabel21.setBounds(430, 10, 70, 30);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Availabale Stock");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(290, 90, 100, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(532, 50, 380, 540);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Availabale Stock");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(530, 20, 380, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(30, 50, 920, 600);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Investments");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(120, 10, 670, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 60, 970, 650);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("ABC Stock Management (PVT)Ltd");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(150, 10, 700, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/warehouse-icon-green-vector-19381797.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Normal Print
    //public void printing()
    //{
       // MessageFormat header=new MessageFormat("ABC stock management (PVT)Ltd ");
       // MessageFormat footer=new MessageFormat("Page{0,number,integer}");
       // try{
        //   jTable1.print(JTable.PrintMode.NORMAL,header,footer);
       // }catch(Exception e){

       // }
       // return ;
   // }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    // update combobox
    private void updateCombo(){
        String sql = "select * from ready_to_sales_stock";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                jComboBox1.addItem(rs.getString("Product_Name"));
                
            }
        
        
        
        } catch (Exception e){
        }
    
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        

         
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
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
                 
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      //............................................stock loop....................  
        try {
            
            
            String acode = jLabel21.getText();
            
            
            
            pst3=con.prepareStatement("select * from ready_to_sales_stock where Product_ID = ?");
            pst3.setString(1, acode);
            rs = pst3.executeQuery();
            
            while(rs.next())
            {
                int currentqty;
                currentqty = rs.getInt("Quantity");
                
                int qty = Integer.parseInt(jTextField1.getText());
                
                
                if(qty >= currentqty)
                {
                    JOptionPane.showMessageDialog(this, "This Shares Out of Stock");
                    jTextField1.setText("");
                    jLabel5.setText("");
                    jComboBox1.setSelectedItem("Select Company");
                    jLabel9.setText("");
                    jTextField1.setText("");
                }
                
                
                
            }if (rs.next()){
                
            }
        //......................................................
    if( jLabel11.getText().equals("") || jComboBox1.getSelectedItem().equals("") || jLabel5.getText().equals("") || jTextField1.getText().equals("") || jLabel9.getText().equals("")) {
    
        JOptionPane.showMessageDialog(this, "Please Enter All Data");
        
    }else{
        
        String data[] = {jLabel11.getText(),jLabel21.getText(),jComboBox1.getSelectedItem().toString(), jLabel5.getText(),jTextField1.getText(),jLabel9.getText()};
        
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        
        tblModel.addRow(data);
        
        JOptionPane.showMessageDialog(this, "Add Successfully....!");
    }
    jTextField1.setText("");
    jLabel5.setText("");
    jComboBox1.setSelectedItem("Select Company");
    jLabel9.setText("");
    
    
    // get total cost into the label
    {
     int numrow = jTable1.getRowCount();
        
        double tot = 0;
        
        for (int i = 0; i < numrow; i++) {
            double val = Double.valueOf(jTable1.getValueAt(i, 5).toString());
            tot += val ;
            
            
        }
        jLabel17.setText(Double.toString(tot));
    }//....................................................................................
    } catch (SQLException ex) {
            Logger.getLogger(Client_Home1.class.getName()).log(Level.SEVERE, null, ex);
        }
       //JOptionPane.showMessageDialog(this,"Please Enter All Data");
       
    Update_table2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        
        // Multipel ITEMS & PRICE
        int b;
        double a,c;
        a=Double.parseDouble(jLabel5.getText());
        b=Integer.parseInt(jTextField1.getText());
        c=a*b;
        
         //set decimal format
        DecimalFormat df = new DecimalFormat("#.##");
        jLabel9.setText(df.format(c));
        
        
        
        
            
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Client_Login lf = new Client_Login();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        // combo box item click & get price in to the label
        System.out.println(jComboBox1.getSelectedItem().toString());
      
        String tmp = (String) jComboBox1.getSelectedItem();
        String sql = "SELECT * FROM ready_to_sales_stock WHERE Product_Name=?";
        try {
            pst = con.prepareStatement(sql);//1
            pst.setString(1, tmp);//1
            rs = pst.executeQuery();//1
            if(rs.next()){//1
            String add1 = rs.getString("Sale_Price");//1
            jLabel5.setText(add1);//1
            
            String add2 = rs.getString("Quantity");//2
            jLabel19.setText(add2);//2
            
            String add3 = rs.getString("Product_ID");//2
            jLabel21.setText(add3);//2
            
            jTextField1.requestFocus();
            }//1
        } catch (Exception e) {//1
            JOptionPane.showMessageDialog(null, e);//1
        }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jLabel16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel16KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel16KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        // Subtraction Payment & Cost
        
        double a,b,c;
        a=Double.parseDouble(jTextField2.getText());
        b=Double.parseDouble(jLabel17.getText());
        c=a-b;
        
         //set decimal format
        DecimalFormat df = new DecimalFormat("#.##");
        jLabel16.setText(df.format(c));
        
        
        sales();
        
        // clear
        jTextField2.setText("");
    jLabel16.setText("");
    jLabel17.setText("");
    
    jTable1.setModel(new DefaultTableModel(null,new String[]{"Date","Item","Price","Quantity","Value"}));
    //......................................................................................................
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       // String query="INSERT INTO `cash`(`name`,`mno`,`address`,`email`,`password`) VALUES('"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"');";
    //executeSQlQuery(query, "Inserted");
    }//GEN-LAST:event_jButton1ActionPerformed

     private void Update_table(){ //sql data view in jtable
        
        try {
        String sql = "select * from warehouse1 ";
        
            
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
           
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            Logger.getLogger(Warehouse.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
            
        }
        }
        private void Update_table2(){ //sql data view in jtable
        
        try {
        String sql = "select Product_ID,Product_Name,Sale_Price,Quantity from  ready_to_sales_stock ";
        
            
            pst2 = con.prepareStatement(sql);
            rs = pst2.executeQuery();
            
            
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            Logger.getLogger(Client_Home1.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        }
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        Client_Main_Home lf = new Client_Main_Home();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        Client_Main_Home.jLabel12.setText(Client_Home1.jLabel12.getText());
        
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Client_Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Client_Home1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
}
