
public class J12RegularExpressions {
    public static void main(String[] args){
        String str = "@";
        String expression = "[^a-zA-z0-9\\s]";
        System.out.println(str.matches(expression));    }
}
    