import java.util.*;
import java.io.*;
import java.lang.*;
//["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
class StringGroupSpecialEqu893{
    public int stringGroupSpecialEqu893(List<String> list){
        //System.out.println( "nidhi");
        //System.out.println("String of array::" + list);
        //return 0;
        
        HashSet<String> set = new HashSet<String> ();
        for( int i =0; i< list.size(); i++){
            String str = list.get(i);
            //System.out.println( str);
            char[] arr = str.toCharArray();
            //System.out.println("arr" + arr);
            for( int  j = 0; j< arr.length; i++){
                //System.out.println("arr= " + arr[0]);
                //if( j% 2 != 0 || j%2 == 0){
                    // if index is even or odd then swap even -even,odd=odd,
                    for(int k=j+2;k<arr.length;){
                        if(arr[j] < arr[k]) {
                            char temp = arr[k];
                            arr[k] = arr[j];  
                            arr[j] = temp;
                        }
                        k+=2;
                    }

            }
            //System.out.println( arr);
            String newstr = "";
            newstr =newstr + arr.toString();
            System.out.println( newstr);
            set.add( newstr);//set contain only  unique string
            //i.e size of string gives  no group of having  similar string


        }
        return set.size();

    }
    public static void main( String[] args){
        StringGroupSpecialEqu893 obj = new StringGroupSpecialEqu893();
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //String[] str = new String[100];
        //size of stringis not define..that way we take input as arraylist ...to store the string in array
        List<String> list = new ArrayList<String>();
        String str = sc.next();
        list.add( str);
        
        
        //System.out.println( str);
        System.out.println(obj.stringGroupSpecialEqu893(list)); 

    }
}