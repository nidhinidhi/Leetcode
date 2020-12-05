import java.lang.*;
import java.util.*;
import java.io.*;
//in Selectionsort find the min val in whole array in put in the first index and repeat same step until sort the array.
//time complexity in worst case 0(n^2) space comp = 0(1)
//40,20,60,10,50,30 =10,20,30,40,50,60
class SelectionSort{
    public int[] selectionSort(int[] a){
        System.out.println(Arrays.toString(a));

        for(  int  i = 0; i< a.length; i++){
            for( int j = i+1; j< a.length; j++){
                //40,20,60,10,50,30
                //swap 40>20,=20-40
                //20>60 x
                //20>10=10-20
                if( a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void main( String[] args){
        SelectionSort obj = new SelectionSort();
        int[] a = new int[]{ 40,20,60,10,50,30};
        int[] arr = obj.selectionSort( a);
        

        System.out.println(Arrays.toString(obj.selectionSort(new int[]{1,4,45,6,7,8,9})));
        System.out.println(Arrays.toString(obj.selectionSort(new int[]{1,6,7,8,9})));
        System.out.println(Arrays.toString(obj.selectionSort(new int[]{1,4,45})));
        System.out.println(Arrays.toString(obj.selectionSort(new int[]{})));
        
        // for( int i =0; i< arr.length; i++){
        //     System.out.print( a[i] +",");
        // }
        // System.out.println(Arrays.toString( arr));



    }
}