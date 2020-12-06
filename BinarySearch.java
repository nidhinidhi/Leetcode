import java.util.*;
import java.lang.*;
import java.io.*;
//iterative approach
/*class BinarySearch{
    public int binarySearch( int[]a , int k){
        int  l = 0, mid=0 ;
        int h = a.length -1;
        while( l <= h){
            mid = l +( h -l)/2;
            if( a[mid] == k)
                return mid;
            if( a[mid] < k)
                l = mid+1;
            else//a[mid]>k
                h  = mid -1;

        }
        return -1;

    }
   
    
    public static void assertion(Object result, Object output) {
        if(result == output) {
            //
            return;
        }

        System.err.println("required: " + result + " found: " + output);

    }
    public static void main( String[] args){
        BinarySearch obj = new BinarySearch();
        //basic approach 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i = 0 ;i < n ;i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index = obj.binarySearch( a , k);
        System.out.println( " Value at index =" + index);
        
        System.out.println( "***************");
        //Anonymous Array
        int val = 50;
        //if  index is match then not print 4 == a[4]
        //if not match then print req ... foun ...
        assertion (4, obj.binarySearch(new int[] {10,20,30,40,50}, val));
        assertion (4, obj.binarySearch(new int[] {10,20,30,40,50,60}, val));
        assertion (2, obj.binarySearch(new int[] {30,40,50,60,70}, val));
        assertion (1, obj.binarySearch(new int[] {40,50,60,70,80}, val));
        assertion (3, obj.binarySearch(new int[] {10,20,30,40,50,60}, val));
        assertion (0, obj.binarySearch(new int[] {0,0,0,0,0}, val));
        

    }
}*/
//recursive approach*****************
class BinarySearch{
    public int binarySearch( int[]a ,int l, int h, int k){
        int mid = 0;
        
        //base condtion for recursive function
            if( l > h)
                return -1;
                
            mid = l +( h -l)/2;
            
            if( a[mid] < k)
                return  binarySearch(a, mid+1,h,k);
            else//a[mid]>k
                return binarySearch(a,l, mid -1,k);

        
        return mid;

    }
    public static void assertion(Object result, Object output) {
        if(result == output) {
            //
            return;
        }

        System.err.println("required: " + result + " found: " + output);

    }
    public static void main( String[] args){
        BinarySearch obj = new BinarySearch();
        System.out.println( "***************");
        //Anonymous Array
        int val = 50;
        //if  index is match then not print 4 == a[4]
        //if not match then print req ... foun ...
        assertion (4, obj.binarySearch(new int[] {10,20,30,40,50},0,4, val));
        assertion (4, obj.binarySearch(new int[] {10,20,30,40,50,60}, 0,5,val));
        assertion (2, obj.binarySearch(new int[] {30,40,50,60,70},0,4, val));
        assertion (1, obj.binarySearch(new int[] {40,50,60,70,80},0,4, val));
        //assertion (3, obj.binarySearch(new int[] {10,20,30,40,50,60}, 0,5,val));
        assertion (0, obj.binarySearch(new int[] {0,0,0,0,0},0,4, val));
        

    }
}

//************************************************ *
/* class BinarySearch{
    public int binarySearch( int[]a , int k){
        int  l = 0, mid=0 ;
        int h = a.length -1;
        //here we not get l<=h .if we take this then add condition inside loop(a[mid] == k) 
        while( l < h){
            mid = l +( h -l)/2;
            if( a[mid] < k)
                l = mid+1;
            else//a[mid]>=k beacause may be mid is middle 
                h  = mid;
        }
        //here we fixed if h=mid then comapre with a[h],
        //and if we fixed l =mid then compare with a[l].
        if( a[h] == k)
            return h;
        return -1;

    }
    public void assertion( int result ,int output){
        if( result == output){
            System.out.println( " result index and output index both same");
            return ;
        }
        System.out.println(" result index is = " + result + "output  index = "+output);
    }
    public static void main( String[] args){
        BinarySearch obj = new BinarySearch();
        int val = 50;
        //if  index is match then not print 4 == a[4]
        //if not match then print req ... foun ...
        obj.assertion (4, obj.binarySearch(new int[] {10,20,30,40,50}, val));
        obj.assertion (4, obj.binarySearch(new int[] {10,20,30,40,50,60},val));
        obj.assertion (2, obj.binarySearch(new int[] {30,40,50,60,70}, val));
        obj.assertion (1, obj.binarySearch(new int[] {40,50,60,70,80}, val));
        obj.assertion (3, obj.binarySearch(new int[] {10,20,30,40,50,60},val));
        obj.assertion (0, obj.binarySearch(new int[] {0,0,0,0,0}, val));
    }
    
}*/