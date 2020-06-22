/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromestack;
import java.util.Stack;


public class PalindromeStack {
    
    
    public void isPalin(String s)
    {
        Stack st=new Stack();
        
        for(int i=0;i<s.length();i++)
            st.push(s.charAt(i));
        
        
        String word="";
        while(st.isEmpty()==false)
        {
            word=word+st.pop();
        }
        
        if(word.equals(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    

    public static void main(String[] args) {
        
        PalindromeStack p=new PalindromeStack();
       
        p.isPalin("racecar");
        p.isPalin("abcdef");
        p.isPalin("did,did");
        p.isPalin("don't nod");
        p.isPalin("malayalam");
        p.isPalin("123321");
    }
        
    
    
}
