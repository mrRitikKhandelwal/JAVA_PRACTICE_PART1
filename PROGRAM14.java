import java.util.Scanner;
public class PROGRAM14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++) {
            sum += arr[i];
        }

        int average = sum/size;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
