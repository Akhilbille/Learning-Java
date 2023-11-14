public class J15RegularSC3 {
    public static void main(String[] args) {
        String str = "a@##%$dffdsfa1236";
        System.out.println(str.replaceAll("[^a-zA-z0-9]", ""));       
        String str1 = "dsfasd f  sdfas   asdfsfasdf  ";
        System.out.println(str1.replaceAll("\\s+", " ").trim());       
        String str2 = "dsfasd f  sdfas   asdfsfasdf  ";
        str2 = (str2.replaceAll("\\s+", " ").trim());   
        String[] words = (str2.split(" "));    
        System.out.println(words.length);
    }
}
