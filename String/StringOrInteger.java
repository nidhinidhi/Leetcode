import java.io.*;
import java.util.*;
import java.lang.*;

  
public class StringOrInteger{ 
    static boolean stringOrInteger(String str) 
    { //9875
        //here we not initialy store false in str..??
        //String res = "";
        for (int i = 0; i < str.length(); i++){
                char ch  = str.charAt(i);
            if (ch !=0 && ch!=9) 
                    return false;
             
        }
        return true;
    }  
    static public void main (String[] args) {
        StringOrInteger obj = new StringOrInteger();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (obj.stringOrInteger(str)) 
            System.out.println("Integer");  
        else
            System.out.println("String"); 
          
    } 
} 

//GFG
//str.isDigit(i) is a method which return true or false
/*class StringOrInteger{
    static boolean stringOrInteger(String str) 
    { 
        for (int i = 0; i < str.length(); i++) 
        //how to check ...get each charachter and compare false...??
        if (Character.isDigit(str.charAt(i))  == false) 
            return false; 

        return true; 
    }
    static public void main (String[] args) {
        StringOrInteger obj = new StringOrInteger();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (obj.stringOrInteger(str)) 
            System.out.println("Integer");  
        else
            System.out.println("String"); 
          
    }  

}*/
