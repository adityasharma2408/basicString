package you.strings;

public class stringBulder {
    static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i =0;i<26;i++) {
            char ch = ((char) ('a' + i));
            builder.append(ch);
        }
        String a = "one";
        String b = "two";
            System.out.println(builder.toString());
        builder.deleteCharAt(2);
        System.out.println(builder);
        builder.append(a).append(b).toString();
        System.out.println(builder);
        }
}
