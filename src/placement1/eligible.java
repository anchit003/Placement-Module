/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Anchit Chawla
 */
public class eligible extends javax.swing.JFrame {

    /**
     * Creates new form eligible
     */
    public eligible() {
        initComponents();
        display();
    }
    
    void display()
    {
        try
        {
            myconnection obj=new myconnection();
            String k="select * from tbcompany";
        PreparedStatement pst=obj.db.prepareStatement(k);
       
        ResultSet rs;
        rs=pst.executeQuery();
        while(rs.next())
        {
           c1.add(rs.getString("cname"));
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        c2 = new java.awt.Choice();
        label2 = new java.awt.Label();
        t1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        t2 = new java.awt.TextField();
        t3 = new java.awt.TextField();
        t4 = new java.awt.TextField();
        t5 = new java.awt.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        t6 = new java.awt.TextField();
        t7 = new java.awt.TextField();
        c1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        c2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c2ItemStateChanged(evt);
            }
        });
        jPanel1.add(c2);
        c2.setBounds(400, 70, 90, 20);

        label2.setText("Eligible Students");
        jPanel1.add(label2);
        label2.setBounds(170, 70, 97, 20);
        jPanel1.add(t1);
        t1.setBounds(400, 120, 90, 20);

        label1.setText("Company Name");
        jPanel1.add(label1);
        label1.setBounds(170, 20, 94, 20);
        jPanel1.add(t2);
        t2.setBounds(400, 160, 90, 20);
        jPanel1.add(t3);
        t3.setBounds(400, 200, 90, 20);
        jPanel1.add(t4);
        t4.setBounds(400, 240, 90, 20);

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(400, 280, 90, 20);

        label3.setText("Fname");
        jPanel1.add(label3);
        label3.setBounds(170, 120, 43, 20);

        label4.setText("Lname");
        jPanel1.add(label4);
        label4.setBounds(170, 160, 43, 20);

        label5.setText("Age");
        jPanel1.add(label5);
        label5.setBounds(170, 200, 25, 20);

        label6.setText("Contact Number");
        jPanel1.add(label6);
        label6.setBounds(170, 240, 94, 20);

        label7.setText("Email ");
        jPanel1.add(label7);
        label7.setBounds(170, 280, 39, 20);

        label8.setText("Address");
        jPanel1.add(label8);
        label8.setBounds(170, 320, 50, 20);

        label9.setName(""); // NOI18N
        label9.setText("Stream");
        jPanel1.add(label9);
        label9.setBounds(170, 360, 44, 20);
        jPanel1.add(t6);
        t6.setBounds(400, 320, 90, 20);
        jPanel1.add(t7);
        t7.setBounds(400, 360, 90, 20);

        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(400, 20, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anchit Chawla\\Desktop\\sweet-white-blue-swirl-powerpoint-backgrounds.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        // TODO add your handling code here:
        
        try
        {
            myconnection obj=new myconnection();
            String k="select s.rollno from tbstudent s,tbcompany c,tbrequirements r where c.cusername=r.cusername and c.cname=? and s.tenth>=r.Xth and s.twelve>=r.XIIth and s.grade>=r.grade ";
        PreparedStatement pst=obj.db.prepareStatement(k);
        pst.setString(1,c1.getSelectedItem());
        ResultSet rs;
        rs=pst.executeQuery();
        while(rs.next())
        {
           c2.add(rs.getString("rollno"));
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_c1ItemStateChanged

    private void c2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c2ItemStateChanged
        // TODO add your handling code here:
        try
        {
        myconnection obj=new myconnection();
        String j="select * from tbstudent where rollno =?";
        PreparedStatement pst=obj.db.prepareStatement(j);
        pst.setString(1,c2.getSelectedItem());
         ResultSet rs;
        rs=pst.executeQuery();
        while(rs.next())
        {
            t1.setText(rs.getString("Fname"));
            t2.setText(rs.getString("Lname"));
            t3.setText(rs.getString("age"));
            t4.setText(rs.getString("contact"));
            t5.setText(rs.getString("email"));
            t6.setText(rs.getString("address"));
            t7.setText(rs.getString("stream"));
        }
    }
         catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_c2ItemStateChanged

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

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
            java.util.logging.Logger.getLogger(eligible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eligible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eligible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eligible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eligible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice c1;
    private java.awt.Choice c2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField t1;
    private java.awt.TextField t2;
    private java.awt.TextField t3;
    private java.awt.TextField t4;
    private java.awt.TextField t5;
    private java.awt.TextField t6;
    private java.awt.TextField t7;
    // End of variables declaration//GEN-END:variables
}
