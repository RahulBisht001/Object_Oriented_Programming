public class Reverse {
    public static void main(String[] args) {

        String str = "Hi Rahul";
        String ans = reverseString(str);
        System.out.println(ans);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
