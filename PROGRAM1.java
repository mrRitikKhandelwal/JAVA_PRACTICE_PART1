
import java.util.Scanner;
class PROGRAM1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of total numbers: ");
        int count = sc.nextInt();

        int sum = 0;
        int average = 0;

        for(int i=1; i<=count; i++) {
            System.out.print("Enter " + i + " number: ");
            int num = sc.nextInt();

            sum += num;
        }

        average = sum / count;
        System.out.println("Average: " + average);
    }
}