import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("First number is: ");
        int a = sc.nextInt();

        System.out.print("Second number is: ");
        int b = sc.nextInt();

        int ans = 0;

        // ^ ___________ Try catch block ______
        try {
            ans = a / b;
            System.out.println("Division is :" + ans);
        } catch (Exception err) {
            System.out.println("You probably dividing the first number with 0");
            System.out.println(err);
            System.out.println(err.getMessage());
        }

    }
}
