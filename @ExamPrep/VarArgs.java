public class VarArgs {

    static void display(String... values) {

        StringBuilder ans = new StringBuilder();
        for (String s : values) {
            ans.append(s + " ");
        }
        System.out.println("display method invoked ");
        System.out.println(ans);
    }

    public static void main(String args[]) {
        display();// zero argument
        display("my", "name", "is", "varargs");// four arguments
    }
}