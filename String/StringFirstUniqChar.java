import java.util.*;
import java.io.*;
import java.lang.*;
class StringFirstUniqChar{
    public int stringFirstUniqChar(String str) { 
            for( int i  =0 ; i< str.length(); i++){
                for( int  j =i+1; j<str.length(); j++){
                    if(str.charAt(i) == str.charAt(j))
                        break;
                    else{
                        return i;
                    }
                }
            }
            return -1;
    }
    public static void main(String[] args){
        StringFirstUniqChar obj = new StringFirstUniqChar();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(obj.stringFirstUniqChar( s));
    }
}
/*class StringFirstUniqChar{
    public int stringFirstUniqChar(String s){
        HashMap<Character, Integer> hmap = new HashMap<>();
        int n = s.length();
        //hash map : store character on the basis of freqquency
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        
        // IN hmap find the index of each char
        for (int i = 0; i < n; i++) {
            if (hmap.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        StringFirstUniqChar obj = new StringFirstUniqChar();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(obj.stringFirstUniqChar( s));
    }
    
}*/