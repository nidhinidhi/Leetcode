import java.util.*;
import java.io.*;
import java.lang.*;

class StringReplace{
    /*public static void main( String[] args){
        String str = "aayycc";
        String res = "";
        for( int i =0; i< str.length() ; i++){
            char ch = str.charAt(i);
            if( ch == 'b'){
                res = res + 'y';
            }
            else{
                res =res + ch;
            }
        }
        System.out.println( res);

    }*/
    public static void main( String[] args){
        String str = "aaabcd";
        String res_str= "";
        char[] a = str.toCharArray();
        boolean flag = false;
        int count =1;
        for( int  i =0; i< a.length ;i++){
            
            if( a[i] == a[i+1]){
                flag = true;
                 count++;
                // System.out.println( count); a = -2-3 
            }
            
            else{
                res_str = res_str + a[i];
                flag =false;

            }
        }
        if( flag == false)
            System.out.println( res_str);
    }
}