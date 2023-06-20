import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {


        String str = "COLLAGE";

        char[] arr = new char[26];
        for (char ch : str.toCharArray()) {
            arr[ch - 'A']++;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; ++i) {
            while (arr[i]-- > 0) {
                res.append((char) ('A' + i));
                // console()
            }
        }
        System.out.println(res.toString());
    }
}
