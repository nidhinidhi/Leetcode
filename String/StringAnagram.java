import java.util.*;
import java.io.*;
import java.lang.*;
//time complexity = o(nlogn)
/*class StringAnagram{
    //s = "anagram",t="naargam"=> s=t=true
    //s= "cat" t = "rat"; s x t=false
    //An Anagram is if all char is exits in both string are equal ,not maintain the index order
    public boolean stringAnagram(String s, String t){
        //for string convert in char array,and then apply sorting in array
        char[] a1 = s.toCharArray();
        char[] a2 = s.toCharArray();
        for( int  i =0 ;i<a1.length; i++){
            System.out.print( " |" + a1[i]);
        }
        //both array are sprted in alphabetic order
        System.out.println("\n");
        Arrays.sort(a1);
        Arrays.sort(a2);
        //apply equals method in array
        if(Arrays.equals( a1, a2))
            return true;
        //convert sorted array in string and then apply equals method
        Arrays.sort(a1);
        String str1 = a1.toString();
        String x = a1.toString();
        System.out.println("\nstr1 = " +  x);
        Arrays.sort(a2);
        String y= a2.toString();
        System.out.print("\n str2 = "+ y);
        if(x.equals(y))
            return true;
        
        return false;
    }
    
    public static void main( String[] args){
        StringAnagram obj = new StringAnagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        //obj.stringAnagram(s , t);
        System.out.println(obj.stringAnagram(s,t)); 

    }
} */
// time complexity o(n)
class StringAnagram{
    public boolean  stringAnagram( String s,String t){
        int NO_OF_CHARS = 256;
        int count1[] = new int [NO_OF_CHARS];
        //int count2[] = new int [NO_OF_CHARS];
        char[] str1 =s.toCharArray();
        char[] str2 =t.toCharArray();
        for( int i  = 0; i<str1.length; i++){
            System.out.print("|" + str1[i]);
        }
        System.out.print( " \n");
        for( int i  = 0; i<str2.length; i++){
            System.out.print("/" + str2[i]);
        }
        for( int  i = 0 ;i< str1.length && i< str2.length; i++){
            count1[str1[i]]++;
            count1[str2[i]]--;
            //count2[str2[i]]++;      
            //System.out.print("**" + count2[i]);
        }
        System.out.print( " \n");
        if(str1.length != str2.length)
            return false;
        for( int  i  =0 ;i< NO_OF_CHARS; i++){
            //if( count1[i] != count2[i])
            if (count1[i] != 0) 
                return false;
            
        }
        return true;


    }
    public static void main( String[] args){
        StringAnagram obj = new StringAnagram();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        //obj.stringAnagram(s, t);
        System.out.println(obj.stringAnagram(s,t)); 

    }

}    