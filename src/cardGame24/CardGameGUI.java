package cardGame24;
/**
 *Project Name : 24 Point Card Game 
 * Class:       <b>CardGameGUI</b>
 * File:        CardGameGUI.java
 * <pre>
 * Description: This class uses DeckOfCards, GenericStack, and PrintUtilities 
 *               classes to call their methods. DeckOfCards simply creates card
 *               ,put them in ArrayList and randomly generate cards. GenericStack
 *               class is used in evaluateExpression() method and 
 *               ProcessAnOperator() method to push and pop the stack if user 
 *               types the expression in the right order; otherwise it throws
 *               error message. javax.swing.Timer class is used to start the 
 *               timer of 60 seconds, when it reaches 0, it ends the game. This 
 *               class also calls StackException class which inherits 
 *               EmptyStackException class and FullStackException class to read 
 *               user inputs and process it to the Stacks. 
 * Platform:     PC, Windows 7, jdk 1.8.0_25, NetBeans 8.0.2
 * Date:         3/1/2016
 * History Log:  3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
 * @version:    1.6
 * @see:        javax.swing.JFrame
 * @author:     <i>Edgar Hyeongwoo Park</i>
 *Images cited work: logo.jpg(https://dribbble.com/shots/2065011-Board-Game-Logo-Alt)
 *                  (This picture doesn't require copyright to me because I use this picture for education)
 *                   icon.jpg(http://www.iconarchive.com/show/windows-7-icons-by-tonev/windows-7-card-game-icon.html)
 *                  (This picture doesn't require copyright to me because I use this picture for education)
 *                   twentyfour.jpg(https://en.wikipedia.org/wiki/24_(TV_series))
 *                  (This picture doesn't require copyright to me because I use this picture for education)
 * </pre>
 */
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Class: CardGameGUI
* File: CardGameGUI.java
* Description: This is main GUI whicn player can play 24 points card game.
* CardGameGUI uses saved text file to show cards image to play 24 point card game. 
* @author: Edgar Hyeongwoo Park
* Environment: PC, Windows 7, jdk1.8, NetBeans 7.0
* Date: Feb/15/2016
* @version 1.0
* @see javax.swing.JFrame
* History Log:  3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class CardGameGUI extends JFrame 
{
    
    //connection with data base
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    // instance (class level) variables
    private final String FILE_NAME = "src/statistics/Statistics.txt";
    DeckOfCards deck = new DeckOfCards();
    private int numbersSkipped;
    private int gamesPlayed;
    private int correctGuesses;
    private int totalGuesses;    
    private double successRate;
    private int count = 120;

    /**
 * set a date in format of dd MMM, yyyy
 * @return void
 */
public void SetDate()
{
        
        DateFormat dateFormatter = new SimpleDateFormat("dd MMM, yyyy");
                Date today = new Date();
                 this.setTitle("24 Game Card     " + dateFormatter.format(today));             
    
}
    
    /**
     * default constructor
     */
    public CardGameGUI() 
    {
        
        initComponents();
         
        // set default button to verifyJButton
        this.getRootPane().setDefaultButton(enterJButton); 
        expressionJTextField.requestFocus();
        //set title and date 
        SetDate();
        // center the form
        this.setLocationRelativeTo(null); 
        //setIcon();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage
                ("src/resources/icon.jpg"));
        //call database for membership information.
        conn = javaconnect.ConnecrDb();
        //display user information on jTable
        UpdateTable();
        
    }
    /**
     * set the image of the card from the ArrayList using the four randomized
     * number.
     */
    private void setIcon()
    {
        deck.refresh();
        card1JLabel.setIcon(deck.list.get(deck.one));
        card2JLabel.setIcon(deck.list.get(deck.two));
        card3JLabel.setIcon(deck.list.get(deck.three));        
        card4JLabel.setIcon(deck.list.get(deck.four));  
    }
    
    /**
     * renew the jtable to show the newest information
     * whenever user renew the scores
     */
     private void UpdateTable()
    {
        //timer.start();

        try{
        String sql ="SELECT username, playedNumber, successRate FROM MembershipInfo ORDER BY successRate desc LIMIT 3 ";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        infoJTable.setModel(DbUtils.resultSetToTableModel(rs));
        
  
        }
        catch(Exception e){

        JOptionPane.showMessageDialog(null, e);

        }

        
    }
   public void closeCard(){

    WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    } 
     
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayCardJPanel = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        card1JLabel = new javax.swing.JLabel();
        card2JLabel = new javax.swing.JLabel();
        card3JLabel = new javax.swing.JLabel();
        card4JLabel = new javax.swing.JLabel();
        timerJLabel = new javax.swing.JLabel();
        timeJLabel = new javax.swing.JLabel();
        gamesPlayedJLabel = new javax.swing.JLabel();
        gamesPlayedJTextField = new javax.swing.JTextField();
        successJLabel = new javax.swing.JLabel();
        successJTextField = new javax.swing.JTextField();
        perJLabel = new javax.swing.JLabel();
        actionJPanel = new javax.swing.JPanel();
        expressionJLabel = new javax.swing.JLabel();
        expressionJTextField = new javax.swing.JTextField();
        verifyJButton = new javax.swing.JButton();
        startJButton = new javax.swing.JButton();
        titleJPanel = new javax.swing.JPanel();
        titleJLabel = new javax.swing.JLabel();
        iconJLabel = new javax.swing.JLabel();
        iconJLabel1 = new javax.swing.JLabel();
        enterJPanel = new javax.swing.JPanel();
        idJLabel = new javax.swing.JLabel();
        idJTextField = new javax.swing.JTextField();
        passWordJPasswordField = new javax.swing.JPasswordField();
        passWordJLabel = new javax.swing.JLabel();
        enterJButton = new javax.swing.JButton();
        signUpJButton = new javax.swing.JButton();
        updateJButton = new javax.swing.JButton();
        highJLabel = new javax.swing.JLabel();
        infoJScrollPane = new javax.swing.JScrollPane();
        infoJTable = new javax.swing.JTable();
        game24JMenubar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        exitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("24 Card Game");
        setResizable(false);

        refreshJButton.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        refreshJButton.setMnemonic('R');
        refreshJButton.setText("Refresh");
        refreshJButton.setToolTipText("Refresh Deck");
        refreshJButton.setEnabled(false);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        card1JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b1.png"))); // NOI18N

        card2JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b2.png"))); // NOI18N

        card3JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b1.png"))); // NOI18N

        card4JLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b2.png"))); // NOI18N

        timerJLabel.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        timerJLabel.setForeground(new java.awt.Color(255, 0, 0));

        timeJLabel.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        timeJLabel.setText("Time:");

        gamesPlayedJLabel.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        gamesPlayedJLabel.setText("Games Played:");

        gamesPlayedJTextField.setEditable(false);
        gamesPlayedJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        gamesPlayedJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesPlayedJTextFieldActionPerformed(evt);
            }
        });

        successJLabel.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        successJLabel.setText("Success Rate: ");

        successJTextField.setEditable(false);
        successJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        perJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        perJLabel.setText("%");
        perJLabel.setToolTipText("");

        javax.swing.GroupLayout displayCardJPanelLayout = new javax.swing.GroupLayout(displayCardJPanel);
        displayCardJPanel.setLayout(displayCardJPanelLayout);
        displayCardJPanelLayout.setHorizontalGroup(
            displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayCardJPanelLayout.createSequentialGroup()
                .addGroup(displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayCardJPanelLayout.createSequentialGroup()
                        .addComponent(refreshJButton)
                        .addGap(18, 18, 18)
                        .addComponent(timeJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayCardJPanelLayout.createSequentialGroup()
                        .addComponent(card1JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(displayCardJPanelLayout.createSequentialGroup()
                        .addComponent(card2JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(card3JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(card4JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayCardJPanelLayout.createSequentialGroup()
                        .addComponent(timerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gamesPlayedJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gamesPlayedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(successJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(successJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        displayCardJPanelLayout.setVerticalGroup(
            displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayCardJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton)
                    .addComponent(timeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gamesPlayedJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(successJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gamesPlayedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(successJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(perJLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(displayCardJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card2JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        expressionJLabel.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        expressionJLabel.setText("Enter an expression:");

        expressionJTextField.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        expressionJTextField.setToolTipText("Type an Expression");
        expressionJTextField.setEnabled(false);

        verifyJButton.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        verifyJButton.setMnemonic('V');
        verifyJButton.setText("Verify");
        verifyJButton.setToolTipText("Verify Expression");
        verifyJButton.setEnabled(false);
        verifyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyJButtonActionPerformed(evt);
            }
        });

        startJButton.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        startJButton.setMnemonic('S');
        startJButton.setText("Start");
        startJButton.setToolTipText("Start Game");
        startJButton.setEnabled(false);
        startJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionJPanelLayout = new javax.swing.GroupLayout(actionJPanel);
        actionJPanel.setLayout(actionJPanelLayout);
        actionJPanelLayout.setHorizontalGroup(
            actionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionJPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(expressionJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expressionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verifyJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        actionJPanelLayout.setVerticalGroup(
            actionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(actionJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expressionJLabel)
                    .addComponent(expressionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifyJButton)
                    .addComponent(startJButton))
                .addGap(12, 12, 12))
        );

        titleJLabel.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        titleJLabel.setText("24 CARD GAME");

        iconJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.jpg"))); // NOI18N

        iconJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/twentyfour.jpg"))); // NOI18N

        javax.swing.GroupLayout titleJPanelLayout = new javax.swing.GroupLayout(titleJPanel);
        titleJPanel.setLayout(titleJPanelLayout);
        titleJPanelLayout.setHorizontalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleJPanelLayout.createSequentialGroup()
                .addComponent(iconJLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(iconJLabel)
                .addGap(1, 1, 1))
        );
        titleJPanelLayout.setVerticalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleJPanelLayout.createSequentialGroup()
                .addGroup(titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(titleJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        enterJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 12))); // NOI18N
        enterJPanel.setToolTipText("Login");

        idJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        idJLabel.setText("UserName : ");
        idJLabel.setToolTipText("Input username ");

        idJTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        idJTextField.setToolTipText("Input username ");

        passWordJPasswordField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passWordJPasswordField.setToolTipText("Input password");

        passWordJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passWordJLabel.setText("Password : ");
        passWordJLabel.setToolTipText("Input password");

        enterJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        enterJButton.setMnemonic('L');
        enterJButton.setText("Login");
        enterJButton.setToolTipText("login");
        enterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterJButtonActionPerformed(evt);
            }
        });

        signUpJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        signUpJButton.setMnemonic('J');
        signUpJButton.setText("Join");
        signUpJButton.setToolTipText("join with us");
        signUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpJButtonActionPerformed(evt);
            }
        });

        updateJButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        updateJButton.setMnemonic('U');
        updateJButton.setText("Update Information");
        updateJButton.setToolTipText("Update Information");
        updateJButton.setEnabled(false);
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterJPanelLayout = new javax.swing.GroupLayout(enterJPanel);
        enterJPanel.setLayout(enterJPanelLayout);
        enterJPanelLayout.setHorizontalGroup(
            enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterJPanelLayout.createSequentialGroup()
                .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enterJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passWordJLabel)
                            .addComponent(idJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idJTextField)
                            .addComponent(passWordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(enterJPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateJButton)
                            .addGroup(enterJPanelLayout.createSequentialGroup()
                                .addComponent(enterJButton)
                                .addGap(18, 18, 18)
                                .addComponent(signUpJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        enterJPanelLayout.setVerticalGroup(
            enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterJPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idJLabel)
                    .addComponent(idJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passWordJLabel)
                    .addComponent(passWordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(enterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterJButton)
                    .addComponent(signUpJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        highJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        highJLabel.setText("Three Highest players : ");
        highJLabel.setToolTipText("See who is the best on the quiz");

        infoJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        infoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        infoJTable.setToolTipText("Table for displaying score and username ");
        infoJTable.setEnabled(false);
        infoJScrollPane.setViewportView(infoJTable);

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");
        fileJMenu.setToolTipText("");

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clear Fields");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setToolTipText("Print Form");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        exitJMenuItem.setMnemonic('E');
        exitJMenuItem.setText("Exit");
        exitJMenuItem.setToolTipText("Exit Program");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        game24JMenubar.add(fileJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("");

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("Aboout Form");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        game24JMenubar.add(helpJMenu);

        setJMenuBar(game24JMenubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayCardJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(highJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(infoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(highJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(infoJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(enterJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(displayCardJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(actionJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * refresh the cards
     * @param evt action event
     */
    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        setIcon();
        expressionJTextField.setText("");
        expressionJTextField.requestFocus();
        numbersSkipped++;
//        numbersSkippedJLabel.setText("Games Played: " + numbersSkipped);
    }//GEN-LAST:event_refreshJButtonActionPerformed
    /**
     * verify if value of the cards are same as numbers in expression
     * and if expression comes out to be 24. Show message if they are true or
     * false.
     * @param evt action event
     */
    private void verifyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyJButtonActionPerformed
       
        expressionJTextField.requestFocus();
        expressionJTextField.selectAll();
        String expression = expressionJTextField.getText();        
        try 
        {
            totalGuesses++;
            if(checkExpression() == true)
            {                
                if(evaluateExpression(expression) == 24)
                {
                    JOptionPane.showMessageDialog(null, "Great Job! You got 24!",
                            "Correct!", JOptionPane.INFORMATION_MESSAGE);
                    correctGuesses++;  
                    setIcon();
                    expressionJTextField.setText("");                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Try another expression",
                            "Incorrect.", JOptionPane.WARNING_MESSAGE);
                }    
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "The numbers in the expression"
                        + " don't match the numbers in the set",
                        "Message", JOptionPane.WARNING_MESSAGE);
            }
            
            double success = (double) correctGuesses / totalGuesses * 100;
            successRate =  Math.round(success * 100.0) / 100.0;
            successJTextField.setText(Double.toString(successRate));
           
        } 
        catch (FullStackException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        } 
        catch (EmptyStackException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        
        
        
    }//GEN-LAST:event_verifyJButtonActionPerformed
    /**
     * clear all fields, statistics, and set cards to default
     * @param evt action event
     */
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        JOptionPane.showMessageDialog(null, "All fields and text file are cleared",
                            "Cleared!", JOptionPane.INFORMATION_MESSAGE);
        ImageIcon b1 = new ImageIcon("src/resources/b1.png");
        ImageIcon b2 = new ImageIcon("src/resources/b2.png");
        expressionJTextField.setText("");
        gamesPlayedJLabel.setText("Games Played:");
        successJLabel.setText("Success Rate: ");
        timerJLabel.setText("");
        gamesPlayedJTextField.setText("");
        successJTextField.setText("");
        
        count = -1;
        refreshJButton.setEnabled(false);
        verifyJButton.setEnabled(false);
        startJButton.setEnabled(true);
        expressionJTextField.setEnabled(false);
        numbersSkipped = 0;
        gamesPlayed = 0;
        correctGuesses = 0;
        totalGuesses = 0;    
        successRate = 0.0;
        card1JLabel.setIcon(b1);
        card2JLabel.setIcon(b2);
        card3JLabel.setIcon(b1);
        card4JLabel.setIcon(b2);   
        
        this.getRootPane().setDefaultButton(startJButton);
        updateJButton.setEnabled(true);
        
        
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**
     * exit the program
     * @param evt action event
     */
    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitJMenuItemActionPerformed
    /**
     * print the form
     * @param evt action event
     */
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        //using an exisiting helper file from
        //http://www.apl.jhu.edu/~hall/java/Swing-Tutorial/Swing-Tutorial/-Printing.html
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printJMenuItemActionPerformed
    /**
     * start the timer and the game by enabling some buttons
     * @param evt action event
     */   
    private void startJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startJButtonActionPerformed
        count = 120;
        timer.start();        
        setIcon();
        refreshJButton.setEnabled(true);
        verifyJButton.setEnabled(true);        
        expressionJTextField.setEnabled(true);
        expressionJTextField.requestFocus();
        startJButton.setEnabled(false);
        updateJButton.setEnabled(false);
         this.getRootPane().setDefaultButton(verifyJButton); 
        gamesPlayed++;

        gamesPlayedJTextField.setText(Integer.toString(gamesPlayed));
            
         
    }//GEN-LAST:event_startJButtonActionPerformed
    /**
     * brings up the AboutForm JDialog
     * @param evt action event
     */
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        AboutGUI myAbout = new AboutGUI (this, true);
        myAbout.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
   /**
     * login to enter to play the game
     * @param evt action event
     */
    private void enterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterJButtonActionPerformed

        String sql = "select * from MembershipInfo where username=? and password=?";

        try{

            System.out.println(pst);
            pst=conn.prepareStatement(sql);
            System.out.println(pst);
            pst.setString(1,idJTextField.getText());
            pst.setString(2,passWordJPasswordField.getText());
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
                idJTextField.setEnabled(false);
                passWordJPasswordField.setEnabled(false);
                enterJButton.setEnabled(false);
                signUpJButton.setEnabled(false);
                updateJButton.setVisible(true);
                startJButton.setEnabled(true);
                updateJButton.setEnabled(true);
                startJButton.setEnabled(true);
                this.getRootPane().setDefaultButton(startJButton); 
                
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
    }//GEN-LAST:event_enterJButtonActionPerformed
    /**
     * sing up to enter to play the game
     * @param evt action event
     */
    private void signUpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpJButtonActionPerformed

        JoinGUI join =new JoinGUI();
        join.setVisible(true);
        closeCard();
        
    }//GEN-LAST:event_signUpJButtonActionPerformed
/**
     * update user information 
     * @param evt action event
     */
    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed

        
        UpdateGUI join =new UpdateGUI();
        join.setVisible(true);
        count = -1;
        closeCard();
        
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void gamesPlayedJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesPlayedJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gamesPlayedJTextFieldActionPerformed

    /** 
    * Evaluate an expression by taking integers and operators and put them 
    * into 2 different Stack, operandStack and operatorStack.
    * @param expression expression that user types
    * @return result of evaluation
    * @throws Stack.FullStackException
    * @throws Stack.EmptyStackException  
    */
    private int evaluateExpression(String expression) 
            throws FullStackException, EmptyStackException
    {        
        // Create operandStack to store operands
        GenericStack<Integer> operandStack = new GenericStack<>();
        // Create operatorStack to store operators
        GenericStack<Character> operatorStack = new GenericStack<>();
	   
        // Extract operands and operators
        StringTokenizer tokens = new StringTokenizer(expression, " +-/*%()", true);

        // Phase 1: Scan tokens
        while (tokens.hasMoreTokens()) 
        {
            String token = tokens.nextToken().trim(); // Extract a token
            if (token.length() != 0) //Blank space
                if (token.charAt(0) == '+' || token.charAt(0) == '-')
                {
                    //Process all +, -, *, / in the top of the operator stack
                    while (!operatorStack.isEmpty() &&
                            (operatorStack.peek() == '+' ||
                            operatorStack.peek() == '-' ||
                            operatorStack.peek() == '*' ||
                            operatorStack.peek() == '/'))
                    {
                        processAnOperator(operandStack, operatorStack);
                    }
                    
                    // Push the + or - operator into the operator stack
                    operatorStack.push(token.charAt(0));
                }
                
                else if (token.charAt(0) == '*' || token.charAt(0) == '/')
                {
                    // Process all *, / in the top of the operator stack
                    while (!operatorStack.isEmpty() &&
                            (operatorStack.peek().equals('*') ||
                            operatorStack.peek().equals('/')))
                    {
                        processAnOperator(operandStack, operatorStack);
                    }
                    
                    // Push the * or / operator into the operator stack
                    operatorStack.push(token.charAt(0));
                }
                else if (token.trim().charAt(0) == '(')
                {
                    operatorStack.push('('); // Push '(' to stack
                }
                else if (token.trim().charAt(0) == ')')
                {
                    //Process all the operators in the stack until seeing '('
                    while (operatorStack.peek() != '(')
                    {
                        processAnOperator(operandStack, operatorStack);
                    }                    
                    operatorStack.pop(); // Pop the '(' symbol from the stack
                }
                else 
                {   //An operand scanned
                    //Push an operand to the stack
                    operandStack.push(new Integer(token));
                }            //Back to the while loop to extract the next token
        }
	//Phase 2: process all the remaining operators in the stack
        while (!operatorStack.isEmpty()) 
        {
            processAnOperator(operandStack, operatorStack);
        }        
        // Return the result
        return operandStack.pop();
    }    
    /**
     * provide a method for evaluateExpression to process operator
     * @param operandStack operand stacks
     * @param operatorStack operator stacks
     * @throws FullStackException
     * @throws EmptyStackException 
     */
    private void processAnOperator(GenericStack<Integer> operandStack, 
            GenericStack<Character> operatorStack)
            throws FullStackException, EmptyStackException
    {
        char op = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if (op == '+')
            operandStack.push(op2 + op1);
        else if (op == '-')
            operandStack.push(op2 - op1);
        else if (op == '*')
            operandStack.push(op2 * op1);
        else if (op == '/')
            operandStack.push(op2 / op1);    
    }
    /**
     * @return boolean checking if the value of the cards and expression are the 
     *          same, by checking if checkList, grabbed from the expression,
     *          contains all value in the cardList, which is value from card 
     *          displayed.
     * @throws FullStackException
     * @throws EmptyStackException 
     */
    private boolean checkExpression()
            throws FullStackException, EmptyStackException
    {  
        int card1 = deck.one + 1;
        int card2 = deck.two + 1;
        int card3 = deck.three + 1;
        int card4 = deck.four + 1;
        
        int cardVal1 = 0;
        int cardVal2 = 0;
        int cardVal3 = 0;
        int cardVal4 = 0;
        
        // card1
        if((card1 > 0 && card1 <= 13))
        {
            cardVal1 = card1;
        }
        if((card1 > 13 && card1 <= 26))
        {
            cardVal1 = card1 - 13;            
        }
        if((card1 > 26 && card1 <= 39))
        {
            cardVal1 = card1 - 26;
        }
        if((card1 > 39 && card1 <= 52))
        {
            cardVal1 = card1 - 39;            
        }        
        // card2
        if((card2 > 0 && card2 <= 13))
        {
            cardVal2 = card2;
        }
        if((card2 > 13 && card2 <= 26))
        {
            cardVal2 = card2 - 13;
        }
        if((card2 > 26 && card2 <= 39))
        {
            cardVal2 = card2 - 26;
        }
        if((card2 > 39 && card2 <= 52))
        {
            cardVal2 = card2 - 39;                
        }
        // card3
        if((card3 > 0 && card3 <= 13))
        {
            cardVal3 = card3;
        }
        if((card3 > 13 && card3 <= 26))
        {
            cardVal3 = card3 - 13;
        }
        if((card3 > 26 && card3 <= 39))
        {
            cardVal3 = card3 - 26;
        }
        if((card3 > 39 && card3 <= 52))
        {
            cardVal3 = card3 - 39;                
        }
        // card4
        if((card4 > 0 && card4 <= 13))
        {
            cardVal4 = card4;
        }
        if((card4 > 13 && card4 <= 26))
        {
            cardVal4 = card4 - 13;
        }
        if((card4 > 26 && card4 <= 39))
        {
            cardVal4 = card4 - 26;
        }
        if((card4 > 39 && card4 <= 52))
        {
            cardVal4 = card4 - 39;                
        }
        
        String expression = expressionJTextField.getText();
        ArrayList<Integer> checkList = new ArrayList<>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(expression);
        while(m.find())
        {
            checkList.add(Integer.parseInt(m.group()));
        }
        List<Integer> cardList = new ArrayList<>();
        cardList.add(cardVal1);
        cardList.add(cardVal2);
        cardList.add(cardVal3);
        cardList.add(cardVal4);
        
        return checkList.containsAll(cardList);
    }
    
    /**
     * nested inner class--create a 120 seconds timer by creating timer class 
     * and provide methods to enable game. It sets all fields and cards 
     * to default if time runs out.
     */ 
    Timer timer = new Timer(1000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
            
            if (count == 0) {
                timerJLabel.setText(" ");
                expressionJTextField.setEnabled(false);
                refreshJButton.setEnabled(false);
                verifyJButton.setEnabled(false);
                startJButton.setEnabled(true);
                expressionJTextField.setText("");
                ImageIcon b1 = new ImageIcon("src/resources/b1.png");
                ImageIcon b2 = new ImageIcon("src/resources/b2.png");
                expressionJTextField.setText("");                          
                card1JLabel.setIcon(b1);
                card2JLabel.setIcon(b2);
                card3JLabel.setIcon(b1);
                card4JLabel.setIcon(b2);
                JOptionPane.showMessageDialog(null, "Game is Over."
                            + " Press 'Start' to play a new game.",
                            "GAME OVER", JOptionPane.WARNING_MESSAGE);
                ((Timer)e.getSource()).stop();
                count = 120;
                

                   String editUsername = idJTextField.getText();
                   String editPassword = passWordJPasswordField.getText();
                
                String sql="update MembershipInfo set username='"+editUsername+
                       "',password='"+editPassword+"',playedNumber='"+gamesPlayedJTextField.getText()+
                        "',successRate='"+successJTextField.getText()+
                       "' where username='"+editUsername+"' ";
                
                try {
                    pst=conn.prepareStatement(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(CardGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    pst.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(CardGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    UpdateTable();
               
              
                
            } 
            else if(count == -1) 
            {
                timerJLabel.setText(" ");
                expressionJTextField.setEnabled(false);
                refreshJButton.setEnabled(false);
                verifyJButton.setEnabled(false);
                startJButton.setEnabled(true);
                expressionJTextField.setText("");
                ImageIcon b1 = new ImageIcon("src/resources/b1.png");
                ImageIcon b2 = new ImageIcon("src/resources/b2.png");
                expressionJTextField.setText("");                          
                card1JLabel.setIcon(b1);
                card2JLabel.setIcon(b2);
                card3JLabel.setIcon(b1);
                card4JLabel.setIcon(b2);
                ((Timer)e.getSource()).stop();
                count = 120;
            }
            else 
            {
                timerJLabel.setText(Integer.toString(count));
                count--;
   
            }
            
            
        
            
        }
        
    });        
            
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
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CardGameGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JPanel actionJPanel;
    private javax.swing.JLabel card1JLabel;
    private javax.swing.JLabel card2JLabel;
    private javax.swing.JLabel card3JLabel;
    private javax.swing.JLabel card4JLabel;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JPanel displayCardJPanel;
    private javax.swing.JButton enterJButton;
    private javax.swing.JPanel enterJPanel;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JLabel expressionJLabel;
    private javax.swing.JTextField expressionJTextField;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JMenuBar game24JMenubar;
    private javax.swing.JLabel gamesPlayedJLabel;
    private javax.swing.JTextField gamesPlayedJTextField;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel highJLabel;
    private javax.swing.JLabel iconJLabel;
    private javax.swing.JLabel iconJLabel1;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JScrollPane infoJScrollPane;
    private javax.swing.JTable infoJTable;
    private javax.swing.JLabel passWordJLabel;
    private javax.swing.JPasswordField passWordJPasswordField;
    private javax.swing.JLabel perJLabel;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton signUpJButton;
    private javax.swing.JButton startJButton;
    private javax.swing.JLabel successJLabel;
    private javax.swing.JTextField successJTextField;
    private javax.swing.JLabel timeJLabel;
    private javax.swing.JLabel timerJLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JButton updateJButton;
    private javax.swing.JButton verifyJButton;
    // End of variables declaration//GEN-END:variables
}