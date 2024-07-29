
import java.util.Scanner;

public class Capatilize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String sentence = sc.nextLine();
        String newsString = "";
        boolean nextWord = true;
        for (char i : sentence.toCharArray()) {
            if (nextWord) {
                newsString += Character.toUpperCase(i);
                nextWord = false;
            }
            else{
                newsString += i;
                nextWord = i==' ';
            }
            
        }
        System.out.println(newsString);

    }
}
