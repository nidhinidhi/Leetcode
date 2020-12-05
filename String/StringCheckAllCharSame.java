import java.io.*;
import java.util.*;
import java.lang.*;

class StringCheckAllCharSame{
    //str = qjeu==no
    //str =aaa==yes
    public boolean checkAllCharSame( String str){
        //String res = "";
        //if i = 0,index is out of bound
        for( int  i =1; i<str.length();i++ ){
            if ( str.charAt(i) != str.charAt(i-1))
            {
                return false;
            }
        } 
        return true;
    }
    static public void main (String[] args) {
        StringCheckAllCharSame obj = new StringCheckAllCharSame();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (obj.checkAllCharSame(str)) 
            System.out.println("Yes");  
        else
            System.out.println("No"); 
        
    } 
}