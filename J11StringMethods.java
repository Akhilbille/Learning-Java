public class J11StringMethods {
    public static void main(String[] args){
        String strSpaces = "  Welcome  ";
        String str = "Welcome to Java Programming";
        String  website = "www.abc.org";
        String s= "Happy";
        String s1 = new String("happy");

        // Methods
        int stringLength = str.length();
        String stringLowerCase = str.toLowerCase();
        String stringUpperCase = str.toUpperCase();
        String stringTrim = strSpaces.trim();
        String subStringTillEnd = str.substring(3);
        String subString = str.substring(3,6);
        String newString = str.replace('c','k');
        boolean isWebsite = website.startsWith("www");
        boolean isOrgWeb = website.endsWith("org");
        char ch = website.charAt(0);
        int index = website.indexOf("website");
        int res = s.compareTo(s1);
        String out = str.valueOf(123);



        System.out.println(stringLength);
        System.out.println(stringLowerCase);
        System.out.println(stringUpperCase);
        System.out.println(stringTrim);
        System.out.println(subStringTillEnd);
        System.out.println(subString);
        System.out.println(newString);
        System.out.println(isWebsite);
        System.out.println(isOrgWeb);
        System.out.println("Character at 0"+ ch);
        System.out.println("Index of website"+ index);
        System.out.println("Comparison of s1 and s : "+ res);
        System.out.println( out.indexOf("2"));
        



    }
}
