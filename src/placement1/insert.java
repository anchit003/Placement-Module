/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement1;

import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;

/**
 *
 * @author Anchit Chawla
 */
public class insert extends javax.swing.JFrame {

    /**
     * Creates new form insert
     */
    public insert() {
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

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        t1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        t2 = new java.awt.TextField();
        t3 = new java.awt.TextField();
        t4 = new java.awt.TextField();
        t5 = new java.awt.TextField();
        t6 = new java.awt.TextField();
        t7 = new java.awt.TextField();
        t8 = new java.awt.TextField();
        t12 = new java.awt.TextField();
        t10 = new java.awt.TextField();
        t9 = new java.awt.TextField();
        t11 = new java.awt.TextField();
        label13 = new java.awt.Label();
        t14 = new java.awt.TextField();
        label16 = new java.awt.Label();
        t15 = new java.awt.TextField();
        t13 = new java.awt.TextField();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        label1.setText("Roll No");
        jPanel1.add(label1);
        label1.setBounds(90, 60, 80, 20);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1);
        t1.setBounds(220, 60, 80, 20);

        label2.setText("Fname");
        jPanel1.add(label2);
        label2.setBounds(90, 110, 80, 20);

        label3.setText("Lname");
        jPanel1.add(label3);
        label3.setBounds(90, 160, 80, 20);

        label4.setText("father");
        jPanel1.add(label4);
        label4.setBounds(90, 210, 80, 20);

        label5.setText("age");
        jPanel1.add(label5);
        label5.setBounds(90, 310, 80, 20);

        label6.setText("contact");
        jPanel1.add(label6);
        label6.setBounds(90, 260, 80, 20);

        label7.setText("email");
        jPanel1.add(label7);
        label7.setBounds(90, 360, 80, 20);

        label8.setText("address");
        jPanel1.add(label8);
        label8.setBounds(400, 60, 80, 20);

        label9.setText("stream");
        jPanel1.add(label9);
        label9.setBounds(400, 110, 80, 20);

        label10.setText("tenth");
        jPanel1.add(label10);
        label10.setBounds(400, 160, 80, 20);

        label11.setText("twelve");
        label11.setVisible(false);
        jPanel1.add(label11);
        label11.setBounds(0, 0, 38, 20);

        label12.setText("twelve");
        jPanel1.add(label12);
        label12.setBounds(400, 210, 80, 20);

        label14.setText("technical");
        jPanel1.add(label14);
        label14.setBounds(400, 260, 80, 20);

        label15.setText("photo");
        jPanel1.add(label15);
        label15.setBounds(400, 350, 80, 20);

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2);
        t2.setBounds(220, 110, 80, 20);
        jPanel1.add(t3);
        t3.setBounds(220, 160, 80, 20);
        jPanel1.add(t4);
        t4.setBounds(220, 210, 80, 20);

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t5KeyTyped(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(220, 260, 80, 20);
        jPanel1.add(t6);
        t6.setBounds(220, 310, 80, 20);
        jPanel1.add(t7);
        t7.setBounds(220, 360, 80, 20);
        jPanel1.add(t8);
        t8.setBounds(580, 60, 90, 20);
        jPanel1.add(t12);
        t12.setBounds(580, 110, 90, 20);
        jPanel1.add(t10);
        t10.setBounds(580, 160, 90, 20);
        jPanel1.add(t9);
        t9.setBounds(580, 210, 90, 20);
        jPanel1.add(t11);
        t11.setBounds(580, 260, 90, 20);

        label13.setText("grade");
        jPanel1.add(label13);
        label13.setBounds(400, 390, 80, 20);
        jPanel1.add(t14);
        t14.setBounds(580, 310, 90, 20);

        label16.setText("password");
        jPanel1.add(label16);
        label16.setBounds(400, 310, 80, 20);
        jPanel1.add(t15);
        t15.setBounds(580, 350, 90, 20);
        jPanel1.add(t13);
        t13.setBounds(580, 390, 90, 20);

        button1.setLabel("SUBMIT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(320, 430, 90, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anchit Chawla\\Desktop\\sweet-white-blue-swirl-powerpoint-backgrounds.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try
        {
        myconnection obj=new myconnection();
        String a,b,c,d,e,f,g,h,i,j,k;
        int p,q,r,s,t;
        a=t1.getText();
        b=t2.getText();
        c=t3.getText();
        d=t4.getText();
        p=Integer.parseInt(t5.getText());
        e=t6.getText();
        f=t7.getText();
        g=t8.getText();
        h=t9.getText();
        q=Integer.parseInt(t10.getText());
        r=Integer.parseInt(t11.getText());
        s=Integer.parseInt(t12.getText());  
        i=t13.getText();
        j=t14.getText();
        k=t15.getText();
        String o="insert into tbstudent(RollNo,Fname,Lname,father,age,contact,email,address,stream,tenth,twelve,grade,technical,photo,password)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst=obj.db.prepareStatement(o);
        pst.setString(1,a);
        pst.setString(2,b);
        pst.setString(3,c);
        pst.setString(4,d);
        pst.setInt(5,p);
        pst.setString(6,e);
        pst.setString(7,f);
        pst.setString(8,g);
        pst.setString(9,h);
        pst.setInt(10,q);
        pst.setInt(11,r);
        pst.setInt(12,s);
        pst.setString(13,i);
        pst.setString(14,j);
        pst.setString(15,k);
        pst.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void t5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE)||c==KeyEvent.VK_DELETE)
        {
            evt.consume();
        }
    }//GEN-LAST:event_t5KeyTyped

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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField t1;
    private java.awt.TextField t10;
    private java.awt.TextField t11;
    private java.awt.TextField t12;
    private java.awt.TextField t13;
    private java.awt.TextField t14;
    private java.awt.TextField t15;
    private java.awt.TextField t2;
    private java.awt.TextField t3;
    private java.awt.TextField t4;
    private java.awt.TextField t5;
    private java.awt.TextField t6;
    private java.awt.TextField t7;
    private java.awt.TextField t8;
    private java.awt.TextField t9;
    // End of variables declaration//GEN-END:variables
}