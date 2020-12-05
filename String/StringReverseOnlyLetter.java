import java.util.*;
import java.io.*;
import java.lang.*;
//"ab-cd" ="cd-ab"
class StringReverseOnlyLetter{
   /* public void stringReverseOnlyLetter(String str){
        String repl = str.replace("-"," ");
        System.out.println( repl);
        //split the string("space") store in string[]newstr array[ab cd]
        //for print each string take for each loop of type String and store string value in s
        String[] newstr = repl.split(" ");
        for( String s : newstr)
            System.out.println( s);//s[0]=ab,s[1]=cd
        for( int  i = newstr.length-1; i>=0; i--){
            //??
        }
    }*/
    //str = [ab-cd] reverse=[cd-ab]
    public boolean isAlphanumeric(String a){
        //String res = "";
        for( int  i =0; i<a.length(); i++){
            char ch = a.charAt(i);
            if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9') ){
                return true;
            }
            return false;
        }
        //str = ab-cd  is convert into res =abcd
        //System.out.println( res);
        //return res;
        return false;
    }
    public void stringReverseOnlyLetter( String str){
        int  l = 0;
        char[] a = str.toCharArray();
        int r = a.length-1;
        if(isAlphanumeric( str)){
            for( l =0; l<r ; l++,r--){
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
            }
            System.out.println(a.toString());
        }
    }

    static public void main (String[] args) {
        StringReverseOnlyLetter obj = new StringReverseOnlyLetter();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println( str);
        obj.stringReverseOnlyLetter( str);
        //System.out.println(obj.stringReverseOnlyLetter( str));
    } 
}