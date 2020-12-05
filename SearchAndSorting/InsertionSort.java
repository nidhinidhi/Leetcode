import java.util.*;
import java.lang.*;
import java.io.*;
//Worst case time complexity o(n^2)
//space complexity = o(1)
/*Input = 12-11-13-5-6
step 1= 11-12
step 2 = 11-12-13
step 3=5-11-12-13
output step 4= 5-6-11-12-13
*/
class InsertionSort{
    public int[] insertionSort( int[] a){
        if( a == null || a.length == 0)
            return null;
        for( int  i =1 ;i < a.length; i++){
            int temp = a[i] ;//a[1]
            int j = i-1;//j =0 
            while( j >-1 && a[j] > temp){
                a[j+1] = a[j];
                j = j -1;
            }
            a[j+1] = temp;
        }
        return a;  
    }
    public static void main( String[] args){
        InsertionSort obj =  new InsertionSort();
        //int[] a = new int[] { 11,12,5,6,7,8,9};
        //int[] a = new int[] {5,6,7,8,9,10};
        int[] a = new int[] {0,0,0,0};
        int[] temp = obj.insertionSort(a);
        for (int i = 0; i <temp.length; ++i) {
            System.out.print(temp[i] + " "); 
        }
        System.out.println(); 
        System.out.println(Arrays.toString(temp));
       
       /* System.out.println("{1,4,5,6,7,8,9} = " + obj.insertionSort(new int[]{1,4,5,6,7,8,9}));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.insertionSort(new int[]{1,4,5,6,7,8,9}));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.insertionSort(new int[]{1,4,5,6,7,8,9}));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.insertionSort(new int[]{1,4,5,6,7,8,9}));
        */
        
    }
}