import java.io.*;
import java.util.*;
import java.lang.*;

class StringConvertArray{
    public static void main( String[] args){
        StringConvertArray obj = new StringConvertArray();
        Scanner sc = new Scanner( System.in);
        /*int n = sc.nextInt();//length of array 
        char a[]=new char[n]; 
       
        //take input by the user
        for( int i = 0; i<n; i++){
            //take input as int = sc.nextInt,,take input as char sc.nextChar()??
            a[i] = sc.next().charAt(i);
        }
        for( int i = 0; i<a.length; i++){
            System.out.println( a[i]);
        }
        */

        //char array print only char value
        /*char a[]= new char[]{'c','d','f','g',1,2,3};//o/p=c d f g
        //print the input
        for( int i = 0; i<a.length; i++){
            System.out.println( a[i]);
        }*/

        //input string
        //String is char type means..int,char,symbool..
        //when we convert in  string to array its type is char array 
        //array contain similar data types means contains only one type.char[] arr = {'a','b'}.
        // str=lets start count of 1234
        String s = sc.nextLine();
        //string convert in array
        char[] arr =  s.toCharArray();
        for( int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.print("res string = " + s.toString());

    }
}