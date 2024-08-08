/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package h;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/**
 *
 * @author LENOVO
 */
public class customercheck extends javax.swing.JFrame {
    Connection con = null;
    Statement st=null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form customercheck
     */
    public customercheck() {
        
            initComponents();
            SimpleDateFormat obj=new SimpleDateFormat("yyyy/MM/dd");
            Date date=new Date();
            txtdate.setText(obj.format(date));//    above codes are used to print date in (check in date)
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "shreya100");
                } catch (SQLException ex) {
                    Logger.getLogger(customercheck.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customercheck.class.getName()).log(Level.SEVERE, null, ex);
        }
           shreya();
    }
    public void shreya()
    {
        try {
            pst=con.prepareStatement("select * from room where bed=? and roomtype=?");
            pst.setString(1, combobed.getItemAt(combobed.getSelectedIndex()));
            pst.setString(2, comboroom.getItemAt(comboroom.getSelectedIndex()));
            
            rs=pst.executeQuery();
            //combono.removeAllItems();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"The room is added");
                combono.addItem(rs.getString("roomno"));
            }
            pst=con.prepareStatement("select price from room where bed=?");
            pst.setString(1, combono.getItemAt(combono.getSelectedIndex()));
            rs=pst.executeQuery();
             if(rs.next()){
                txtprice.setText(rs.getString("price"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(customercheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtgen = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtnation = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadhar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        combobed = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboroom = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        buttonc = new javax.swing.JButton();
        buttonclear = new javax.swing.JButton();
        combono = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 0, 131, 84));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 83, 35));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("Customer checkin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 6, 214, 64));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 99, 343, 37));

        txtname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 154, 343, 37));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Mobile    Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 209, 343, 40));

        txtmob.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtmob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobActionPerformed(evt);
            }
        });
        getContentPane().add(txtmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 271, 340, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 323, 343, 37));

        txtgen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtgen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        txtgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgenActionPerformed(evt);
            }
        });
        getContentPane().add(txtgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 372, 343, 43));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Nationality");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 442, 343, 38));

        txtnation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtnation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnationActionPerformed(evt);
            }
        });
        getContentPane().add(txtnation, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 497, 343, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Aadhar  Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 565, 343, 35));

        txtadhar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadharActionPerformed(evt);
            }
        });
        getContentPane().add(txtadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 613, 350, 40));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Check in date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 90, 279, 37));

        txtdate.setEditable(false);
        txtdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 154, 310, 37));

        combobed.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        combobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single ", "Double" }));
        getContentPane().add(combobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 268, 310, 34));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Bed Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 209, 279, 32));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Room Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 314, 275, 31));

        comboroom.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        comboroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomActionPerformed(evt);
            }
        });
        getContentPane().add(comboroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 357, 310, 37));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("Room Number");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 432, 279, 29));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setText("Price");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 279, 47));

        txtprice.setEditable(false);
        txtprice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 593, 310, 40));

        buttonc.setBackground(new java.awt.Color(255, 0, 0));
        buttonc.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        buttonc.setForeground(new java.awt.Color(255, 255, 255));
        buttonc.setText("Check in now");
        buttonc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncActionPerformed(evt);
            }
        });
        getContentPane().add(buttonc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 130, 32));

        buttonclear.setBackground(new java.awt.Color(255, 0, 0));
        buttonclear.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        buttonclear.setForeground(new java.awt.Color(255, 255, 255));
        buttonclear.setText("clear");
        buttonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonclearActionPerformed(evt);
            }
        });
        getContentPane().add(buttonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 670, 90, 32));

        combono.setEditable(true);
        getContentPane().add(combono, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 310, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hotel 8.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1100, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtmobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobActionPerformed

    private void txtnationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnationActionPerformed

    private void txtadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadharActionPerformed

    private void txtgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgenActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void buttonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomActionPerformed

    private void buttoncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncActionPerformed
        // TODO add your handling code here:
        try {
            pst=con.prepareStatement("select * from room where bed=? and roomtype=?");
            pst.setString(1, combobed.getItemAt(combobed.getSelectedIndex()));
            pst.setString(2, comboroom.getItemAt(comboroom.getSelectedIndex()));
            
            rs=pst.executeQuery();
            //combono.removeAllItems();
            if(rs.next()){
                JOptionPane.showMessageDialog(this,"The room is added");
                combono.addItem(rs.getString("roomno"));
            }
            pst=con.prepareStatement("select price from room where bed=?");
            pst.setString(1, combono.getItemAt(combono.getSelectedIndex()));
            rs=pst.executeQuery();
             if(rs.next()){
                txtprice.setText(rs.getString("price"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(customercheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttoncActionPerformed

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
            java.util.logging.Logger.getLogger(customercheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customercheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customercheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customercheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customercheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonc;
    private javax.swing.JButton buttonclear;
    private javax.swing.JComboBox<String> combobed;
    private javax.swing.JComboBox<String> combono;
    private javax.swing.JComboBox<String> comboroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtadhar;
    private javax.swing.JTextField txtdate;
    private javax.swing.JComboBox<String> txtgen;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnation;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
