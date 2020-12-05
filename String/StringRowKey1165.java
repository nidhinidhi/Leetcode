import java.util.*;
import java.io.*;
import java.lang.*;
//string key ="pqrstuvwxyzabcdefghijklmno"
//string word = "leetcode"
/*class StringRowKey1165{
    public void stringRowKey1165( String key,String word){
        int[] a = new int[26];
        for( int  i = 0; i< key.length(); i++){
            char ch = key.charAt(i);
                a[ch -'a'] = i;
        }
        int s_pos =0;
        int  t_time =0;
        char[] newword = word.toCharArray();
        for(int  i =0; i< newword.length; i++){
            t_time = t_time + Math.abs( s_pos - a[newword[i]-'a']);
            s_pos = a[newword[i]-'a'];

        }
        System.out.println( "time = " + t_time);

    }
    public static void main( String[] args){
        StringRowKey1165 obj = new StringRowKey1165();
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String key = "abcdefghijklmnopqrstuvwxyz";
        obj.stringRowKey1165( key, word);
    }
}
*/
//using hashmap
class StringRowKey1165{
    public void stringRowKey1165( String key,String word){
        HashSet< Character> set = new HashSet<>();
        

    }
    public static void main( String[] args){
        StringRowKey1165 obj = new StringRowKey1165();
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String key = "abcdefghijklmnopqrstuvwxyz";
        obj.stringRowKey1165( key, word);
    }
}

