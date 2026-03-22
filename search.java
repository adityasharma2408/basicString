package you.strings;

public class search {
    public static void main(String[] args){
        String name = "hello";
        char search = 'm';
        System.out.println(Search(name,search));
    }
    static boolean Search(String str,char target){
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)==target){
                    return true;
                }
            }
            return false;
    }
}
