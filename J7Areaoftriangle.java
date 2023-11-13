import java.util.*;
public class J7Areaoftriangle {
    public static void main(String[] args){
        float base, height,result;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base value: ");   
        base = input.nextFloat();

        System.out.print("Enter height value: ");   
        height = input.nextFloat();

        result = (0.5f)*(base*height);
        System.out.println(result);
    }
}
