import java.util.*;
import java.io.*;
import java.lang.*;

/*class DefangIPadd{
    public static void main( String[] args){
        //1.1.1 == 1[.]1[.]1[.]

        DefangIPadd obj = new DefangIPadd();
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String res_str = "";
        //String str1 = "";
        for( int i =0; i<str.length() ; i++){
            //char ch = str.charAt(i);
            res_str = str.replaceAll(".","[.]");
        }

        System.out.println( res_str);
    }
}*/
//Defang version of Ip=1.1.1.1 = 1[.]1[.]1[.]1[.]
class StringDefangIPadd{
    public String stringDefangIPadd( String str){
        String res_str = "";
        for( int i =0; i<str.length() ; i++){
           char ch = str.charAt(i);
            if( ch == '.'){
                
                res_str = res_str + "[.]";
            }
            else
                res_str = res_str+ ch;
            //res_str = res_str + str.toString();
        //System.out.println( res_str);
        }
        //System.out.println( res_str);
        return res_str;

    }
    public static void main( String[] args){
        StringDefangIPadd obj = new StringDefangIPadd();
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(obj.stringDefangIPadd( str));

    }
}

