import java.util.Scanner;
public class J30Table {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a table : ");
        int table = input.nextInt();
        for (int i = 1;i <=10;i++ ){
            System.out.format("%1$d  *  %2$d    =   %3$d",table,i,table*i );
            System.out.println();
            
        }
    }
}
