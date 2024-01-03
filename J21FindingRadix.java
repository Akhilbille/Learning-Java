import java.util.Scanner;
public class J21FindingRadix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its Radix: ");
        String num = sc.nextLine();
        if (num.matches("[01]+")){
            System.out.println("Binary "+ num);
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal "+ num);
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Decimal Number "+ num);
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexa Decimal "+ num);
        }
        else{
            System.out.println("Enter a valid number");
        }
    }
}
