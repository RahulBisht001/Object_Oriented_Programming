public class Throws {

    public static double area(int r) throws NegativeException {

        if (r < 0) {
            throw new NegativeException();
        }
        double res = Math.PI * r * r;
        return res;
    }

    public static int divide(int a, int b) throws ArithmeticException {

        int ans = a / b;
        return ans;
    }

    public static void main(String[] args) {

        double res = 0;
        try {
            // c = divide(6, 0);
            res = area(-1);
            System.out.print("Result is:" + res);
        } catch (Exception err) {
            System.out.println(err);
        }

    }
}

class NegativeException extends Exception {
    @Override
    public String toString() {
        return "The radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Message from override getMessage()";
    }
}