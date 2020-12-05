import java.util.*;
import java.io.*;


class StringUppertoLower{
    public static void main( String[] args){
    //Moni = moni
        StringUppertoLower obj = new StringUppertoLower();
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String res_str = "";
        int temp = 0;
        for( int i =0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if( ch >='A' && ch<= 'Z'){
               //int num = Integer.parseInt(Str.valueOf(ch));
                temp = (int)(ch);
                temp = temp +32;
                ch = (char)(temp);
            }
            res_str = res_str +ch;//str is string but ch is character
        }
        System.out.println( res_str);
    }
}
/*class StringUppertoLower{
    public static void main( String[] args){
        //Moni = moni
            StringUppertoLower obj = new StringUppertoLower();
            Scanner sc =new Scanner(System.in);
            String str=sc.nextLine();
            String s="";
            for(int i=0;i<str.length();i++)
            {
                char c = str.charAt(i);
                if(c>='A' && c<='Z'){
                    //c=(char)((c-'A')+'a');
                    c = (char)(c + 32);
                }
                s += c;
            }
            System.out.println( s);
    }
}*/
