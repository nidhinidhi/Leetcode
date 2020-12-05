import java.util.*;
import java.lang.*;
import java.io.*;
//niDHi == DHnii
/*class StringCapitalSmallPos{
    public static void main(String[] args){
       // String str = "niDhI";
       Scanner sc =new Scanner(System.in);
       String str = sc.nextLine();
        String str1 = "";
        String str2 = "";
        for( int  i =0; i< str.length(); i++){
            char  ch = str.charAt(i);
            if( ch >= 'a' && ch<='z'){
                str1 = str1 + ch;
            }
            else{
                if(ch>'A' && ch<='Z'){
                    str2 = str2 + ch; 
                }
            }
        }
        String res = str2.concat(str1);
        System.out.println(" string is = "+ res); 

    }
}*/
//niDHi = DHnii
class StringCapitalSmallPos{
    public static void main(String[] args){
       // String str = "niDhI";
       Scanner sc =new Scanner(System.in);
       String str=sc.next();
       char[] a = str.toCharArray();
       int n= a.length;
       //int j = n-1;
       int i;
       int k =0;
       for(  i =0 ; i< n; i++){
           //System.out.println( a[i]);
           char ch = a[i];
           if(ch>= 'A' && ch<= 'Z' )
           {
               swap(a[k],a[i]);
               System.out.println(a[i]);

           }
            k++;
        }
        System.out.println(a);

    }
}