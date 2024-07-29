import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String word = sc.nextLine();
        String rev = "";
        for(int i = word.length()-1;i>=0;i--){
            rev += word.charAt(i);

        }
        System.out.println(rev);
    }
}
