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
public class company extends javax.swing.JFrame {

    /**
     * Creates new form company
     */
    public company() {
        initComponents();
        Display();
    }
    String  roll;
     public company(String r) {
        initComponents();
        roll =r;
        Display();
    }
    void Display()
    {
        try
        {
        myconnection obj=new myconnection();
        String q="select c.cname from tbcompany c ,tbstudent s,tbrequirements r where c.cusername=r.cusername and s.RollNo=? and s.tenth>=r.Xth and s.twelve>=r.XIIth and s.grade>=r.grade ";
        PreparedStatement pst=obj.db.prepareStatement(q);
        pst.setString(1,roll);
        
         ResultSet rs;
        rs=pst.executeQuery();
        c1.removeAll();
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
        c1 = new java.awt.Choice();
        l1 = new java.awt.Label();
        l2 = new java.awt.Label();
        l3 = new java.awt.Label();
        l4 = new java.awt.Label();
        l5 = new java.awt.Label();
        l6 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(340, 60, 110, 20);
        jPanel1.add(l1);
        l1.setBounds(340, 120, 110, 20);
        jPanel1.add(l2);
        l2.setBounds(340, 170, 110, 20);
        jPanel1.add(l3);
        l3.setBounds(340, 220, 110, 20);
        jPanel1.add(l4);
        l4.setBounds(340, 270, 110, 20);
        jPanel1.add(l5);
        l5.setBounds(340, 320, 110, 20);
        jPanel1.add(l6);
        l6.setBounds(340, 370, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email Id");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 370, 90, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Conatct No.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 320, 90, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Profile");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 270, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Location");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 220, 60, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Director");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(140, 170, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Company Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 120, 110, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("companies");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 60, 80, 17);

        jLabel9.setFont(new java.awt.Font("AR BLANCA", 3, 36)); // NOI18N
        jLabel9.setText("ELIGIBLE COMPANIES");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 0, 410, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anchit Chawla\\Desktop\\Best-Website-Background-Images28.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        // TODO add your handling code here:
        try
        {
            myconnection obj=new myconnection();
            String j="select * from tbcompany where cname =? ";
            PreparedStatement pst=obj.db.prepareStatement(j);
            pst.setString(1,c1.getSelectedItem());
            ResultSet rs;
            rs=pst.executeQuery();
            while(rs.next())
            {
                l1.setText(rs.getString("cname"));
                l2.setText(rs.getString("director"));
                l3.setText(rs.getString("location"));
                l4.setText(rs.getString("profile"));
                l5.setText(rs.getString("contact"));
                l6.setText(rs.getString("email"));
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_c1ItemStateChanged

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
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label l1;
    private java.awt.Label l2;
    private java.awt.Label l3;
    private java.awt.Label l4;
    private java.awt.Label l5;
    private java.awt.Label l6;
    // End of variables declaration//GEN-END:variables
}
