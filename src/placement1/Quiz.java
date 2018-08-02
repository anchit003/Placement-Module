/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package placement1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Mridula
 */

  
 
public class Quiz extends javax.swing.JFrame {
    
    int canswer=0,wanswer=0,uanswer=0;
    ArrayList<csQuiz> cArray=new ArrayList<>();
    /**
     * Creates new form Quiz
     */
    String idd;
    public Quiz() {
        initComponents();
    }
     public Quiz(String x) {
        initComponents();
        idd=x;
        display();
    }
    void display()
    {
        try
        {
            String q="select * from tbquestion";
            myconnection obj=new myconnection();
            PreparedStatement pst=obj.db.prepareStatement(q);
            ResultSet rs;
            rs=pst.executeQuery();
            
            JRadioButton op1=null,op2=null,op3=null,op4=null;
            JLabel lop1=null;
            int x=10,y=20,w=400,h=40;
            ButtonGroup b=null;
            while(rs.next())
            {
                b=new ButtonGroup();
                final csQuiz c=new csQuiz();
                c.setId(rs.getInt("id"));
                c.setQname(rs.getString("cname"));
                c.setOption1(rs.getString("op1"));
                c.setOption2(rs.getString("op2"));
                c.setOption3(rs.getString("op3"));
                c.setOption4(rs.getString("op4"));
                c.setComanswer(rs.getInt("cans"));
                c.setAnswer(-1);
                op1=new JRadioButton(c.getOption1());
                op2=new JRadioButton(c.getOption2());
                op3=new JRadioButton(c.getOption3());
                op4=new JRadioButton(c.getOption4());
                lop1=new JLabel();
                lop1.setText(c.getQname());
                lop1.setBounds(x, y, w, h);
                y=y+20;
                op1.setBounds(x, y, w, h);
                y=y+20;
                op2.setBounds(x, y, w, h);
                y=y+20;
                op3.setBounds(x, y, w, h);
                y=y+20;
                op4.setBounds(x, y, w, h);
                y=y+20;
                b.add(op1);
                b.add(op2);
                b.add(op3);
                b.add(op4);
                add(lop1);
                add(op1);
                add(op2);
                add(op3);
                add(op4);
                
                cArray.add(c);
                op1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setAnswer(1);
                    }
                });
                
                op2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setAnswer(2);
                    }
                });
                
                op3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setAnswer(3);
                    }
                });
                
                op4.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        c.setAnswer(4);
                    }
                });
                       
            }
            
            JButton bsubmit=new JButton("Submit");
            bsubmit.setBounds(x, y+40, w, h);
            add(bsubmit);
            bsubmit.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i=0;i<cArray.size();i++) 
                    {
                        csQuiz ca=null;
                        ca=(csQuiz)cArray.get(i);
                        if(ca.getAnswer()==-1)
                        {
                            uanswer++;
                        }
                        else if(ca.getAnswer()==ca.getComanswer())
                        {
                            canswer++;
                        }
                        if(ca.getAnswer()!=ca.getComanswer())
                        {
                            wanswer++;
                        }
                        try
                        {
                            myconnection obj=new myconnection();
                            String q="insert into tbresult(qid,roll,answer,createddate)values(?,?,?,?)";
                            PreparedStatement pst=obj.db.prepareStatement(q);
                            pst.setInt(1, ca.getId());
                            pst.setString(2, idd);
                            pst.setInt(3, ca.getAnswer());
                            Date d=new Date();
                            
                            pst.setString(4, ""+d);
                            pst.executeUpdate();
                        }
                        catch(SQLException e1)
                        {
                            System.out.println(e1.getMessage());
                        }
                        System.out.println("Qname is "+ca.getQname()+" Answer is "+ca.getAnswer());
                    }
                    
                    int totalQ=cArray.size();
                    try
                    {
                        myconnection obj=new myconnection();
                        String k="insert into tbtotresult(roll,canswer,wanswer,uanswer,cusername,cdate,totalq)values(?,?,?,?,?,?,?)";
                        PreparedStatement pst=obj.db.prepareStatement(k);
                        pst.setString(1, idd);
                        pst.setInt(2,canswer);
                        pst.setInt(3,wanswer);
                        pst.setInt(4,uanswer);
                        pst.setString(5,"info15");
                        Date d=new Date();
                            pst.setString(6, ""+d);
                            pst.setInt(7,totalQ);
                            pst.executeUpdate();
                    }
                    catch(Exception r)
                    {
                        System.out.println(r.getMessage());
                    }
                    
                }
            });
        }
        catch(SQLException e)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(693, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
