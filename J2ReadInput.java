import java.util.*;
public class J2ReadInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Integer as Input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Entered num is: " + num);

        // Float as Input
        System.out.print("Enter a float number: ");
        float fnum = sc.nextFloat();
        System.out.println("Enter float number is "+ fnum);
        
        // Decimal number
        
        System.out.print("Enter a float number: ");
        double dnum = sc.nextDouble();
        System.out.println("Enter float number is "+ dnum);
        
        //String as Input
        
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your full name: ");
        sc.nextLine(); //Adding extra to handle new line missed by next()
/*         That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter," and so the call to Scanner.nextLine returns after reading that newline.

You will encounter the similar behaviour when you use Scanner.nextLine after Scanner.next() or any Scanner.nextFoo method (except nextLine itself).*/ 
        String fname = sc.nextLine();
        System.out.println("Welcome Mr. "+ name);
        System.out.println("Welcome Mr."+ fname);

        
    }    
}
