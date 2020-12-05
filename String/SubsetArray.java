//Array is a subset of another array
import java.util.*;
import java.lang.*;
//basic approach time complexity-0(m*n)
/*class SubsetArray { 
    public static boolean isSubset(int arr1[],int arr2[], int m, int n)   
    {
        int i,j;
        for ( i = 0; i < n; i++)//array2 [11,3,7,1]
        { 
            for ( j = 0; j < m; j++) //array1[11,1,13,21,3,7]
                if(arr2[i] == arr1[j]) //elemnt is found then break
                    break; 

            if (j == m) //???
                return false; 
        } 
        return true; 
    }
    public static void main(String args[]) 
    { 
        int arr1[] = {11, 1, 13, 21, 3, 7}; 
        int arr2[] = {11, 3, 8, 1}; 
          
        int m =arr1.length; 
        int n =arr2.length; 
      
        if(isSubset(arr1, arr2, m, n)) 
            System.out.println("arr2[] is subset of arr1[] "); 
        else
            System.out.println("arr2[] is not a subset of arr1[]");  
    } 
} */
// Using hashset time complexity-0(m+n)
//How to fillarray1 value in  the hashtable ???
class SubsetArray 
{ 
    public static boolean isSubset(int arr1[], int arr2[], int m,int n) 
    { 
        HashSet<Integer> S= new HashSet<>(); 
        for(int i = 0; i < m; i++) 
        { 
            if(!S.contains(arr1[i])) //check wheather element is found or not return true and  false
                S.add(arr1[i]); //add arr1 value in hashtable
        }  
        for(int i = 0; i < n; i++) 
        { 
            if(!S.contains(arr2[i])) 
                return false; 
        } 
        return true; 
    }  
  
    public static void main(String[] args)  
    {  
        int arr1[] = {11, 1, 13, 21, 3, 7}; 
        int arr2[] = {11, 3, 7, 1}; 
        int m = arr1.length; 
        int n = arr2.length;

        if(isSubset(arr1, arr2, m, n)) 
        System.out.println("arr2 is a subset of arr1"); 
        else
        System.out.println("arr2 is not a subset of arr1"); 
    } 
} 