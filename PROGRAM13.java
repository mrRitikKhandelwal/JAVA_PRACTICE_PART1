import java.util.Scanner;
public class PROGRAM13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String reverse = "";
        int length = sentence.length();

        for(int i=(length-1); i>=0; i--) {
            char ch = sentence.charAt(i);
            reverse += ch;
        }

        System.out.println("Reversed sentence: " + reverse);
    }
}
