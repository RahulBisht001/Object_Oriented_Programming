import java.util.ArrayList;

public class Permutations {
    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {

        permutation("", "ABC");
        // Collections.sort(ans);
        System.out.println(ans.toString());

    }

    public static void permutation(String p, String up) {
        if (up.isEmpty()) {
            ans.add(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            // System.out.print(f + " ");
            String s = p.substring(i, p.length());
            // System.out.print(s + " ");
            permutation(f + ch + s, up.substring(1));
        }
    }
}