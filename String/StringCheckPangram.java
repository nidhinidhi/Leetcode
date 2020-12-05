import java.util.*;
import java.io.*;
import java.lang.*;

/*class StringCheckPangram{
    public boolean checkPangram(String str){
        //pangram = string contain all letter a-z;
        boolean[] a = new boolean[26];
        //In java  array of all index contain false value at initial.
        int index = 0;
        //boolean flag = false;
        for(int i =0; i< str.length(); i++){
            //here we comparing char at ith index of string=asci value of 'A' 
            if( str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    index = (str.charAt(i)-'A');
                    a[index] = true;//how we get index=char-ascii val
            }
            else if( str.charAt(i)>='a' && str.charAt(i)<='z'){
                    index = (str.charAt(i)-'a');
                    a[index] = true;
            }
            else
                continue;

            //a[index] = true;
        }
        for( int i =0; i<26; i++){
            if( a[i] == false)
                //flag = true;
                return false;
        }
        return true;
    }
    public static void main( String[] args){
        StringCheckPangram obj = new StringCheckPangram();
        String str = "The quick brown fox jumps over the   dog ";
        //String str  = " The abc is english word";
       // System.out.println( "string length" + str.length());//str length is total length char+space=43
        //obj.checkPangram( str);
        if( obj.checkPangram(str) == true)
            System.out.println(" string is pangram" );
        else
            System.out.println("string is not pangram" );
    }
}*/
class StringCheckPangram { 

	// Returns true if the string 
	// is pangram else false 
	public static boolean checkPangram(String str) 
	{ 
		// Create a hash table to mark the 
		// characters present in the string 
		// By default all the elements of 
		// mark would be false. 
		boolean[] mark = new boolean[26]; 

		// For indexing in mark[] 
		int index = 0; 

		// Traverse all characters 
		for (int i = 0; i < str.length(); i++) { 
			// If uppercase character, subtract 'A' 
			// to find index. 
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') 
				index = str.charAt(i) - 'A'; 

			// If lowercase character, subtract 'a' 
			// to find index. 
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') 

				index = str.charAt(i) - 'a'; 

			// If this character is other than english 
			// lowercase and uppercase characters. 
			else
				continue; 
			mark[index] = true; 
		} 

		// Return false if any character is unmarked 
		for (int i = 0; i <= 25; i++) 
			if (mark[i] == false) 
				return (false); 

		// If all characters were present 
		return (true); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		String str = "The quick brown fox jumps over the lazy dog"; 
		//String str = "abc defg is";
		if (checkPangram(str) == true) 
			System.out.print(str + " is a pangram."); 
		else
			System.out.print(str + " is not a pangram."); 
	} 
} 
