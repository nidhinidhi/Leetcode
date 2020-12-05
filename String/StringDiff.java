import java.util.*;
import java.lang.*;
import java.io.*;


class StringDiff{
    public int stringDefineDiff( String str){
        int count = 0;
            int count1 = 0;
        for( int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if( ch >= 'a' && ch<= 'z'){
                count++;
            }
            else
                {if( ch>='A' && ch<= 'Z')
                    count1++;
                }
        }
        int x  = Math.abs(count - count1);
        return x ;

    }
    public static void main( String[] args){
        StringDiff obj = new StringDiff();
        String str;
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while( t--> 0){
            str = sc.next();
            System.out.println(obj.stringDefineDiff(str));
            
        }

    }
}

