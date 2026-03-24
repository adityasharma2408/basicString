package you.strings;

public class palendrome {
    public static void main(String[] args) {
        String s = "abcdcbba";
        System.out.println(isPalendrome(s));
    }

    static boolean isPalendrome(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            int start = s.charAt(i);
            int end = s.charAt(s.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}