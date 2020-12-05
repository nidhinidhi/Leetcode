import java.util.*;
import java.io.*;
import java.lang.*;
// str = " A, man,a plan,a canal: Panama"= true
/*class StringPalindrome{
    public boolean stringPalindrome( String str){
        boolean flag = false;
        str = str.toLowerCase();
       // System.out.println("afetr lowercase =" + str);//"a, man,a plan,a canal: panama"
        //str = str.replaceAll( "^[a-z" ,"");
        str = str.replaceAll("[^a-z-0-9]", " "); //^a-z means replace all special char in "space". 
        //System.out.println(  " after replace =" + str);
        //"a man a plan a canal panama"
        str = str.replaceAll("\\s+", "");
        //System.out.println(  " after replace =" + str);
        String res_str1 = "";
        String res_str2 = "";
        //we want store  char  of string one by one  in res array.??
        //char a[] = new char[str.length()];
        for( int  i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if( (ch >= 'a' && ch<='z') || (ch<='A' && ch<='Z')){
                 //a[i] = ch;
                 res_str1 = res_str1 + ch;
            }
            //System.out.print( a[i]);
        }
        //System.out.println( "str1 = " + res_str1);
        for( int i= str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if( (ch >= 'a' && ch<='z') || (ch<='A' && ch<='Z')){
                 //a[i] = ch;
                 res_str2 = res_str2 + ch;
            }
            //System.out.print( a[i]);
        }
        //System.out.println( "str2 = " + res_str2);
        if( res_str1.equals(res_str2)){
            //System.out.println(" chhavi "+ flag);
            flag = true;
        }
        else
             return flag;

    return flag;
    }
    public static void main(String[] args){
        StringPalindrome obj = new StringPalindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println( str);
        //System.out.println( str);
        //obj.stringPalindrome( str);
        System.out.println(obj.stringPalindrome( str));

    }
}
*/
//other method
class StringPalindrome{
    public boolean stringPalindrome( String str){
        str = str.toLowerCase();
        int i = 0;
        int j = str.length()-1;
        while (i<=j){
            //leave the special character
            if (!Character.isLetterOrDigit(str.charAt(i))){
            //if( (str.charAt(i)< 48||str.charAt(i)> 57) &&(str.charAt(i)<97||str.charAt(i)>122))              {
                i++;
                continue;
            }
            else if(!Character.isLetterOrDigit(str.charAt(j))){
            //else if( (str.charAt(j)< 48||str.charAt(j)> 57) &&(str.charAt(j)< 97 ||                                str.charAt(j)>122)){
                j--;
                continue;
            } 
            else if(str.charAt(i) != str.charAt(j)){
                    return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        StringPalindrome obj = new StringPalindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println( str);
        //obj.stringPalindrome( str);
        System.out.println(obj.stringPalindrome( str));

    }
}