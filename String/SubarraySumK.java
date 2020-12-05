import java.util.*;

class SubarraySumK
{
    public static void main(String[] args)
    {
        int arr[] = { 9,4,20,3,10,5};
        int k = 33;
        int count = 0;
        int currsum = 0;
        for ( int i = 0; i < arr.length ; i++)
        {
            for( int j = i+1 ; j< arr .length; j++){
                currsum = currsum+ arr[i] + arr[j];
                if ( currsum == k){
                     count++;
                     break;
                }
            }
        }
        System.out.println("no of subarray" + count);
    }
}