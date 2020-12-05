import java.io.*;
import java.lang.*;
import java.util.*;

class StringFirstLetterInWord {
// str= nidhi ,o/p= n
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        char x;
        int l;
        System.out.print("Enter any sentence: ");
        s = br.readLine();
        s = " " + s; //adding a space infront of the inputted sentence or a name
        System.out.println(" ==="+ s);
        //s = s.toUpperCase(); //converting the sentence into Upper Case (Capital Letters)
        l = s.length(); //finding the length of the sentence
        System.out.print("Output = ");

        for (int i = 0; i < l; i++) {
            x = s.charAt(i); //taking out one character at a time from the sentence
            if (x == ' ') //if the character is a space, printing the next Character along with a fullstop
                System.out.print(s.charAt(i + 1));
        }
    }
}