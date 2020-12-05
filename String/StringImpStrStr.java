import java.util.*;
import java.io.*;
import java.lang.*;
//haystack = "hello", needle = "ll" ans =index(2)
//implement Strstr is the find the substring of (needle) in main string (haystack)
// index of substring = int strstr( String str1, String str2)
//if substring is not found -return -1
//if substring is empty - return 0
class StringImpStrStr{
    public int stringImpSubstr(String str1, String str2) {
        //if both string is empty 
        if(str1==null||str2==null)    
            return 0;
     //if str 2 is empty
        if(str2.length() == 0)
            return 0;
        if( str2.length() > str1.length())
            return -1;
        for(int i=0; i<str1.length(); i++){
            //if str2 len is greater than str1
             int m = i;
            for(int j=0; j<str2.length(); j++){
                if(str2.charAt(j)==str1.charAt(m)){
                    if(j == str2.length()-1)
                        return i;
                    //m++;
                    break;
                }
                m++;
            }    
        }   
     
        return -1;
    }
    
    /*public int stringImpSubstr( String haystack, String needle){
        for (int i = 0; i< haystack.length(); i++) { // The length of haystack
            for (int j = 0; j< needle.length() ; j++) { // The length of needle
                if (j == needle.length()) 
                    return i; // if needle string found in haystick then return index of i
                if (i + j == haystack.length()) 
                    return -1; //  no element found in haystick 
                if (needle.charAt(j) != haystack.charAt(i + j)) 
                    break; //  
            }
        }
        return -1;
    }*/
    public static void main(String[] args){
        StringImpStrStr obj = new StringImpStrStr();
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        System.out.println(obj.stringImpSubstr( haystack,needle));
    }
}

 
