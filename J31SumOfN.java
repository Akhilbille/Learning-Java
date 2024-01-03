import java.util.Scanner;
public class J31SumOfN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int sum = 0;
        int range = input.nextInt();
        for (int i =0;i<=range;i++){
            sum += i;

        }
        System.out.println(sum);


    }
    
}
