/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import jdbc.model.User;

/**
 *
 * @author thetkhine
 */
public interface UserDAO {
    
    User saveUser(User user);
    boolean isUserExistWithUserName(String userName);
    User login(User user);
    
}
