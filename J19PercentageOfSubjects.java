import java.util.Scanner;
public class J19PercentageOfSubjects {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Maths Marks: ");
        int mathsMarks = input.nextInt();
        System.out.println("Enter Physics Marks: ");
        int phyMarks = input.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        int chesistryMarks = input.nextInt();
        System.out.println("Enter Biology Marks: ");
        int bioMarks = input.nextInt();
        System.out.println("Enter Computer Marks: ");
        int compMarks = input.nextInt();
        int marksSum = mathsMarks+phyMarks+chesistryMarks+bioMarks+compMarks;
        float percentage = ((float)marksSum/500)*100;
        System.out.println(percentage);
        if (percentage>=0 && percentage<=100){
            if (percentage >=90){
                System.out.println("A Grade");
            }
            else if(percentage>=80 && percentage<90){
                System.out.println("B Grade");
            }
            else if(percentage>40 && percentage<80){
                System.out.println("C Grade");
            }
            else{
                System.out.println("You are Outside standing Standing Student");
            }

        }

        else{
            System.out.println("Enter percentage between o and 100");
        }
        
    }
    
}
