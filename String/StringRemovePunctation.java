import java.lang.*;
import java.io.*;
import java.util.*;
/*class StringRemovePunctation{
    public static void main( String[] args){
        StringRemovePunctation obj = new StringRemovePunctation();
        String str = "nid@#hi";
        String Pucctation = "!@#$%^&*(){}|[|]:><?,./';";
        String res = "";
        for( int  i =0; )
    }*/
class StringRemovePunctation
{
	public static void main (String[] args) 
	{
        StringRemovePunctation obj = new StringRemovePunctation();
		String[] dict = {
			"i",
			"am",
			"good",
			"girl",
			"boy",
			"hello",
			"world"
		};
		
		String str = "Iamnotgoodgirl"; 
        String res = "";
        
		/*for(int i = 0; i < str.length();) {
			int j = i;
			while(j < str.length() && (str.charAt(j) == '-' )) {
				// skip
				j++;
			}
			
			
			int k = j; 
			while(k < str.length() && str.charAt(k) != '_') {
                res += str.charAt(k);
                */
				for(int i = 0; i < str.length();i++) {
				// match word in dictionary
                    for(String word : dict) {
                        if(res.equals(word)) {
                            //System.out.println(res);
                            res = "";
                        }
                    }
            }
			
				
			
        System.out.println( res);
    }
}
