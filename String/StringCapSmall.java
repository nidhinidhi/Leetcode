import java.util.*;
import java.io.*;
import java.lang.*;

class StringCapSmall{
    public static void main( String[] args){
        StringCapSmall obj = new StringCapSmall();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //char[] a = str.toCharArray();
       String s1 = "";
       String s2 = "";
       String res_str = "";
        for( int i =0;i< str.length(); i++){
            char ch = str.charAt(i);
            if( ch >='A' && ch<= 'Z'){
                s1 = s1 + ch;
            }
            else{
                if( ch >='a' && ch<= 'z'){
                    s2 = s2 + ch;
                }
            }
        }
        System.out.println( "s1 = " + s1 + " \n" + "s2 = "+ s2); 
        /*for (int i = 0; i < s1.length() || i < s2.length(); i++) {  
            if (i < s1.length()) 
                res_str = res_str + s1.charAt(i); 
  
            if (i < s2.length()) 
                res_str = res_str + s2.charAt(i); 
        }*/
        int k =0;
        for( int i =0; i< str.length();i++){
            if( i%2 == 0){
                res_str = res_str + s1.charAt(i);
            }
            else
                {
                    res_str = res_str + s2.charAt(k);
                    k++;
                }
        } 
  
        System.out.println(res_str);  
    }
}