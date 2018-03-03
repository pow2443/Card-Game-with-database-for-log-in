package cardGame24;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 * Class:       <b>JoinGUI</b>
 * File:        JoinGUI.java
 * <pre>
 * Description: Making Id and password to start taking quiz
 * each information will be saved into database
 * Joining will take information such as name and age and username and password
 * Date:         3/1/2016
 * History Log:  3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
 * @version:    1.6
 * @see:        javax.swing.JFrame
 * @author:     <i>Hyeongwoo Park</i>
 * </pre>
 */
public class JoinGUI extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form JoinGUI
     */
    public JoinGUI() {
        
        initComponents();
        firstnameJTextField.requestFocus();
        conn = javaconnect.ConnecrDb();
         // set default button to verifyJButton
        this.getRootPane().setDefaultButton(singUpJButton);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/resource/park.jpg"));
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        
        
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ageJLabel = new javax.swing.JLabel();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        firstnameJTextField = new javax.swing.JTextField();
        lastnameJTextField = new javax.swing.JTextField();
        ageJTextField = new javax.swing.JTextField();
        usernameJTextField = new javax.swing.JTextField();
        firstnameJLabel = new javax.swing.JLabel();
        lastnameJLabel = new javax.swing.JLabel();
        singUpJButton = new javax.swing.JButton();
        passJPasswordField = new javax.swing.JPasswordField();
        introJLabel = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ageJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ageJLabel.setText("Age : ");
        ageJLabel.setToolTipText("input your age");

        usernameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameJLabel.setText("UserName : ");
        usernameJLabel.setToolTipText("what user name do you want?");

        passwordJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordJLabel.setText("Password : ");
        passwordJLabel.setToolTipText("what password name do you want?");

        firstnameJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        firstnameJTextField.setToolTipText("input your first name");

        lastnameJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lastnameJTextField.setToolTipText("input your last name");

        ageJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ageJTextField.setToolTipText("input your age");

        usernameJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameJTextField.setToolTipText("what user name do you want for your account?");

        firstnameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        firstnameJLabel.setText("First Name : ");
        firstnameJLabel.setToolTipText("input first name");

        lastnameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lastnameJLabel.setText("Last Name : ");
        lastnameJLabel.setToolTipText("input last name");

        singUpJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        singUpJButton.setMnemonic('S');
        singUpJButton.setText("Sing Up");
        singUpJButton.setToolTipText("Do you agree with making this account?");
        singUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUpJButtonActionPerformed(evt);
            }
        });

        passJPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passJPasswordField.setToolTipText("what password do you want for your account?");

        introJLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        introJLabel.setForeground(new java.awt.Color(0, 0, 204));
        introJLabel.setText("Join with us!");
        introJLabel.setToolTipText("Make an account to take the quiz");

        closeJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        closeJButton.setMnemonic('C');
        closeJButton.setText("Close");
        closeJButton.setToolTipText("close");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(singUpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(introJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordJLabel)
                                    .addComponent(usernameJLabel)
                                    .addComponent(ageJLabel)
                                    .addComponent(lastnameJLabel)
                                    .addComponent(firstnameJLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(firstnameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passJPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(introJLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameJLabel)
                    .addComponent(firstnameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameJLabel)
                    .addComponent(lastnameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageJLabel)
                    .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(passJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeJButton)
                    .addComponent(singUpJButton))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Method: singUpJButtonActionPerformed
     * making the account to take quiz 
     * this will take some information to make account 
     * @param evt 
     * @return void
     */
    private void singUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUpJButtonActionPerformed
        // TODO add your handling code here:
         try{
           
          int count = 0;
          //order
          String evd="select * from MembershipInfo";
          int played = 0;
          double num = 0.00;
          pst=conn.prepareStatement(evd);
          rs=pst.executeQuery();

           while(rs.next()){
               
           String memberNum =rs.getString("memberID");
           count = count + 1;
           
           } 
            
           //add new member into database
            String sql ="Insert into MembershipInfo (memberID,firstname,lastname,age,username,password,playedNumber,successRate) "
                    + "values (?,?,?,?,?,?,?,?)";

            pst=conn.prepareStatement(sql);
            pst.setString(1, Integer.toString(count + 1));
            pst.setString(2, firstnameJTextField.getText());
            pst.setString(3, lastnameJTextField.getText());
            pst.setString(4, ageJTextField.getText());
            pst.setString(5, usernameJTextField.getText());
            pst.setString(6, passJPasswordField.getText());
            pst.setString(7, Integer.toString(played));
            pst.setString(8, Double.toString(num));
            pst.execute();
            
            this.dispose();
            JOptionPane.showMessageDialog(null, "Congratulation Joining with us!");
            CardGameGUI lo =new CardGameGUI();
            lo.setVisible(true);
        
        }        
        catch(Exception e)      
        {
            
        JOptionPane.showMessageDialog(null, e);
        
        //prevent to block database
        }finally
        {

            try
            {

                rs.close();
                pst.close();

            }
            catch(Exception e){
            }

        }
        
         
        
        
    }//GEN-LAST:event_singUpJButtonActionPerformed
/**
     * Method: closeJButtonActionPerformed
     * closing this program
     * showing quizGUI again  
     * @param evt 
     * @return void
     */
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
  
            this.dispose();
            CardGameGUI lo =new CardGameGUI();
            lo.setVisible(true);
            
        
    }//GEN-LAST:event_closeJButtonActionPerformed

     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method: main()
    * Description: Call the constructor to create the form.
    * @return: void
    * @param: args are the command line strings
    * @author: Edgar Hyeongwoo Park
    * Date: 02/15/2016
    *<pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoinGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel firstnameJLabel;
    private javax.swing.JTextField firstnameJTextField;
    private javax.swing.JLabel introJLabel;
    private javax.swing.JLabel lastnameJLabel;
    private javax.swing.JTextField lastnameJTextField;
    private javax.swing.JPasswordField passJPasswordField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JButton singUpJButton;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
