import java.util.Scanner;
public class PROGRAM6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int flag = 1;

        for(int i=2; i<=(Math.sqrt(num)); i++) {
            if(num%i == 0) flag = 0;
        }

        if(flag == 1) System.out.println(num + " is a prime number");
        else System.out.println(num + " is not a prime number");
    }
}
