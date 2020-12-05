import java.util.*;
import java.io.*;
import java.lang.*;
/*class StringLongestCommonPrefix{
    //String[] str ={ "flower","flow","flight"}
    //match word by word( (str1,str2) str3)...
        //tc=o(NM)N = Number of strings
        //M = Length of the largest string string 
    //array sort and iterate from min to high 
        // O(MAX * n * log n ) where n is the number of strings in the array and 
        //MAX is maximum number of characters in any string.
    public  String commonPrefixtil( String str1, String str2){
        //(1) lcp = str1 = flower, str2 = str[i] =flow
        //i-str1 and j - str2 
        //(2) str1= flow ,st2 = flight
        String  res = "";
        for( int  i =0, j = 0; i< str1.length() && j< str2.length();                    i++,j++){
            if( str1.charAt(i) != str2.charAt(j))
                break;
            res = res + str1.charAt(i);
        }
        return res;//flow--->fl
    }
    
    public String longestCommonPrefix( String[] strs){
            
            if (strs.length == 0) 
                return ""; 
            if (strs.length == 1) 
                return strs[0]; 
            String lcp = strs[0];//flower--
            for( int  i =0; i< strs.length; i++){
                 lcp = commonPrefixtil( lcp,strs[i]);//(1)= flow. (2)fl
            }
            return lcp;    
     }
    public static void main( String[] args){
        StringLongestCommonPrefix obj = new StringLongestCommonPrefix();
        String[] str = {"anj","flow","flight"};
        String ans = obj.stringLongestCommonPrefix( str);
        //System.out.println( obj.stringLongestCommonPrefix( str));
        System.out.println( ans);
    }          
}
*/
class StringLongestCommonPrefix{
    public  String commonPrefixtil( String str1, String str2){
        //(1) lcp = str1 = flower, str2 = str[i] =flow
        //i-str1 and j - str2 
        //(2) str1= flow ,st2 = flight
        String  res = "";
        int min = Math.min( str1.length() , str2.length());
        for( int  i =0; i< min ; i++){
            if( str1.charAt(i) != str2.charAt(i)){
                break;
            }
            res = res + str1.charAt(i);
            return res;
        }
        //System.out.println(" string is not match");
        return "";//flow--->fl

    }
    public String stringLongestCommonPrefix(String[] str){
        if ( str == null || str.length == 0){
        //System.out.println(" nidhi");
                return "";
        }
        String prefix = str[0];
        for( int  i = 1;i< str.length; i++){
            prefix = commonPrefixtil( prefix,str[i]);
        }
        return prefix;

    }
    public static void main( String[] args){
        StringLongestCommonPrefix obj = new StringLongestCommonPrefix();
        String[] str = {"anj","flow","flight"};
        String ans = obj.stringLongestCommonPrefix( str);
        //System.out.println( obj.stringLongestCommonPrefix( str));
        System.out.println( ans);
    }
}
