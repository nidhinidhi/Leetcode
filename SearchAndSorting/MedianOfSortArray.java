import java.util.*;
import java.io.*;
import java.lang.*;
class MedianOfSortArray{
    public int[] medianOfSortArray( int[] a, int[] b,int[] merge){
        int i =0,j =0,k =0;
        System.out.println("Array after merging..."); 
        while( i < a.length && j < b.length){
            if( a[i] > b[j]){
                merge[k] = b[j];
                k++;
                j++;
            }
            else{
                merge[k] = a[i];
                k++;
                i++;
            }
        }
        while(  i < a.length ){
            merge[k] = a[i];
        }
        while(  j < b.length ){
            merge[k] = b[j];
        }
        //System.out.println( ArrayOfString( merge));
        return merge;


    }
    public static void main( String[] args){
        MedianOfSortArray obj = new MedianOfSortArray();
        int a[] = new int[]{5,8,9};
        int b[] =new int[]{1,4,6,7};
        //System.out.println("Array after merging"); 
        //int n = a.length+b.length;
        int merge[] = new int[a.length + b.length];
        obj.medianOfSortArray( a,b,merge);
        System.out.println("Array after merging"); 
        for (int i=0; i < a.length + b.length; i++) 
            System.out.print(merge[i] + " "); 
    }
}