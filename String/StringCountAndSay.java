import java.util.*;
import java.io.*;
import java.lang.*;

class StringCountAndSay{
    /*public String stringCountAndSay( int n){
        if ( n <= 0)
          return "";
        String res = "1";
        for( int  i = 1; i < n ; i++){
            String newstr = res;
            //System.out.println(" str ;; " + newstr);
            res = "";
            int count = 1;
            char temp = newstr.charAt(0);
            //here n =2 and newstr ="11"
            //j loop is consider if char of string is >0
            //str=1211 /j=1->2/j=2->1/j=3->1/ j=4 X
            for( int j  = 1; j< newstr.length(); i++ ){

                    if(newstr.charAt(j) == newstr.charAt( j-1)){
                    //newstr = "11" = both char is same'''
                        count++;//2---/"1211"--2
                    }
                    //if char is not same  str = "21"---str = "1211"
                    else{
                    
                        res = res + count + temp ;//"21" 12--/"1211" 11--/12
                        temp = newstr.charAt(j-1);//"21" 2--/"1211" 1--/2
                        count  = 1;
                    }
            }
            //System.out.println(" count ;; " + count);
            //for str ="1"
            //then char of the string is  0 ,and it is not enter in j loop.
            //direct add in res = count + temp==str2 = "11";
            res = res +count + temp;//12 + 1 + 1---/"1211"....??
            //System.out.println("res::" + res);
        }
        System.out.println("res::" + res);
        return res;
    }*/
    public String stringCountAndSay(int n) {
        if (n <= 0) 
        {
            return "";
        }
        String res = "1";
        for (int i = 1; i < n; i++) {
            String oldstr = res;
            res = "";
            char temp = oldstr.charAt(0);
            int count = 1;
            for (int j = 1; j < oldstr.length(); j++) {
                if (oldstr.charAt(j) == temp) {
                    count++;
                    
                }else {
                    res = res + count + temp;
                    temp = oldstr.charAt(j);
                    count = 1;
                }
            }
            res = res + count + temp;
        }
        return res;
        }

    
    public static void main( String[] args){
        StringCountAndSay obj = new StringCountAndSay();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //obj.stringCountAndSay( n);
        System.out.println( obj.stringCountAndSay( n));
    }
}