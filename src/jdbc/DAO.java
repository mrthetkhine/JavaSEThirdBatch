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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.model.Stock;

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
    public List<Stock> getStocks()
    {
        List<Stock> stocks = new ArrayList<>();
        try {
            Statement st = this.conn.createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM stock");
            
            while(result.next())
            {
                Long id = result.getLong("Id");
                String name = result.getString("name");
                Double price = result.getDouble("price");
                Double quantity = result.getDouble("quantity");
                
                Stock stock  = new Stock(id, name, price, quantity);
                
                stocks.add(stock);
                
            }
            result.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return stocks;
        
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
        List<Stock> stocks = DAO.getDAO().getStocks();
        
        for(Stock s: stocks)
        {
            System.out.println(s);
        }
    }
}
