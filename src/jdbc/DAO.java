/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    public Stock saveStock(Stock stock)
    {
        try {
            PreparedStatement st = this.conn.prepareStatement("INSERT INTO stock(name,price,quantity) VALUES(?,?,?);",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1, stock.getName());
            st.setDouble(2, stock.getPrice());
            st.setDouble(3, stock.getQuanity());
            
            st.executeUpdate();
            
            ResultSet rs= st.getGeneratedKeys();
	    if(rs.next()){
                stock.setId(rs.getLong(1));
	    }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return stock;
    }
    public Stock updateStock(Stock stock)
    {
        try {
            PreparedStatement st = this.conn.prepareStatement("UPDATE stock SET name=?, price=?, quantity=? WHERE id=?;");
            st.setString(1, stock.getName());
            st.setDouble(2, stock.getPrice());
            st.setDouble(3, stock.getQuanity());
            st.setLong(4, stock.getId());
            
            st.executeUpdate();
            
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return stock;
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
        Stock stock = new Stock(4L,"My Mango",500.0,200.0);
        
        stock = DAO.getDAO().updateStock(stock);
        System.out.println("Save stock "+stock);
    }
}
