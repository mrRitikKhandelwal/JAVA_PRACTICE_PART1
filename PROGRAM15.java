import java.util.Scanner;
public class PROGRAM15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int index = 0;
        int flag = 0;

        System.out.println("Enter elements: ");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int search = sc.nextInt();

        for(int i=0; i<size; i++) {
            if(search == arr[i]) {
                flag = 1;
                index = i;
                break;
            }
        }

        if(flag == 1) System.out.println("Found " + search + " at index " + (index+1));
        else System.out.println("Unable to find " + search);
    }
}
