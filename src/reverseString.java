import com.sun.deploy.util.ArrayUtil;


import java.io.Console;

import static java.lang.System.in;
import java.util.Scanner;

/**
 * Created by U063689 on 8/27/2017.
 */
public class reverseString {

    public void reverseEverything(String sentence){
        String reversedSentence = "";
        String[] wordsArray = sentence.trim().split(" ");
        for (String word : wordsArray){
            String reversedWord = "";
            for (int i = word.length()-1; i>=0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }
            reversedSentence = reversedSentence + "" + reversedWord;
        }
        System.out.println(reversedSentence);

    }

    public static void main(String[] arr){
        System.out.println("Enter the sentence");
        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        new reverseString().reverseEverything(input);
    }

}
