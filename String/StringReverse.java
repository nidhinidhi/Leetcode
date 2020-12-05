import java.util.*;
import java.io.*;
import java.lang.*;
//INDIA = AIDNI
//append function is not working
/*class StringReverse{
    public static void main( String[] args){
        ReverseString obj = new ReverseString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        //System.out.println( sb);
        sb.reverse();
        System.out.println( sb);

    }
}*/

/*class StringReverse{
    public static void main( String[] args){
        ReverseString obj = new ReverseString();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int l =0;
        int r = a.length-1;
        for (l = 0; l<r; l++,r--){
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            
        }
        System.out.println( a);
        
    }
}*/
//I Love my India=I evol ym aidnI
/*class StringReverse{
    public static void main( String[] args){
        StringReverse obj = new StringReverse();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        String rev = "";
        for( int i= a.length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println( rev.toString());
    }
}*/
//reverse a string by word
//" hello, world! " = "world! hello,"
/*class StringReverse{
    public static void main( String[] args){
        String str = " I am a good girl ";
        str =str.trim();//trim use for remove space from front and last
        //string split method is always return in string array/char array
        String[] str1 = str.split(" ");
        //define this for loop??
        //String res = "";
        String res = "";
        for (String a : str1) 
            System.out.println(a); 
        /*for (int i = 0; i < str1.length; i++) {
                //str1 = str1.trim(); 
                if (i == str1.length - 1) 
                    res = str1[i] + res; 
                else
                    res = " " + str1[i] + res; 
        } */
        //why we use trim??
        //" i love  India " ="India love i"
        /*for(int i=str1.length-1; i>=0; i--) {
            if(str1[i].trim().length()>0)
                res = res + str1[i].trim()+" ";
        }
        System.out.println(res.toString().trim());
        */
        //return res; 
    }
}*/
//["h","e","l","l","o"]=["o","l","l","e","h"]???
class StringReverse{
    public static void main( String[] args){
        char[] s =new char[] {"h","e","l","l","o"};
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
