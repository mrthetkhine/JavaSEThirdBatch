/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter21;

import java.io.CharArrayReader;
import java.io.PushbackReader;

/**
 *
 * @author thetkhine
 */
public class PushBackReaderDemo {
    public static void main(String[] args) {
        String s = "if (a==4) a=0;\n";
        char buf[] = new char[s.length()];
        
        s.getChars(0, s.length(), buf, 0);
        CharArrayReader in = new CharArrayReader(buf);
        
        int c;
        try(PushbackReader f=new PushbackReader(in))
        {
            while( (c= f.read())!=-1)
            {
                switch(c)
                {
                    case '=':
                        if( (c=f.read()) =='=')
                        {
                            System.out.println("eq");
                        }
                        else
                        {
                            System.out.println("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char)c);
                        break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
