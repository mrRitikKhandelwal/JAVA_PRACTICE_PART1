import java.util.Scanner;
public class PROGRAM8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = (1/2.0) * base * height;

        System.out.println("Area of Triangle: " + area);
    }
}
