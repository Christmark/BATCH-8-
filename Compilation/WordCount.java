import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

       
        String[] words = inputString.split("\\s+");

      //bilang
        int wordCount = words.length;
    System.out.println("**********************************");
        System.out.println("Number of words: " + wordCount);
    }
}
