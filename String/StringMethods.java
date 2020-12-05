import java.util.*;
import java.lang.*;
import java.io.*;
 
class StringMethods{
    public static void main( String[] args){
        String str = "I am a good girl.;";
        String str2 = "hello world";
        //int length()- return length of the string
        System.out.println( "str.length()-" + str.length());//18
        //Char charAt(i)-- return char at ith index???
        //how we compare ascii value  to char???
        /*for( int  i = 0; i< str.length; i++){
            if ( str.charAt(i)>='a' && str.charAt(i)<= 'z')
        }*/
        System.out.println("str.charAt(i)-"  + str.charAt(5));//a
        //tring substring(ith index)- return substring from ith index to end 
        System.out.println("str.substring(i)-"  + str.substring(5));//a good...
        System.out.println("str.substring(i,j)-"  + str.substring(5,10));//return substring from i to j
        //String s1.concat(s2)- return the String s1 is end with s2
        System.out.println("str.concat(s2)"  + str.concat(str2));//I am ...hello
        //int indexOf( "give string")-return the  staring of index of given string
        System.out.println("int str.indexOf()--"  + str.indexOf("good"));//7
        //int lastIndexOf( "give string")-return the  last of index of given string
        System.out.println("int str.lastIndexOf()--"  + str.lastIndexOf("i"));//13
        //String.split(" regex" , limit); means breaks a string in small string which was contains in array string
        String str3  = " I am a good girl";
        String[] strsplit= str3.split(" ",4);
        for (String a : strsplit){//how it is different from normal forloop
            System.out.println(" split method : " + a);//I /am/a/good.girl
        }
        String str4 = new String("nidhi");
        String str5 = new String("nidhi");
        //equals is method which equal the value(content ) of a string,if it is equal return true
        //== is operator which point the different same obj
        System.out.println( str4.equals(str5));
        System.out.println( str4 == str5);

        

    }
}