import java.util.Scanner;
public class J37Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num=  input.nextInt();
        int temp = num;
        
        int count = String.valueOf(num).length();
        // System.out.println(count);
        int armstrong = 0;
        while (num>0){
            int digit = num%10;
             armstrong += (int) Math.pow(digit, 4);
             num /= 10;
        }
        
        
        if (temp == armstrong){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an armstrong");
        }

    }
}
