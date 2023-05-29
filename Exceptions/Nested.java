import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 0 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st index :");
        int idx1 = sc.nextInt();

        System.out.print("Enter the 2nd index :");
        int idx2 = sc.nextInt();

        try {
            System.out.println("Inside First try block");
            try {
                System.out.println("Inside Second try block");
                System.out.print("Division is :" + arr[idx1] / arr[idx2]);

            } catch (Exception err) {
                System.out.println(err.getMessage());
            }

        } catch (Exception err) {
            System.out.println("Other Exception occured");
        }

    }
}
