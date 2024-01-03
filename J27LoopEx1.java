import java.util.Scanner;
public class J27LoopEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int start = 0;
        while (start < range){
            System.out.println(Math.pow(start, 2));
            start++;
        }

    }
}
