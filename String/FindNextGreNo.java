import java.util.*;
import java.lang.*;
import java.io.*; 
  
public class FindNextGreNo  
{ 
    // Utility function to swap two digit 
    static void swap(final char ar[], final int i, final int j) {
        final char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // Given a number as a char array number[],
    // this function finds the next greater number.
    // It modifies the same array to store the result
    static void findNextGreNo( String str) {
        int i;

        // I) Start from the right most digit
        // and find the first digit that is smaller
        // than the digit next to it.
        if( str == null || str.length()==0){
            //return 0;
            System.out.println(" nidhi");
        }
        char[] arr = str.toCharArray();
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] <arr[i+1]) {
                break;
            }
        }

        // If no such digit is found, then all
        // digits are in descending order means
        // there cannot be a greater number with
        // same set of digits
        
         if( arr.length>0){
            int x = arr[i - 1];
            int min = i;

            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > x && arr[j] < arr[min]) {
                    min = j;
                }
            }

            // III) Swap the above found smallest
            // digit with number[i-1]
            swap(arr, i - 1, min);

            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(arr, i, arr.length-1);
            //System.out.print("Next number with same" + " set of digits is ");
            for (i = 0; i < arr.length; i++)
                System.out.println(arr[i]);
        }
    }

    public static void main(final String[] args) {
        FindNextGreNo obj = new FindNextGreNo();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //final char digits[] = { '5', '3', '4', '9', '7', '6' };
        //final int n = digits.length;
        findNextGreNo( str); 
    } 
} 