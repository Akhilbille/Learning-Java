import java.util.Scanner;
public class J25SwitchCaseSC3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a website name : ");
        String websiteName = input.nextLine();
        String webType = websiteName.substring(websiteName.lastIndexOf('.')+1,websiteName.length());
        switch (webType){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organization");
                break;
            case "gov":
                System.out.println("Government");
                break;
            default:
                System.out.println("Invalid");
                break;
                
        }
    }
}
