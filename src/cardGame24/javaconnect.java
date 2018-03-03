package cardGame24;

import java.sql.*;
import javax.swing.*;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Class: javaconnection
* File:  javaconnection.java
* Description: trting to connect between class and database 
* for management of memberships
* this class is a big key to login 
* @author: Edgar Hyeongwoo Park
* Environment: PC, Windows 7, jdk1.8, NetBeans 7.0
* @version 1.6
* @see javax.swing.JFrame
* Date:         3/1/2016
 * History Log:  3/1/2016, 3/2/2016, 3/3/2016, 3/4/2016, 3/5/2016, 3/6/2016
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class javaconnect {
    
    Connection conn= null;
    
    //connection between database and program for manage membership
    public static Connection ConnecrDb(){
 
        try
        {

        //Input file form 
        Class.forName("org.sqlite.JDBC");
        //Finding database by the address 
        Connection conn =DriverManager.getConnection("jdbc:sqlite:MembershipInfo.sqlite");
        
        //retune database 
        return conn;

        }
        catch (Exception e)
        {

               JOptionPane.showMessageDialog(null, e);

           return null;

        }
 
    }
    
   
}
