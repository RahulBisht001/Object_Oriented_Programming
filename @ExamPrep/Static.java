public class Static {
    public static void executeBeforeMain() {
        // code to be executed before main method
        System.out.println("Inside executeBeforeMain");
    }

    static {
        System.out.println("Inside static");
    }

    public static void main(String[] args) {
        // code
        Static.executeBeforeMain();
        System.out.println("Inside Main");

    }
}