import java.lang.*;
import java.io.*;
import java.lang.*;
/*class BinarySearchDup{
    public int binarySearchDup( int[] a,int key){
        int l = 0;
         int  h = a.length -1;
         int mid =0;
         //l = h  bcz in case of [1,4], k = 4,then condition become true otherwise(l<h) condition false
         if( a == null || a.length == 0)
            return -1;
         while( l < h){
            mid = l + ( h - l)/2;
            if( a[mid] < key){
                 l = mid+1;
            }
            else
                h = mid -1;
        }
        System.out.println( "l = " + l +" h = "  + h+  "mid = " + mid);
        //if doesnot exit value in the given condition ,last h,l,mid all r becomes at same pos,then return l,h
        if( a[h] == key){
            return  h;
        }
            //if vlaue doesnot exit then return -1.
        return -1;

    }
    public static void main( String[] args){
        BinarySearchDup obj = new BinarySearchDup();
        //System.out.println("index is {1,4,6,7,8},7 = " + obj.binarySearchDup(new int[]{1,4,6,7,8},7));

   
        //System.out.println("index is {1,4,6,7,8},1 = " + obj.binarySearchDup(new int[]{1,4,6,7,8},1));
       // System.out.println("index is {1,4,6,7,8},8 = " + obj.binarySearchDup(new int[]{1,4,6,7,8},8));
        System.out.println("index is {1,4,6,7,8},6 = " + obj.binarySearchDup(new int[]{1,4,6,7,8},6));
        //System.out.println("index is {1,4,6,7,8},9 = " + obj.binarySearchDup(new int[]{1,4,6,7,8},9));
        //System.out.println("index is {},0 = " + obj.binarySearchDup(new int[]{},0));
        //System.out.println("index is {1,4},4 = " + obj.binarySearchDup(new int[]{1,4},4));
    }
}
*/
class BinarySearchDup{
    public int binarySearchDupLow( int[] a,int key){
        int l = 0;
         int  h = a.length -1;
         int mid =0;
         //l = h  bcz in case of [1,4], k = 4,then condition become true otherwise(l<h) condition false
         if( a == null || a.length == 0)
            return -1;
         while( l < h){
            mid = l + ( h - l)/2;
            if( a[mid] < key){
                 l = mid + 1;
            }
            else
                h = mid;
        }
        if( a[h] == key){
            return  h;
        }
            //if vlaue doesnot exit then return -1.
        return -1;
    }
    public int binarySearchDupHigh( int[] a,int key){
        int l = 0;
         int  h = a.length -1;
         int mid =0;
         //l = h  bcz in case of [1,4], k = 4,then condition become true otherwise(l<h) condition false
         if( a == null || a.length == 0)
            return -1;
         while( l < h){
            mid = l + (( h - l) +1)/2;
            if( a[mid] > key){
                 h = mid - 1;
            }
            else
                l = mid;
        }
        if( a[h] == key){
            return  h;
        }
            //if vlaue doesnot exit then return -1.
        return -1;
    }
    public static void main( String[] args){
        BinarySearchDup obj = new BinarySearchDup();
        System.out.println("lower index is {7,7},8 = " + obj.binarySearchDupLow(new int[]{7,7},8));//-1
        System.out.println("lower index is {5,7,7,8,8,10},8 = " + obj.binarySearchDupLow(new int[]{5,7,7,8,8,10},8));//3
        System.out.println("lower index is {5,7,8,10},8 = " + obj.binarySearchDupLow(new int[]{5,7,8,10},8));//2
        System.out.println("lower index is {5,5,5},5 = " + obj.binarySearchDupLow(new int[]{5,5,5},5));//3

        System.out.println("lower index is {7,7},8 = " + obj.binarySearchDupHigh(new int[]{7,7},8));//-1
        System.out.println("lower index is {5,7,7,8,8,10},8 = " + obj.binarySearchDupHigh(new int[]{5,7,7,8,8,10},8));//3
        System.out.println("lower index is {5,7,8,10},8 = " + obj.binarySearchDupHigh(new int[]{5,7,8,10},8));//2
        System.out.println("lower index is {5,5,5},5 = " + obj.binarySearchDupHigh(new int[]{5,5,5},5));//3

    }
}
