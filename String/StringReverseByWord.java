import java.util.*;
import java.io.*;
import java.lang.*;
//"I am a good girl" = "girl good a am I"
/*class StringReverseByWord {
    public String stringReverseByWords(String word) {
        //String[] word = str.split("");
       // Pattern pattern = Pattern.compile("\\s");
        //String[] word = pattern.split(str);
        //word = word.replace(","," ");
        String[] newstr = word.split(" "); 
        /*for(String w:newstr){  
            System.out.print( "[" + w + "]");
           // System.out.println( " \n");  
        }*/  
        //String result = "";
        /*for(int i = 0; i<word.length; i++){
            System.out.println( " string " + word[i]);
        }*/
       /* for(int i =0; i< word.length(); i++){
            for(int j=newstr.length-1;j>=0;j--){
                    result=result + newstr[i] + " ";
                    //result = "" + word.charAt(i) + result;
            }
        }*/

        
        //System.out.println( " " +result.toString());
        //return result.toString();
        
    //}
        //System.out.println(result);
    /*static public void main (String[] args) {
        StringReverseByWord obj = new StringReverseByWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println( str);
        System.out.println(obj.stringReverseByWords( str));
    } 
}*/
//"Let's take LeetCode contest"
//: "s'teL ekat edoCteeL tsetnoc"
class StringReverseByWord{
    public String stringReverseByWord(String s) 
    {
        char[] s1 = s.toCharArray();
        char[] revarray = new char[s1.length];
        int start = 0;
        for(int j = 0; j < s1.length; j++)
        {
            if(s1[j] == ' ')
            {
                revarray = reverse(s1, start,j - 1);
                start = j + 1;
            }
        }
        //reverse(s1, i, s1.length - 1);
        System.out.println(revarray.toString() );
        return revarray.toString();
    }

    public char[] reverse(char[] s, int start, int end)
    {
        for(  int  i =end; i>=start; i--){
                s[i] = s[end];
        }
        //System.out.println( s);
        return s;

    }
    static public void main (String[] args) {
        StringReverseByWord obj = new StringReverseByWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println( str);
        System.out.println(obj.stringReverseByWord( str));
    } 
}