import java.util.*;
import java.io.*;
import java.lang.*;
//str ="hello world" ans= 5
//
class StringLenLastWord{
      public int stringLenLastWord( String str){
        int count =0;
        //hello world
        //len =10-9-8-7-6-5-4-3-2-1-0
        // string is final so create a copy of that string trim() method is used for 
        //remove space from first and last index of string
        String x = str.trim(); //" hello world "="hello world"
        System.out.println( x);
        if( x.length() == 0)
            return 0;
        for( int i =  x.length()-1; i>=0;i--){
            /*if (Character.isLetter(x.charAt(i))) {  
                count++; 
            }*/
            if (x.charAt(i) != ' '){
                count++;
            } 
            else {
                    return count; 
            } 

        }
        return count;

      }
    public static void main( String[] args){
        StringLenLastWord obj = new StringLenLastWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = obj.stringLenLastWord( str);
        //System.out.println( obj.stringLongestCommonPrefix( str));
            System.out.println( " last word leng = " + ans);
    }
}

