/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author thetkhine
 */
public class Search {
    public static void main(String[] args) {
        String str = "java programming language java";
        
        System.out.println("Str.indexOf "+ str.indexOf("java",5));
        System.out.println("Str.indexOf "+ str.indexOf("C#"));
        System.out.println("Str.indexOf "+ str.lastIndexOf("java"));
        
        String subStr =str.substring(5, str.length());
        System.out.println("Sub "+subStr);
        
        
        String replaceStr = str.replace("java", "JavaScript");
        System.out.println("Str "+str);
        System.out.println("ReplaceStr "+replaceStr);
        
        String myStr = "  Hello   ";
        System.out.println("trimmeed "+ myStr.trim());
        
        String dblStr = String.valueOf(0.123f);
        System.out.println(dblStr);
    }
}
