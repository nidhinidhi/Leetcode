import java.util.*;
import java.io.*;
import java.lang.*;

class StringReverseInteger {
        //time complexity is 0(log(n)
        // Integer.MAX_VALUE = 2^31-1 = 2147483647
        //Integer.MAX_VALUE = -2^31 = -2147483647
        //rev is greater than max and smaller than min = overflow
        //rev int 123 =321
        //-321 =-123
        //1000000004 = 0
       public int reverseInteger(int x) {
            int rev = 0;
            int num = x;
           //-321 = (-1)*-321 = 321
            if( num <0)
                num = (-1)*num;
           
           //code for reverse a number
            while (num != 0) {
                int rem = num % 10;//modulo gives the remainder value
                rev = rev * 10 + rem;
                num = num / 10;
            }
           //overflow and underflow condition
            if (rev >=Integer.MAX_VALUE||rev <= Integer.MIN_VALUE||x >= Integer.MAX_VALUE||x <=Integer.MIN_VALUE)
                        return 0;
             
           else{//rev = +321  then return rev no
               //for neg -321 =-321?? 
                   if( rev > 0) 
                       return rev;
                    else
                        return (-1)*rev;
             }

      }
      public static void main( String[] agrs){
        StringReverseInteger obj = new StringReverseInteger();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(obj.reverseInteger(x)); 
      }
           
}