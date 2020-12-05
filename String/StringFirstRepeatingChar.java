import java.util.*;
import java.io.*;
import java.lang.*;
// first repeating char from leftside = str = leetcode.laptop
//first repeating char index = e = 1 , p = index = 2
//Basic approach time complexity = 0(n^2)
/*class StringFirstRepeatingChar{
    public int stringFirstRepeatingChar( String str){
        for( int i  =0 ; i< str.length(); i++){
            for( int  j =i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    return i;
            }
        }
        return -1;
    }
    
    public static void main( String[] args){
        StringFirstRepeatingChar obj = new StringFirstRepeatingChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = obj.stringFirstRepeatingChar( str);
        //System.out.println( obj.stringLongestCommonPrefix( str));
            System.out.println( " first reprating char = " + ans);
    }
}*/

//efficient approach=traverse l-r and make boolean visited array to inital store =false,after visited =true
//time comp =0(n) space comp = 0(1)
//character repeated index print either left or right side?????

class StringFirstRepeatingChar{
    //l|e\e|t\c|o|d|e
    public int stringFirstRepeatingChar( String str){
        char[] s = str.toCharArray();//convert string in array
        final int CHARS = 256;//make array of 8bit = 2^8= 0 to 255 char .
        int[] visitarray = new int[CHARS];//visitarray datatype is boolean/int ,intital its =false/0.
        int res = Integer.MAX_VALUE;
        for( int i =0; i< visitarray.length; i++){
            visitarray[i] = -1;
        }
        for( int i  =0 ; i< s.length; i++){
            if(visitarray[s[i]] == -1)
            //l= 0,e =1, e = 2,t=3,c=4,o=5,d=6,e=7
                visitarray[s[i]] = i;//visit first time put that index in place of 0
            
            else
                //min(237819882,2) =(2,7)=2
                res = Math.min(res, visitarray[s[i]]);//second time same char visit(repeat that char)
                //then get the min value of both index=it gives the start index of first repeat char
                
        }
        if( res == 2147483647){
            res = -1;
        }
        return res;
    }
    
    public static void main( String[] args){
        StringFirstRepeatingChar obj = new StringFirstRepeatingChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = obj.stringFirstRepeatingChar( str);
        //System.out.println( obj.stringLongestCommonPrefix( str));
        System.out.println( " first reprating char = " + ans);
    
    }       
}