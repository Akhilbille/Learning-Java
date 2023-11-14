import java.util.Scanner;
public class J13StringSC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc.next();
        System.out.println("Enter an email: ");
        String mail = sc.nextLine();
        int index = mail.indexOf("@");
        String begin = mail.substring(0, index);
        String end = mail.substring(index+1, mail.length());
        System.out.println(end.startsWith("gmail"));
    }
}
