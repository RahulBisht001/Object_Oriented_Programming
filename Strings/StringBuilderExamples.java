public class StringBuilderExamples {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder("Rahul");
        StringBuilder str3 = new StringBuilder(10);

        System.out.println(str1.append("Bisht"));
        System.out.println(str2.append(str1));
        System.out.println(str3.append("Bisht").toString());

        System.out.println(str2.delete(0, 3));
        System.out.println(str2.reverse());

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer("Rahul ");
        StringBuffer s3 = new StringBuffer(5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
