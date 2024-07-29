
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.print("Enter a sentence : ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(reverseWords(sentence));
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i];
        
            if (i > 0) {
                reversedSentence += " ";
            }
        }
    
        return reversedSentence;
    }
}
