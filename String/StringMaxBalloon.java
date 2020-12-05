import java.util.*;
import java.io.*;
import java.lang.*;

class StringMaxBalloon{
    public int stringMaxBalloon( String str){
        int res =Integer.MAX_VALUE;
        String balloon = "balloon";
        //Map< Character, Integer> hmap = new HashMap<>();
        Map< Character, Integer> hashmap = new HashMap<>();

        for( int i = 0;i <balloon.length(); i++){
            if(hashmap.containsKey( balloon.charAt(i))){
                char key = balloon.charAt(i);
                int value = hashmap.get(balloon.charAt(i));
                res = Math.min(res,value);
            }

        }
        return res;

        

    }
    public static void main( String[] args){
        StringMaxBalloon obj = new StringMaxBalloon();
        Scanner sc = new Scanner(System.in);
        String  text = sc.next();
        System.out.println(obj.stringMaxBalloon(text));
    }
}