// package Strings;

public class SubString {
    public static void main(String[] args) {

        String name = "Sachin_Tendulkar";
        System.out.println(name.substring(6));
        System.out.println(name.substring(0, 6));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.trim());

        System.out.println(name.startsWith("Sac"));
        System.out.println(name.endsWith("kAr"));

        System.out.println(name.contains("_Ten"));
        System.out.println(name.indexOf("hin"));
    }
}
