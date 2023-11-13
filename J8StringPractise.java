public class J8StringPractise {
    public static void main(String[] args) {
        String str1 = "Java Program";
        String str2 = "Java Program";
        System.out.println(str1);
        String str3 = new String("Java Program");
        System.out.println(str2 == str1);
        System.out.println(str3 == str1);
    }
    
}
