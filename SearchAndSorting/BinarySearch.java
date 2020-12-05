import java.util.*;
import java.lang.*;
import java.io.*;
//iterative approach
/*class BinarySearch{
    public int binarySearch(int[] a, int k ){
        int l = 0;
        int h = a.length -1;
        if( a == null || a.length == 0)
            return -1;
        while( l <= h){
            int mid = l + ( h - l)/2;
            if( a[mid] == k){
                return mid;
            }
            if( a[mid] > k){
                h = mid - 1;
            }
            else{//a[mid] < k
                l = mid + 1;
            }
            
        }
        return -1;
    }
    
    public static void main( String[] args){
        BinarySearch obj = new BinarySearch();
        int[] a = new int[]{1,2,5,6,7,8};
        int k  = 6;
        System.out.println(obj.binarySearch( a,k ));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9}, 8));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9}, 5));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9}, 1));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9}, 9));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9}, 6));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1}, 6));
        System.out.println("{1,4,5,6,7,7,7} = " + obj.binarySearch(new int[]{1,4,5,6,7,7,7}, 7));
        System.out.println("{7,7,7,7,7,7,7} = " + obj.binarySearch(new int[]{7,7,7,7,7,7,7}, 7));
    }
}*/
//recursive approach
class BinarySearch{
    public int binarySearch(int[] a, int l, int h, int k ){

        if( a == null || a.length == 0)
            return -1;
        
        while(l <= h){
            int mid = l + ( h - l)/2;
            
            if( a[mid] == k){
                return mid;
            }
            
            if( a[mid] > k){
                return binarySearch( a,l, mid - 1, k);
            }
         
            return binarySearch( a, mid + 1, h,k);
        }
        
        return -1;
    }
    public static void main( String[] args){
        BinarySearch obj = new BinarySearch();
        int[] a = new int[]{1,2,5,6,7,8};
        int k  = 6;
        int l = 0;
        int h = a.length -1;
        System.out.println(obj.binarySearch( a, l, h,k));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9} , 0, 7-1, 8));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9} , 0, 7-1, 5));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9} , 0, 7-1, 1));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9} , 0, 7-1, 9));
        System.out.println("{1,4,5,6,7,8,9} = " + obj.binarySearch(new int[]{1,4,5,6,7,8,9} , 0, 7-1, 6));

        // System.out.println("{1,4,5,6,7,8,9} = " + obj.(new int[]{1,4,5,6,7,8,9} , 0, 7-1, 6));
        
    }
}
