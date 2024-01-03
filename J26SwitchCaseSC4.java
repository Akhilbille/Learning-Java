import java.util.Scanner;
public class J26SwitchCaseSC4 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Calculator using Console: ");
         System.out.println("Addition : add");
         System.out.println("Subtraction : sub");
         System.out.println("Multiplication : mul");
         System.out.println("Division : div");
         System.out.println("Modulo Division : mdiv");
         
         System.out.print("Please enter your option (eg: add,mul) : ");
         String option = input.nextLine();
         System.out.print("Enter a number : ");
         int num1 = input.nextInt();
         System.out.print("Enter a number : ");
         int num2 = input.nextInt();



         switch (option){
            case "add":
            System.out.format("Addition of %1$d and %2$d : %3$d", num1,num2,num1+num2 );
            break;
            case "sub":
            System.out.format("Addition of %1$d and %2$d : %3$d", num1,num2,num1-num2 );
            break;
            case "mul":
            System.out.format("Addition of %1$d and %2$d : %3$f", num1,num2,num1* (float)num2 );
            break;
            case "div":
            System.out.format("Addition of %1$d and %2$d : %3$d", num1,num2,num1/num2 );
            break;
            case "mdiv":
            System.out.format("Addition of %1$d and %2$d : %3$d", num1,num2,num1%num2 );
            break;
            default:
            System.out.println("Please enter only mentioned options");

         }
         
        
    }
}
