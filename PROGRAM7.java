import java.util.Scanner;
public class PROGRAM7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 0;

        for(int i=1; i<num1; i++) {
            if((num1%i == 0) && (num2%i == 0)) {
                hcf = i;
            }
        }

        int lcm = (num1*num2) / hcf;
        System.out.println("HCF of " + num1 + " and " + num2 + ": " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);
    }
}
