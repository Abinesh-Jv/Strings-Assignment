import java.util.Scanner;

public class Vowels{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String word = sc.nextLine().toLowerCase();
        int count = 0;
        for(char i:word.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
