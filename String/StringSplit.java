import java.util.*;
import java.lang.*;
import java.io.*;
//---Hello---World, '_')
//"____Hello World___", '_'
//"", '_')
//null, '_'
//____Hello_ _World___", '_'
//Hello_World", '_'

class Ideone
{
	public static String[] getListToArray(List<String> arr) 
    {
        // Convert ArrayList to object array
        Object[] objArr = arr.toArray();
  
        // convert Object array to String array 
        String[] str = Arrays.copyOf(objArr, objArr.length, String[].class);
        return str;
    }
    
    // complete the function
	public static String[] split(String str, char splitchar) 
	{	//String str = "---nidhi---kumari"
			//split function
			if(str == null || str.length() == 0)
				//blank--true
				//System.out.println(str);
				//??
				return null;
	
			//System.out.println(str == null || str.isEmpty());//--true
			List< String> list = new ArrayList<>();
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
				if (res != "" ){
					list.add(res);
				}
				i =k;
				
			}
			return(getListToArray(list));
			//return "";
			//Print string after removing all special symbool
			//System.out.println( res);//nidhikumari
	}
	
	public static boolean assertion(String[] expected, String[] result) {
		int count = 0;
		if(expected == null) {
			return result == null;
		}
		count++;
		boolean flag = expected.length == result.length;
		for(int i = 0; i < expected.length; i++) {
			flag &= expected[i].equals(result[i]);
		}
		
		if(flag == true) {
			return flag;
		}
		
		System.out.println("failed: expected " + Arrays.toString(expected) + " and your output " + Arrays.toString(result) + " shouldn't mached");
		return false;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{	
		String input = "___Hello__World_";
	
		assertion(new String[]{"Hello", "World"}, new Ideone().split(input, '_'));
		assertion(new String[]{"Hello World"}, new Ideone().split("____Hello World___", '_'));
		assertion(null, new Ideone().split("", '_'));
		assertion(null, new Ideone().split(null, '_'));
		assertion(new String[]{"Hello", " ", "World"}, new Ideone().split("____Hello_ _World___", '_'));
		assertion(new String[]{"HelloWorld"}, new Ideone().split("Hello_World", '_'));
	}
}
