import java.util.*;
import java.io.*;
import java.lang.*;
/*class StringMorseCode{
    public static void main( String[] args){
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
    //"gin" -> "--...-." both have same =1
    //"zen" -> "--...-."
    //"gig" -> "--...--." both are same = 1
    //"msg" -> "--...--." total different morsecode is 2

        HashSet<String> set = new HashSet<>();
		String[] morsecode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
                for (int i = 0; i< words.length; i++) {
                    String temp = "";
                    for (int j = 0; j < words[i].length(); j++) {
                        temp += morsecode[words[i].charAt(j) - 'a'];
                    }
                    set.add(temp);
                }
                System.out.println(" total no of distinct morsecode ::" + set.size());
            }

}*/
class StringMorseCode{
    //string[] = 
    public int stringMorseCode( String[] words ){
        HashSet<String> set = new HashSet<>();
		String[] morsecode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
                for (int i = 0; i< words.length; i++) {
                    String temp = "";
                    for (int j = 0; j < words[i].length(); j++) {
                        temp += morsecode[words[i].charAt(j) - 'a'];
                    }
                    set.add(temp);
                }
        return set.size();
    }
    public static void main( String[] args){
        StringMorseCode obj = new StringMorseCode();
        Scanner sc = new Scanner(System.in);
        String[]  stringArray = new String[20];
        for (int i = 0; i < 20; i++){
                stringArray[i] = sc.nextLine();
                //System.out.println( stringArray[i]);
        }
        System.out.println(obj.stringMorseCode( stringArray));
    }
}