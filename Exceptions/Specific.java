import java.util.Scanner;

public class Specific {
    public static void main(String[] args) {

        // int[] arr = new int[] { 20, 45, 23 };
        int[] arr = { 20, 10, 0 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st index :");
        int idx1 = sc.nextInt();

        System.out.print("Enter the 2nd index :");
        int idx2 = sc.nextInt();

        try {
            System.out.print("Division is :" + arr[idx1] / arr[idx2]);
        } catch (ArithmeticException err) {
            System.out.println("Arithmetic Exception occured");
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Array Index Out Of Bounds Exception occured");
        } catch (Exception err) {
            System.out.println("Some exception occured");
        }

    }
}
