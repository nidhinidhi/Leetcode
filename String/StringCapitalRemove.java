import java.util.*;
import java.lang.*;
import java.io.*;

/*class StringCapitalRemove{
    public static void main (String[] args){
        String str = "niDHI";
        String resstr = " ";
        for( int i =0; i< str.length(); i++){
            //String resstr;
            char ch = str.charAt(i);
            if( ch >= 'a' && ch<= 'z'){
                resstr = resstr + ch;
                
            }
            else
                break;
        }
        System.out.println( resstr);
    }
    
}*/
//defferent
class StringCapitalRemove{
    public String stringCapitalRemove( String str){
        String resstr = "";
        for( int i =0; i< str.length(); i++){
            //String resstr;
            char ch = str.charAt(i);
            if( ch >= 'a' && ch<= 'z'){
                resstr = resstr + ch;
                
            }
        }
       // System.out.println( resstr);
        return resstr;
    }

    public static void main( String[] args){
        StringCapitalRemove obj = new StringCapitalRemove();
        Scanner sc = new Scanner(System.in);
        int n = 4;//take input as 4 string
        while(n--> 0){ 
            String str = sc.nextLine();//use mulltiple string in one line nidhi,NIDHI,niDHI,
            System.out.println(obj.stringCapitalRemove(str));
        }
        
        
    }
}