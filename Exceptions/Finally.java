public class Finally {

    public static int calculate() {
        try {
            int a = 50;
            int b = 0;
            return a / b;
        } catch (Exception err) {
            System.out.println(err);

        } finally {
            System.out.println("System clean up ....");
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = calculate();
        System.out.println(res);
    }
}
