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
public class seeinfo extends javax.swing.JFrame {

    /**
     * Creates new form seeinfo
     */
    public seeinfo() {
        initComponents();
    }
        String j;
        public seeinfo(String q) {
        initComponents();
        j=q;
        try{
        myconnection obj=new myconnection();
        String k="select * from tbstudent where RollNo=?";
        PreparedStatement pst=obj.db.prepareStatement(k);
        pst.setString(1,j);
        ResultSet rs;
        rs=pst.executeQuery();
        if(rs.next())
        {
            l1.setText(rs.getString("Fname"));
            l2.setText(rs.getString("Lname"));
            l3.setText(rs.getString("father"));
            l4.setText(""+rs.getString("age"));
            l5.setText(rs.getString("contact"));
            l6.setText(rs.getString("email"));
            l7.setText(rs.getString("address"));
            l8.setText(""+rs.getString("stream"));
            l9.setText(""+rs.getString("tenth"));
            l10.setText(""+rs.getString("twelve"));
            l11.setText(""+rs.getString("grade"));
            l12.setText(rs.getString("technical"));
            l13.setText(rs.getString("photo"));
            l14.setText(rs.getString("password"));
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
        l1 = new java.awt.Label();
        l2 = new java.awt.Label();
        l3 = new java.awt.Label();
        l4 = new java.awt.Label();
        l5 = new java.awt.Label();
        l6 = new java.awt.Label();
        l7 = new java.awt.Label();
        l8 = new java.awt.Label();
        l9 = new java.awt.Label();
        l10 = new java.awt.Label();
        l11 = new java.awt.Label();
        l12 = new java.awt.Label();
        l13 = new java.awt.Label();
        l14 = new java.awt.Label();
        label3 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        label1 = new java.awt.Label();
        label7 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(l1);
        l1.setBounds(260, 50, 80, 20);
        jPanel1.add(l2);
        l2.setBounds(260, 90, 80, 20);
        jPanel1.add(l3);
        l3.setBounds(260, 170, 80, 20);
        jPanel1.add(l4);
        l4.setBounds(260, 130, 80, 20);
        jPanel1.add(l5);
        l5.setBounds(260, 210, 80, 20);
        jPanel1.add(l6);
        l6.setBounds(260, 250, 80, 20);
        jPanel1.add(l7);
        l7.setBounds(260, 290, 80, 20);
        jPanel1.add(l8);
        l8.setBounds(630, 50, 80, 20);
        jPanel1.add(l9);
        l9.setBounds(630, 90, 80, 20);
        jPanel1.add(l10);
        l10.setBounds(630, 130, 80, 20);
        jPanel1.add(l11);
        l11.setBounds(630, 170, 80, 20);
        jPanel1.add(l12);
        l12.setBounds(630, 210, 80, 20);
        jPanel1.add(l13);
        l13.setBounds(630, 250, 80, 20);
        jPanel1.add(l14);
        l14.setBounds(630, 290, 80, 20);

        label3.setName(""); // NOI18N
        label3.setText("Father's Name");
        jPanel1.add(label3);
        label3.setBounds(90, 130, 90, 20);

        label8.setText("Contact");
        jPanel1.add(label8);
        label8.setBounds(90, 210, 90, 20);

        label9.setText("Email");
        jPanel1.add(label9);
        label9.setBounds(90, 250, 90, 20);

        label10.setText("Address");
        jPanel1.add(label10);
        label10.setBounds(90, 290, 90, 20);

        label11.setText("Stream");
        jPanel1.add(label11);
        label11.setBounds(470, 50, 90, 20);

        label12.setText("Xth");
        jPanel1.add(label12);
        label12.setBounds(470, 90, 90, 20);

        label13.setText("XIIth");
        jPanel1.add(label13);
        label13.setBounds(470, 130, 90, 20);

        label14.setText("Grade");
        jPanel1.add(label14);
        label14.setBounds(470, 170, 90, 20);

        label15.setText("Technical");
        jPanel1.add(label15);
        label15.setBounds(470, 210, 90, 20);

        label16.setText("Photo");
        jPanel1.add(label16);
        label16.setBounds(470, 250, 90, 20);

        label17.setText("Password");
        jPanel1.add(label17);
        label17.setBounds(470, 290, 90, 20);

        label1.setText("Fname");
        jPanel1.add(label1);
        label1.setBounds(90, 50, 90, 20);

        label7.setName(""); // NOI18N
        label7.setText("Age");
        jPanel1.add(label7);
        label7.setBounds(90, 170, 90, 20);

        label2.setText("Lname");
        jPanel1.add(label2);
        label2.setBounds(90, 90, 90, 20);

        jLabel2.setFont(new java.awt.Font("AR BLANCA", 3, 36)); // NOI18N
        jLabel2.setText("DETAILS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 10, 170, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anchit Chawla\\Desktop\\sweet-white-blue-swirl-powerpoint-backgrounds.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(seeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seeinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label l1;
    private java.awt.Label l10;
    private java.awt.Label l11;
    private java.awt.Label l12;
    private java.awt.Label l13;
    private java.awt.Label l14;
    private java.awt.Label l2;
    private java.awt.Label l3;
    private java.awt.Label l4;
    private java.awt.Label l5;
    private java.awt.Label l6;
    private java.awt.Label l7;
    private java.awt.Label l8;
    private java.awt.Label l9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}