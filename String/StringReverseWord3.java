import java.util.*;
import java.io.*;
import java.lang.*;

//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
class StringReverseWord3{
    public String stringReverseWord3( String str){
    char[] s1 = str.toCharArray();
    int i = 0;
    for(int j = 0; j < s1.length; j++)
    {
        if(s1[j] == ' ')
        {
            reverse(s1, i, j - 1);
            i = j + 1;
        }
    }
    public void reverse(char[] s, int l, int r)
    {   String rev = "";
        for( int i= s.length-1;i>=0;i--){ 
            rev = rev + s[i];
        }
        System.out.println( rev.toString());
    }

    static public void main (String[] args) {
        StringReverseWord3 obj = new StringReverseWord3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println( str);
        System.out.println(obj.stringReverseWord3( str));
    } 
}