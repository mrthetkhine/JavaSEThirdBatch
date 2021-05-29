/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc.model.User;

/**
 *
 * @author thetkhine
 */
public class UserDAOImpl implements UserDAO{

    static final String SALT = "@#1";
    
    @Override
    public User saveUser(User user) {
        try {
            PreparedStatement st = DAO.getDAO().getConnection().prepareStatement("INSERT INTO user(username,password) VALUES(?,md5(?));",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1, user.getUserName());
            st.setString(2, SALT+user.getPassword());
            st.executeUpdate();
            
            ResultSet rs= st.getGeneratedKeys();
	    if(rs.next()){
                user.setId(rs.getLong(1));
	    }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }
    
   

    @Override
    public User login(User user) {
        try {
            PreparedStatement st = DAO.getDAO().getConnection().prepareStatement("SELECT * FROM user where username=? AND password=md5(?)",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1, user.getUserName());
            st.setString(2, SALT+user.getPassword());
            
            
            ResultSet rs= st.executeQuery();
	    if(rs.next()){
                user.setId(rs.getLong(1));
	    }
            else
            {
                user = null;
            }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return user;
    }
    
     

    @Override
    public boolean isUserExistWithUserName(String userName) {
        boolean exist = false;
        try {
            PreparedStatement st = DAO.getDAO().getConnection().prepareStatement("SELECT * FROM user where username=?;",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1, userName);
           
            ResultSet rs= st.executeQuery();
	    if(rs.next()){
                exist= true;
	    }
            else
            {
                exist = false;
            }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return exist;
    }
    public static void main(String[] args) {
        UserDAO dao = new UserDAOImpl();
        User user = new User("user","user1");
        
        user = dao.login(user);
        System.out.println("User "+user);
        
        System.out.println("is Admin user already existed "+dao.isUserExistWithUserName("admin1"));
    }
}
