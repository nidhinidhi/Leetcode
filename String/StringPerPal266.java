import java.util.*;
import java.lang.*;
import java.io.*; 
//time complexity = o(n)
//space complexity = 0(1)
//String Permutation is palindrome or not
//aab 
//permutation = 3!/2!1!=3...aab,aba,baa
//here aba is palindrome
//check even palindrome  = in String count of all char is even ...aabb(a=2,b=2)
//check odd palindrome  = in String count of all char is even,and only char has odd count ...aab(a=2,b=1)  
class StringPerPal266{
    public boolean stringPerPal(String  s){
        if( s == null || s.length() == 0)
            return false;
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for (int i  =0; i< s.length(); i++) {
            //containsKey is checking for char is present or not in hmap
            if (hmap.containsKey(s.charAt(i))) { 
                 // If char is present is hmap, 
                // then put the char and value+1(freq is increase with 1) 
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1); 
            } 
            else { 
                // If char is not present in hmap  
                // then put the char and its value is 1
                hmap.put(s.charAt(i), 1); 
            } 
        }

        //map.entry is used for iterate over loop and print the key and ferq of each key 
        for (HashMap.Entry entry : hmap.entrySet()) { 
            System.out.println(entry.getKey() + "= " + entry.getValue()); 
        }

        int count = 0;
        //for( char ch = 0; ch<=hmap.keySet(); ch++){
        for (char key: hmap.keySet()) {
            //hmap.get () gives the value(freq) of each char
            count += hmap.get(key) % 2;
            //System.out.print( " sum = " + count);
        }
        //hmap.keySet() is used to get the key(char in hmap)
        System.out.print("The set is: " + hmap.keySet());

        //System.out.println( " sum = " + count);
        if( count <= 1){
           // System.out.println( " palindrome");
           return true;
        }
        else{
            //System.out.println( " not palindrome");
            return false;
        }
       // return true;
       
    }
        public static void main( String[] args){
            StringPerPal266 obj = new StringPerPal266();
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(obj.stringPerPal( str));
    
        }
    }
/*
//other method is used for check palindrome
class StringPerPal266{
    public boolean stringPerPal(String  s){
        if( s == null || s.length() == 0)
            return false;
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for (int i  =0; i< s.length(); i++) {
            //containsKey is checking for char is present or not in hmap
            if (hmap.containsKey(s.charAt(i))) { 
                 // If char is present is hmap, 
                // then put the char and value+1(freq is increase with 1) 
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1); 
            } 
            else { 
                // If char is not present in hmap  
                // then put the char and its value is 1
                hmap.put(s.charAt(i), 1); 
            } 
        }

        //map.entry is used for iterate over loop and print the key and ferq of each key 
        for (HashMap.Entry entry : hmap.entrySet()) { 
            System.out.println(entry.getKey() + "= " + entry.getValue()); 
        }

        int count = 0;
        //for( char ch = 0; ch<=hmap.keySet(); ch++){
        for (char key: hmap.keySet()) {
            //hmap.get () gives the value(freq) of each char
            count += hmap.get(key) % 2;
            //System.out.print( " sum = " + count);
        }
        //hmap.keySet() is used to get the key(char in hmap)
        System.out.print("The set is: " + hmap.keySet());

        boolean oddfreq= false;
        for (char key : hmap.keySet()) {
            if (hmap.get(key) % 2 != 0) {
                if (oddfreq) {
                    return false;
                }
                oddfreq = true;
            }
        }
    return true;
    }
    public static void main( String[] args){
        StringPerPal266 obj = new StringPerPal266();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(obj.stringPerPal( str));

    }
}*/
