import java.util.Scanner;
public class J17MaxOfThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int num1 = input.nextInt();
        System.out.print("Enter B: ");
        int num2 = input.nextInt();
        System.out.print("Enter C: ");
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Big: "+ num1);
        }
        else if(num2 > num3){
            System.out.println("Big: "+ num2);
        }
        else{
            System.out.println("Big: "+num3);
        }
    }
}
