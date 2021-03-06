package cardGame24;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
/**
 * Class:       <b>UpdateGUI</b>
 * File:        UpdateGUI.java
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
public class UpdateGUI extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form JoinGUI
     */
    public UpdateGUI() {
        
        initComponents();
        userJTextField.requestFocus();
        conn = javaconnect.ConnecrDb();
        // set default button to verifyJButton
        this.getRootPane().setDefaultButton(loginJButton);
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
        updateJButton = new javax.swing.JButton();
        passJPasswordField = new javax.swing.JPasswordField();
        introJLabel = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        loginJPanel = new javax.swing.JPanel();
        userJLabel = new javax.swing.JLabel();
        userJTextField = new javax.swing.JTextField();
        passJPasswordField1 = new javax.swing.JPasswordField();
        passJLabel = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        instruJLabel = new javax.swing.JLabel();

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

        firstnameJTextField.setEditable(false);
        firstnameJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        firstnameJTextField.setToolTipText("input your first name");

        lastnameJTextField.setEditable(false);
        lastnameJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lastnameJTextField.setToolTipText("input your last name");

        ageJTextField.setEditable(false);
        ageJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ageJTextField.setToolTipText("input your age");

        usernameJTextField.setEditable(false);
        usernameJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        usernameJTextField.setToolTipText("what user name do you want for your account?");

        firstnameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        firstnameJLabel.setText("First Name : ");
        firstnameJLabel.setToolTipText("input first name");

        lastnameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lastnameJLabel.setText("Last Name : ");
        lastnameJLabel.setToolTipText("input last name");

        updateJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        updateJButton.setMnemonic('S');
        updateJButton.setText("Update");
        updateJButton.setToolTipText("Do you agree with making this account?");
        updateJButton.setEnabled(false);
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        passJPasswordField.setEditable(false);
        passJPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passJPasswordField.setToolTipText("what password do you want for your account?");

        introJLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        introJLabel.setForeground(new java.awt.Color(0, 0, 204));
        introJLabel.setText("Update Information");
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

        loginJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 12))); // NOI18N
        loginJPanel.setToolTipText("Login");

        userJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        userJLabel.setText("UserName : ");
        userJLabel.setToolTipText("Input username ");

        userJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        userJTextField.setToolTipText("Input username ");

        passJPasswordField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passJPasswordField1.setToolTipText("Input password");

        passJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passJLabel.setText("Password : ");
        passJLabel.setToolTipText("Input password");

        loginJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        loginJButton.setMnemonic('L');
        loginJButton.setText("Login");
        loginJButton.setToolTipText("login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passJLabel)
                            .addComponent(userJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userJTextField)
                            .addComponent(passJPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginJPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(loginJButton)))
                .addContainerGap())
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userJLabel)
                    .addComponent(userJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passJLabel)
                    .addComponent(passJPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(loginJButton)
                .addContainerGap())
        );

        instruJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        instruJLabel.setText("(please login again to update your information)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(passJPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(introJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(updateJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(instruJLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(introJLabel)
                .addGap(7, 7, 7)
                .addComponent(instruJLabel)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeJButton)
                    .addComponent(updateJButton))
                .addGap(28, 28, 28))
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
    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
         try{
           

            String editFirstname = firstnameJTextField.getText();
            String editLastname = lastnameJTextField.getText();
            String editAge = ageJTextField.getText();
            String editUsername = usernameJTextField.getText();
            String editPassword = passJPasswordField.getText();
            
             String sql="update MembershipInfo set firstname='"+editFirstname+
                       "',lastname "+ "='"+editLastname+"',age ='"+editAge+"',username='"+editUsername+"',password='"+editPassword+
                       "' where firstname='"+editFirstname+"' ";
            
            pst=conn.prepareStatement(sql);
            pst.execute();
            
            this.dispose();
            JOptionPane.showMessageDialog(null, "Updated");
            CardGameGUI lo =new CardGameGUI();
            lo.setVisible(true);
            
            
        }        
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
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
        
        
         
        
        
    }//GEN-LAST:event_updateJButtonActionPerformed
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

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed


        
        String sql = "select * from MembershipInfo where username=? and password=?";
        
        String tmp =userJTextField.getText();
        String sql1="select * from MembershipInfo where username=?";
        
        
        try{

            System.out.println(pst);
            pst=conn.prepareStatement(sql);
            System.out.println(pst);
            pst.setString(1,userJTextField.getText());
            pst.setString(2,passJPasswordField1.getText());
            System.out.println(pst);
            rs=pst.executeQuery();

            if(rs.next())
            {

                JOptionPane optionPane = new JOptionPane("Username and password is correct ", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog(null);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
                rs.close();
                pst.close();
                userJTextField.setEnabled(false);
                passJPasswordField1.setEnabled(false);
                loginJButton.setEnabled(false);
                updateJButton.setEnabled(true);
                firstnameJTextField.setEditable(true);
                lastnameJTextField.setEditable(true);
                ageJTextField.setEditable(true);
                usernameJTextField.setEditable(true);
                passJPasswordField.setEditable(true);
                
                
                pst=conn.prepareStatement(sql1);
                pst.setString(1, tmp);
                rs=pst.executeQuery();
                
                if(rs.next()){
                
                String addFirstname =rs.getString("firstname");
                firstnameJTextField.setText(addFirstname);
                String addLastname =rs.getString("lastname");
                lastnameJTextField.setText(addLastname);
                String addAge =rs.getString("age");
                ageJTextField.setText(addAge);
                String addUsername =rs.getString("username");
                usernameJTextField.setText(addUsername);
                String addPassword =rs.getString("password");
                passJPasswordField.setText(addPassword );
                this.getRootPane().setDefaultButton(updateJButton);
                
                
                }
                
            }
            else{

                JOptionPane optionPane = new JOptionPane("Username and Password is not correct", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog(null);
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);

            }
        }
        catch(Exception e)
        {

            System.out.println(pst);
            JOptionPane.showMessageDialog(null, e);

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
    }//GEN-LAST:event_loginJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel firstnameJLabel;
    private javax.swing.JTextField firstnameJTextField;
    private javax.swing.JLabel instruJLabel;
    private javax.swing.JLabel introJLabel;
    private javax.swing.JLabel lastnameJLabel;
    private javax.swing.JTextField lastnameJTextField;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JLabel passJLabel;
    private javax.swing.JPasswordField passJPasswordField;
    private javax.swing.JPasswordField passJPasswordField1;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JButton updateJButton;
    private javax.swing.JLabel userJLabel;
    private javax.swing.JTextField userJTextField;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
