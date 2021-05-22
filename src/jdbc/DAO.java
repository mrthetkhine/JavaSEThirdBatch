/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class DAO {
    
    
    private static DAO singleton;
    
    private Connection conn = null;
    
    private DAO()
    {
        try
        {
            //Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/pos","root","root123!@#");                         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void getStocks()
    {
        try {
            Statement st = this.conn.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM stock");
            
            while(result.next())
            {
                System.out.println("Name "+result.getString(2));
                System.out.println("Price "+result.getDouble(3));
                System.out.println("Quanity "+result.getDouble(4));
                
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    public static DAO getDAO()
    {
        if(singleton == null)
        {
            singleton = new DAO();
        }
        return singleton;
    }
    
    public static void main(String[] args) {
        DAO.getDAO().getStocks();
    }
}
