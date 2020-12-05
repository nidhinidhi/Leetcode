import java.util.*;
import java.lang.*;
import java.io.*;
//---Hello---World, '_')
//"____Hello World___", '_'
//"", '_')
//null, '_'
//____Hello_ _World___", '_'
//Hello_World", '_'
class SStringSplit
{
	public void stringSplit (String str,char splitchar)
	{	//String str = "---nidhi---kumari"
		//split function
		if(str == null || str.length() == 0){
			//blank--true
			System.out.println(str);

		//System.out.println(str == null || str.isEmpty());//--true
		
		String res = "";
		for(int i = 0; i < str.length(); i++) {
            int j = i;
			//check the special symbool and skip that value
			//System.out.println( str);
			
			while(j < str.length() && (str.charAt(j) == splitchar )) {
					j++;
			}
			
			int k = j; 
			//System.out.println(k);
			//here check character and add in result
			res = "";
			while( k < str.length() && (str.charAt(k) != splitchar )) {
					res += str.charAt(k);
					k++;
			}
			System.out.println(res);
			char[] arr = new char[res.length()];
			for(int  x = 0 ; x< arr.length; x++){
				  arr[x] =  res.charAt(x);
			} 
			System.out.println(arr); 
			
            //return res;
			i =k;
			
		}
	}
		//return "";
		//Print string after removing all special symbool
        //System.out.println( res);//nidhikumari
}
	public static void main (String[] args)
	{
		SStringSplit obj = new SStringSplit();
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char splitchar = sc.next().charAt(0);//return the char(0) in a string
		obj.stringSplit( str,splitchar);

		//String str1 = "";//String is empty that means In String class add of obj is assign(str),but the value at that add is empty.
		//String str2 = null;//String is null that means var(Str2) is not point any striing obj,bcz add is not defined.
		
		

	}
}