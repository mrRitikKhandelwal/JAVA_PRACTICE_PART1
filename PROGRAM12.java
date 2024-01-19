import java.util.Scanner;
public class PROGRAM12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + ", " + b + ", ");

        for(int i=3; i<=limit; i++) {
            int c = a + b;
            System.out.print(c + ", ");

            a = b;
            b = c;
        }
    }
}
