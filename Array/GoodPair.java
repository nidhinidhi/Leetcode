import java.lang.*;
import java.util.*;
import java.io.*;
/*public class ArrayPrint{
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7};

		System.out.println(a.length);
		System.out.println( " Array->" + Arrays.toString( a));
		System.out.print( "[");
		for( int i =0; i< a.length; i++){
			System.out.print(a[i]);
			if( i < a.length-1)
				System.out.print( ", ");
		}
		System.out.println( "]");
	}
}*/ 
class GoodPair {
//find good pair = a[1,1,1,1]=  coun the pair of index (a[i] ==a[j],i<j;;index=(0,1)(0,2)(0,3),(1,2)(1,3),(2,3)=6
    public int goodPair(int[] a) {
		if( a == null || a.length == 0)
			return 0;
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
			if (hmap.containsKey(a[i])) {
				hmap.put(a[i], hmap.get(a[i]) + 1);
			} else {
				hmap.put(a[i], 1);
			}
		}
		int count = 0;
        for(Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
			int n = entry.getValue();
			if( n>=2){
				count = count + n*(n-1)/2;//explain Nc2=n!/(n!-2)*2!
			}
		}
		return count;
		
    }
        public static void main( String[]  args){
            GoodPair obj = new GoodPair();
			int[] a = new   int[]{1,2,3,1,1,3};//output = 4
			//a.length ==0; good pair =0
			//int[] a;//a == null; error - a cant be initialized
            System.out.println(" Good pair = " + obj.goodPair(a));
        } 
}