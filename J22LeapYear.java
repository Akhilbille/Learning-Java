import java.util.Scanner;
public class J22LeapYear {
    public static void main(String[] args){
        System.out.print("Enter year : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year%4==0 && year%4==0 && year%100!=0)
            System.out.format("%1$d Leap Year",year);
        else
            System.out.println("Not a leap year");

    }
}
