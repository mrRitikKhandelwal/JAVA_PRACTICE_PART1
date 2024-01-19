import java.util.Scanner;
public class PROGRAM2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double simple_interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simple_interest);
    }
}
