import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        // ? We can write our custom Exceptions with
        // ? Exception Class.

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("A is :");
        a = sc.nextInt();

        if (a > 9) {
            try {
                throw new CustomException();
            } catch (Exception err) {
                System.out.println(err);
                // System.out.println(err.getMessage());
            }
        }
    }
}

class CustomException extends Exception {

    @Override
    public String toString() {
        return super.toString() + "!Custom getMessage";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Custom getMessage #";
    }
}