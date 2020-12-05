import java.util.*;
import java.io.*;
import java.lang.*;
class StringPalindrome2{
    //abca =  not valid palinrome = aba/aca return = false
    //aba = valid palindrome
    //abcbea = possible palindrome =true
    //abecbea =not possibe
    //if any index is not match then we check in both side of the palindrome l or r
    //palindrome check
    public boolean checkPalindrome( String s, int l, int r){
        while(l<r){
            if( s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else
                return false;
        }
        return true;
    }
    //remove element for  valiid palindrome
    public boolean stringPalindrome2(String s) {
        int l= 0, r= s.length() - 1;
        while (l <r && s.charAt(l) == s.charAt(r)) {
            l++; r--;
        }

        if (l >= r) 
            return true;
        //check the palindrome either left or right
        if (checkPalindrome(s,l + 1,r) || checkPalindrome(s,l,r - 1)) 
            return true;
        return false;
    }

    public static void main( String[] args){
        StringPalindrome2 obj = new StringPalindrome2();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = obj.stringPalindrome2( s);
        if( flag == true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}