import java.io.*;
import java.util.*;
import java.lang.*;
class StringDuckNoOrNot{
    //3200  = 04804 =84703 =duck, 033 = not duck no
    public boolean  duckNoOrNot( String str){
        boolean flag = false;
        int i = 0;
        while( str.length()>0){
            if( str.charAt(0) =='0' ){
                i++;
                if( str.charAt(i) == '0')
                    continue;
                else
                    flag = true;
            }
            else
            { 
                i++;
                if( str.charAt(i) == '0')
                    flag = true;
            }
        }
        return flag;
    }
    public static void main( String[] agrs){
        StringDuckNoOrNot obj = new StringDuckNoOrNot();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (obj.duckNoOrNot(str)) 
            System.out.println("true");  
        else
            System.out.println("false");
    }
}