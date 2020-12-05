import java.util.*;
import java.io.*;
import java.lang.*;

class StringBuilder{
    public static void main( String[] args){
        /*StringBuilder str = new StringBuilder("Nidhi kumari");
        System.out.println( str);
         //str.append( " India");
         //System.out.println( "afetr append :" str);*/
         StringBuilder str = new StringBuilder();
         //append function is use for adding the char, int, str,..
         str.append("good");
         System.out.println( str);
         char[] ch = new char[]{ 'I','N','D','I','A'};
         str.append( ch);
         System.out.println( str);
         //o/p= goodINDIA
        
    }
}