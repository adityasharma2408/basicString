package you.strings;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class stringPractice {
    public static void main(String[] args){
//        String a = "Aditya";
////        String b = "Aditya";
////        System.out.println(a==b);
//        float a = 1234.5567f;
////        System.out.printf("Formatted number is %.2f",a);
////        System.out.printf("Pie: %.3f", Math.PI);
////        System.out.printf("\nHello my name %s %s","Aditya","Sharma");
//        System.out.println('a' + 'b');
//        System.out.println("a" + "b");
//        System.out.println((char)('a' + 3));
//        System.out.println("a" + 1);
//        System.out.println("a" + new ArrayList<>(1));
    String s = "";
    for (int i=26;i>0;i--){
        char ch = ((char)('a'+i));
        s+=ch;
        System.out.println(s );
    }
//        System.out.println(" "+s + " ");
    }
}
