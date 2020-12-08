import java.util.*;
import java.io.*;
import java.lang.*;
//merging of two soted array and then get the median
//t.c = O(a.length + b.length),sapce comp = O(a.length + b.length).
//optimized t.c = O(a.length + b.length),sapce comp = O(1).??????
//Using binary search median of two sorted array time .comp = O(log(m+n)),space comp ????
class MedianOfSortArray{
    /*public int[] medianOfSortArray( final int[] a1, final int[] a2, final int[] a3) {
        int i = 0, j = 0, k = 0;
        System.out.println("Array after merging...");
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j])
                a3[k++] = a1[i++];
            else
                a3[k++] = a2[j++];
        }
        while (i < a1.length)
            a3[k++] = a1[i++];
        while (j < a2.length)
            a3[k++] = a2[j++];
        // System.out.println( ArrayOfString( a3));
        return a3;
    }
        public static void main(final String[] args) {

            final MedianOfSortArray obj = new MedianOfSortArray();
            final int a[] = new int[] { 5, 8, 9 };
            final int b[] = new int[] { 1, 4, 6, 7 };
            // System.out.println("Array after merging");
            // int n = a.length+b.length;
            final int merge[] = new int[a.length + b.length];
            obj.medianOfSortArray( a,b,merge);
            System.out.println(" ********"); 
            for (int i=0; i < a.length + b.length; i++) 
                System.out.print(merge[i] + " ");
    }
}*/

    public int[] medianOfSortArray(final int[] a1, final int[] a2) {
        final int[] a3 = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        System.out.println("Array after merging...");
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j])
                a3[k++] = a1[i++];
            else
                a3[k++] = a2[j++];
        }
        while (i < a1.length)
            a3[k++] = a1[i++];
        while (j < a2.length)
            a3[k++] = a2[j++];
        // System.out.println( ArrayOfString( a3));
        return a3;

    }
    public void assertion(final object result, final Object output) {
        if (result == output) {
            //
            return;
        }

        System.err.println("required: " + result + " found: " + output);

    }
    public static void main( String[] args){
        MedianOfSortArray obj = new MedianOfSortArray();
        obj.assertion( new int[]{1,2,3}, obj.medianOfSortArray(new int[]{1,3},new int[]{2}));
    }
}