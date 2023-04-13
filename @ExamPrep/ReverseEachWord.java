
public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Hi Rahul";
        String ans = reverseWords(str);
        System.out.println(ans);
    }

    public static String reverseWords(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (j <= str.length()) {
            if (j == str.length() || str.charAt(j) == ' ') {
                // Found the end of a word, reverse it and append to the result
                String word = str.substring(i, j);
                for (int k = word.length() - 1; k >= 0; k--) {
                    sb.append(word.charAt(k));
                }
                // Append the space or end of string after the reversed word
                if (j < str.length()) {
                    sb.append(' ');
                }
                // Move the start of the next word to the position after the space
                i = j + 1;
            }
            j++;
        }
        return sb.toString();
    }
}
