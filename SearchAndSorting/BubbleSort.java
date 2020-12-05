import java.lang.*;
import java.util.*;
import java.io.*;
//time complexity in o(n^2)
//space complexity is  o(1)
//bubblesort select nearest min value and swap step by step until get soted array
//3, 60, 35, 2, 45, 320, 5 = 3>60x
//3, 60, 35, 2, 45, 320, 5 = 3- 60> 35 then swap = 3-35-60--
class BubbleSort{
    public int[] bubbleSort(int[] a){
        for(int i=0; i < a.length; i++){  
            for(int j=1; j < (a.length-i); j++){  
                     if(a[j-1] > a[j]){  
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }
    public static void main( String[] args){
        BubbleSort obj = new BubbleSort();
        int[] a = new int[] { 3, 60, 35, 2, 45, 320, 5 };
        int[] arr = obj.bubbleSort( a);
        for( int i =0; i< arr.length; i++){
            System.out.print( a[i] +",");
        }
        System.out.println(Arrays.toString( arr));
    }
}