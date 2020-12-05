import java.util.*;
import java.io.*;
import java.lang.*;

class StringFindPangramLetter{
    public String findPangramLetter( String str){
        //const int MAX_CHAR = 26;
        boolean[] a = new boolean[26];
        int index = 0;
        String res = "";
        for(int i =0; i< str.length(); i++){
            //here we comparing char at ith index of string=asci value of 'A' 
            if( str.charAt(i)>='A' && str.charAt(i)<='Z'){
                index = (str.charAt(i)-'A');//how we get index=char-ascii val
                a[index] = true;
            }
            else if( str.charAt(i)>='a' && str.charAt(i)<='z'){
                index = (str.charAt(i)-'a');
                a[index] = true;
            }
            else
                continue;
        }
        
        for( int i =0; i<26; i++){
            if( a[i] == false)
                res = res + (char)(i+'a');
        //System.out.println( res);
                
        }
        //System.out.println( res);
        return res;
    }
    public static void main( String[] args){
        StringFindPangramLetter obj =new  StringFindPangramLetter();
        String str = "The quick brown fox jumps  over the dog";
        System.out.println(obj.findPangramLetter(str));  
    }

}

   
  
    