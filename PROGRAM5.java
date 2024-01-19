import java.util.Scanner;
public class PROGRAM5 {
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

        if(reverse == num) System.out.println(num + " is a palindrome number");
        else System.out.println(num + " is not a palindrome number");
    }
}
