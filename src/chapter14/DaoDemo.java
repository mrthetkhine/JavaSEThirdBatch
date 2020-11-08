/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
class Model
{
    
}
class User extends Model
{
    String name; 
    User(String name)
    {
        this.name = name;
    }
}
interface Dao<T extends Model>
{
    void create(T t);
    void update(T t);
}
class UserDao implements Dao<User>
{

    @Override
    public void create(User t) {
        System.out.println("Create user "+t.name);
    }

    @Override
    public void update(User t) {
         System.out.println("Update user "+t.name);
    }
}
public class DaoDemo {
    public static void main(String[] args) {
        
        User u = new User("Tk");
        Dao dao = new UserDao();
        dao.create(u);
        dao.update(u);
    }
}
