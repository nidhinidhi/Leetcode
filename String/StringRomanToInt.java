import java.util.*;
import java.io.*;
import java.lang.*;
class StringRomanToInt{
    //str (roman) ="iv" = a[i]=[i|v]=4
    //MCMCIV = 2004
    public int intValueOfRoman( char a){
        if( a == 'I')
            return 1;
        if( a == 'V')
            return 5;
        if( a == 'X')
            return 10;
        if( a == 'L')
            return 50;
        if( a == 'C')
            return 100;
        if( a == 'D')
            return 500;
        if( a == 'M')
            return 1000;
    return -1;       
    }
    //"IV"=4
    //
    public int stringRomanToInt(String str){
        int total = 0; 
    for (int i=0; i<str.length(); i++) 
    { 
      int s1 = intValueOfRoman(str.charAt(i)); 
      if (i+1 < str.length()) 
      { 
            int s2 = intValueOfRoman(str.charAt(i+1)); 
            if (s1 >= s2) 
                total = total + s1; 
            else
                total = total - s1; 
      } 
      else
       
            total = total + s1;  
    } 
    return total; 
  } 
    
    public static void main( String[] args){
        StringRomanToInt obj = new StringRomanToInt();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = obj.stringRomanToInt( str);
        //System.out.println( obj.stringLongestCommonPrefix( str));
        System.out.println( " Roman to Integer = " + ans);
    }
}