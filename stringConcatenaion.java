package you.strings;

public class stringConcatenaion {
    public static void main(String[] args){
//        StringBuilder a = new StringBuilder();
//        String b = "Hello";
//        String c ="World";
//        a.append(b).append(c).toString();
//        System.out.println(a);
        String []strings = new String[]{ "one" , "two" , "Three" , "four"};
//        StringBuilder d = new StringBuilder();
        String result = "";
        for (String st: strings) {
            result = new StringBuilder(result).append(st).toString();
            System.out.println(result);
        }
    }
}
