import java.util.*;
import java.io.*;
import java.lang.*;
class CheckArraySort{
    public boolean Solution( int[] a, int n){
        if( a == null || a.length == 0)
            return false;//0
        for( int i = 0; i < n; i ++){
            if (a[i] < a[i+1]) {
                return true;//1
            } 
            else {
                return false; //0  
            }
        }
        return true;//1

    }
    public static void main( String[] args){
        CheckArraySort obj = new CheckArraySort();
        int[] a ={90,80,100,70,40,30};
        int n = a.length;
        System.out.println(obj.Solution(a ,n));

    }
}