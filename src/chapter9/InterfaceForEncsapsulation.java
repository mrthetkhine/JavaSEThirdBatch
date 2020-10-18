/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author thetkhine
 */
interface Module
{
    void method();
    
}
class ModuleOne implements Module
{

    @Override
    public void method() {
    
        System.out.println("Interface Module Implemented by Module 1");
    }
    
}
class NewModule implements Module
{

    @Override
    public void method() {
    
        System.out.println("Interface Module Implemented by New Module");
    }
    
}
class Service
{
    Module module;
    
    void process()
    {
        this.module.method();
    }
}
public class InterfaceForEncsapsulation {
    public static void main(String[] args) {
        Service service = new Service();
        
        Module m = new ModuleOne();
        service.module = m;
        
        service.process();
        
        service.module = new NewModule();
        service.process();
    }
    
}
