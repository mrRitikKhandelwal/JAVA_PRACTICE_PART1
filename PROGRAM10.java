import java.util.Scanner;
public class PROGRAM10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int copy_num = num;
        int reverse = 0;

        while(copy_num != 0) {
            int rem = copy_num%10;
            reverse = (reverse * 10) + rem;
            copy_num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
