import java.util.*;
import java.io.*;
import java.lang.*;
class StringFirstUniqueChar{
    //str = nidhi ,o/p = 0;
    //nkln, o/p = 1
    //leetcode = index =0;
    //cc= ind = -1
    //loveleetcode = ind = 2
    //basic method not applicable for all the method
    public int stringFirstUniqueChar( String str){
         int len = str.length();
        for( int i = 0; i < len; i++){
            int count = 1;
            for( int j = i+1; j < len; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    break;
                }
            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
        
//using HashMap
        //error=cannot find symbool in method(System.out.println(obj.stringFirstUniqueChar(str)); ???
        //hsmap is used to store key and value in any order and after iterate to the str.length for 
        //find the exact index of eaxct char  in string First unique char.
    /*class StringFirstUniqueChar{
        public int stringFirstUniqChar(String str) {
            HashMap<Character, Integer> hmap = new HashMap<>();
            //hash map : store character on the basis of frequency
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (hmap.containsKey(ch)) {
                    hmap.put(ch,hmap.get(ch)+ 1);
                } 
                else{
                    hmap.put(ch, 1);
                }
            }
            
            // IN hmap find the index of each char
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (hmap.get(ch) == 1) {
                    return i;
                }
            }
            return -1;
        }
    */
    
//Using LinkedHashMap
    /*class StringFirstUniqueChar{
        //Linked Hshmap is used for stored key and value ,it maintains the  insertion order that was 
        //actually in string.  
        public void stringFirstUniqueChar(String str) {
            Map<Character,Integer> lmap = new LinkedHashMap<>(str.length());
            for(int  i =0; i<str.length(); i++){
                char ch = str.charAt(i);
                //contains check the key present or not
                if(lmap.containsKey(ch)){
                    // if contains that char then put the ch and get val+1
                    lmap.put(ch,lmap.get(ch)+1);
                }
                else{
                    //if doesnot contains that char then put the ch and get val = 1
                    lmap.put(ch,1);
                    break;
                }
            }//Map.Entry is used to iterate the for-each loop nd then print the value???
            for (Map.Entry<Character,Integer> entry : lmap.entrySet()){ 
                System.out.print("Key =" + entry.getKey());
                System.out.print( ":"+ " Value =" + entry.getValue());
            }
            //print that char whose fequ is 1
            for (Map.Entry<Character,Integer> entry : lmap.entrySet()){ 
                if(entry.getValue() == 1) 
                    System.out.println("Key =" + entry.getKey() + ","+" Value =" + entry.getValue());
                 
            }  
    } */
 
    
        public static void main( String[] args){
            StringFirstUniqueChar obj = new StringFirstUniqueChar();
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            //obj.stringFirstUniqueChar(str);
            System.out.println(obj.stringFirstUniqueChar(str)); 

        }
}