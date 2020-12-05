import java.util.*;
import java.io.*;
import java.lang.*;
//no of remove pal subsequence( char in order but delete the char bet the order) to make string is empty
//idea= subseq = aaa--remove is 1,bbb = 1= total remove is =2
//str = "baabab"=2
//abb = 2;
//str = baabba = 2
//baab =1
//since the string has only 2 characters a & b, so it has only 3 cases.
//Case 1: if a string is empty --> return 0
//Case 2: if a string is already palindrome --> return 1;
//Case 3: or else remove all a's first then all b's --> return 2.
class StringRemovePalSubSeq{
    public boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        for(   i = 0 ; i< str.length(); i++){
            if( str.charAt(i) == str.charAt(j)){
                j--;
            }
            else{
                return false;
            }
        }
        return  true;

    }
    public int stringRemovePalSubSeq( String str){
        if( str == null || str.length() == 0)
            return 0;
        
        if( str.length() == 1 || isPalindrome( str))
            return 1;
        return 2;
        
    }
    public static void main( String[] args){
        StringRemovePalSubSeq obj = new StringRemovePalSubSeq();
        Scanner sc = new Scanner(System.in);
        String  str = sc.next();
        System.out.println(obj.stringRemovePalSubSeq( str));
    }
}