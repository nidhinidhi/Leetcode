import java.util.*;
import java.io.*;
import java.lang.*;

//Character ch = new character('a');
//here Character is object and a is its char type
class StringCharacterClass{
    public void stringCharacterClass( String str){
        for( int  i =0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(Character.isLetter(ch)){
                System.out.print("letter:" + ch);
            }
            System.out.print("\n");
            if(Character.isDigit(ch)){
                System.out.print("digit "+ ch);
            }
            if(Character.isWhitespace(ch)){
                System.out.print(" whitespace "+ ch);
            }
            if(Character.isLowerCase(ch)){
                System.out.print(" lowercase " +ch);
            }
            if(Character.isUpperCase(ch)){
                System.out.print("uppercase "+ ch);
            }
            if(Character.isAlphaNumeric(ch)){
                System.out.print("uppercase "+ ch);
            }
            
           
           
        }
            
           
           
        }
        String res = str.toUpperCase();
        System.out.println( res);
        //here str.tolowercase return ascii vlaue of that char
        System.out.println(Character.toLowerCase( 'A'));
        System.out.println(Character.toUpperCase( 97));
        System.out.println(Character.toString( 'x'));
        System.out.println(Character.isLetterOrDigit('m'));
        System.out.println(Character.isLetterOrDigit(9));
        //alphanumeric is alphabet ,symbool nd some special char

        /*String s = "abgc ()978";
        String a  = StringUtils.isAlphanumeric(s);
        System.out.println( s);
        */
    }
    public static void main( String[] args){
        StringCharacterClass obj = new StringCharacterClass();
        String str ="Nidhi 18cs30i79";
        obj.stringCharacterClass(str);
    }
}