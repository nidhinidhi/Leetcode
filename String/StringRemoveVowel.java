import java.util.*;
import java.io.*;
import java.lang.*;

/*class StringRemoveVowel{
    public static void main( String[] args){
        //MOni ==Mn
        RemoveVowelString obj = new RemoveVowelString();
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String res_str = "";
        for( int i =0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if( ch == 'a'|| ch=='e' || ch=='i'|| ch=='o'||ch=='u'|| ch == 'A'|| ch=='E' || ch=='I'|| ch=='O'||ch=='U' )
                continue;
            else
                res_str = res_str + ch;
        }
        System.out.println( res_str);
    }
}*/
class StringRemoveVowel{
    public static void main( String[] args){
        //MOni
        StringRemoveVowel obj = new StringRemoveVowel();
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String res_str = "";
        for( int i =0; i<str.length() ; i++){
            char ch = str.charAt(i);
            res_str = str.replaceAll("aeiouAEIOU");
        }
        System.out.println( res_str);
    }
}