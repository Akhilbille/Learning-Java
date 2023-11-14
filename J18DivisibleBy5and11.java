import java.util.Scanner;
public class J18DivisibleBy5and11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println("Divisible by 5 and 11");
        }
        else
        System.out.println("Not Divisible by 5 and 11");
    }
}
