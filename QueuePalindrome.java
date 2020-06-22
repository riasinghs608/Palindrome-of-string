/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queuepalindrome;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {
    
    public void isPalin(String s1)
    {
        Queue q=new LinkedList();
      
        String s2="";
        Stack s=new Stack();
        
        for(int i=s1.length()-1;i>=0;i--)
        {
           s2=s2+s1.charAt(i);
        }
        q.add(s2);
        
        String word="";
        while(q.isEmpty()==false)
        {
            word=word+q.remove();
        }
        System.out.println(word);
        System.out.println(s1);
        
        if(s1.equals(word))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
        q.clear();

            
    }
    
    public void checkPalin(String s)
    {
        Queue<Character>q=new LinkedList<>();
        Stack<Character>s1=new Stack<>();
        
        String s2=s.toLowerCase();
        String str="";
        String str1="";
        for(int i=0;i<s2.length();i++)
        {
               q.add(s2.charAt(i));  
               s1.push(s2.charAt(i));
        }
      
        while(q.isEmpty()==false)
        {
            str=str+q.remove();
        }
        while(s1.isEmpty()==false)
        {
            str1=str1+s1.pop();
        }
        
        if(str.equals(str1))
            System.out.println(s+ " is Palindrome");
        else
            System.out.println(s+ " is not Palindrome");
    }

 
    public static void main(String[] args) {
        
        QueuePalindrome p=new QueuePalindrome();
        //p.isPalin("ria");
        //p.isPalin("racecar");
        
        p.checkPalin("RIA");
        p.checkPalin("racecar");
     
       
    }
    
}
