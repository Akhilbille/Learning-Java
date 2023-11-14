import java.util.Scanner;
public class J16PositiveNegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num > 0){
            System.out.format("%1$d is Positive", num);
        }
        else if(num < 0){
            System.out.format("%1$d is Negative", num);
        }
        else
        System.out.format("%1$d is Zero", num);
    }
    
}
