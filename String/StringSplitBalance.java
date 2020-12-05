import java.util.*;
import java.io.*;
import java.lang.*;
//RLRLRRLL = RL,RL,RRLL,=3
//RLLLLRRRLR = RL,LLLRRR,LR=3
//String Split in a balance String=return max amount of split balance string.
class StringSplitBalance{
    public int stringSplitBalance( String str){
        //System.out.println( "str = " + str);
        int t_count =0,count1 =0,count2=0,balance =0;
        if( str == null || str.isEmpty())
            //System.out.println(" not count");
            return 0;
        else if (str.length() % 2 != 0)
            //System.out.println("odd length not count");
            return 0;
            
        else{
            for( int i =0; i< str.length(); i++){
                char ch  = str.charAt(i);
                //System.out.println( "ch = " + ch);
                if( ch == 'L')
                    count1++;
                    
                else{
                    if(ch == 'R')
                        count2++;
                    
                }
                t_count = count1-count2;
                {
                    if( t_count == 0)
                        balance++;
                }
            }
        //System.out.println( balance);
        }
        return balance;
    }
    public static void main( String[] args){
            StringSplitBalance obj = new StringSplitBalance();
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            obj.stringSplitBalance( str);
            System.out.println(obj.stringSplitBalance( str));
    }
        
    
}
