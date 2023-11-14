import java.util.Scanner;
public class J14RegularSC2 {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Binary number :  ");
      String bin = sc.nextLine();
      System.out.println("Is  it Binary : " + bin.matches("[01]+") );

      System.out.print("Enter a Hex number :  ");
      String hex = sc.nextLine();
      System.out.println("Is  it Hexa : " + hex.matches("[0-9a-f]*") );
      
      
      System.out.print("Enter a Date (dd/mm/yyyy) :  ");
      String date = sc.nextLine();
      System.out.println("Is  it Hexa : " + date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}") );
      
    
   }
    
}
