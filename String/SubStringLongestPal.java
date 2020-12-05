import java.util.*;
import java.io.*;
import java.lang.*;

/*class SubStringLongestPal
{   //palindrome = substr;
    //11121 = 1,11,111,1112,11121,1,11,112,1121,1,12,121,2,21,1
    //aaba = a,aa,aab,aaba,a,ab,aba,b,ba,a
    public boolean palindromeCheck( String substr ,int i , int j){
        boolean flag = true;
        String palindrome = ""; 
        while (i < j) {  
            if (substr.charAt(i) != substr.charAt(j)){ 
                flag = false;
                return flag;
            }
            i++; 
            j--; 
        }
        if ( flag == true){
            palindrome = substr;
            //String[] a =palindrome.split(",");
            //for each is use to store each value os array in string
                
            //System.out.print( palindrome + " ");
        }
        return true; 
    } 
    //longest palindrome substring
           
    public String longPalSubstring( String str){
        String longpalsub = "";
        int max_length =0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String substr= str.substring(i,j);
                //System.out.print(  " ," + substr );
                //11121 = 1,11,111,1112,11121,1,11,112,1121,1,12,121,2,21,1
                //aaba = a,aa,aab,aaba,a,ab,aba,b,ba,a
                int l = 0;
                int r = substr.length() -1;
                int temp_length = substr.length();
                //longpalsub = palindromeCheck( substr ,l ,r);
                //???
                //1,11,111,1,11,1,121,2,1
                //babad = b bab a aba b a d
                if(palindromeCheck(substr ,l ,r)){
                    if (temp_length > max_length)
			        {
				        max_length = temp_length;
				        longpalsub = substr;
			        }
                }
                    //check palindrome
            }
        }
        return longpalsub;
    }
    public static void main(String[] args){
        SubStringLongestPal obj = new SubStringLongestPal();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //longPalSubstring( str)
        System.out.println(obj.longPalSubstring("longest pal substring is =" +str));

    }
}*/
class SubStringLongestPal{
        public String longSubstringPal(String s) {
            char[] ca = s.toCharArray();
            int rs = 0, re = 0;
            int max = 0;
            for(int i = 0; i < ca.length; i++) {
                if(isPalindrome(ca, i - max - 1, i)) {
                    rs = i - max - 1; re = i;
                    max += 2;
                } else if(isPalindrome(ca, i - max, i)) {
                    rs = i - max; re = i;
                    max += 1;
                }
            }
            return s.substring(rs, re + 1);
        }

        private boolean isPalindrome(char[] ca, int s, int e) {
            if(s < 0) return false;
            
            while(s < e) {
                if(ca[s++] != ca[e--]) 
                return false;
            }
            return true;
        }
        public static void main(String[] args){
        SubStringLongestPal obj = new SubStringLongestPal();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //longPalSubstring( str)
        System.out.println(obj.longSubstringPal("longest pal substring is =" +str));

        }
}