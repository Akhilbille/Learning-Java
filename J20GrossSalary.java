import java.util.Scanner;
public class J20GrossSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int basicSalary = sc.nextInt();
        if (basicSalary <= 10000 && basicSalary > 0){
            float grossSalary = basicSalary+basicSalary*0.2f+basicSalary*0.8f;
            System.out.println(grossSalary);
        }
        
        else if (basicSalary <= 20000 && basicSalary>10000){
            float grossSalary = basicSalary+basicSalary*0.25f+basicSalary*0.9f;
            System.out.println(grossSalary);
        }
        else if (basicSalary > 20000){
            float grossSalary = basicSalary+basicSalary*0.3f+basicSalary*0.95f;
            System.out.println(grossSalary);
        }
        else{
            System.out.println("Please enter valid basic salary greater than zero");
        }
    }
}
