/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author thetkhine
 */
public class QueueDemo {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<String>();
        
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.add("Fuour");
        
        System.out.println("Peek "+ queue.peek());
        System.out.println("Size "+queue.size());
        System.out.println("Queue pop "+queue.poll());
        System.out.println("Size "+queue.size());
        
        queue.remove();
        queue.addFirst("First");
        queue.addLast("Five");
        for(String s : queue)
        {
            System.out.println(s);
        }
        
        System.out.println("Pop "+queue.pop());
        queue.push("First element");
        
        for(String s : queue)
        {
            System.out.println(s);
        }
        Iterator iterator = queue.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+ iterator.next());
        }
    }
}
