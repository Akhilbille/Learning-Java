import java.util.Scanner;
public class J32Factorial {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        int fact = 1;
        System.out.print("Enter a number : ");
        for (int i = input.nextInt();i>=1;i--){
            fact *=i;


        }
        System.out.println(fact);

    }
}
