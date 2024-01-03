public class J34NoOfDigits {
    public static void main(String[] args){
        int num = 123;
        while (num > 0){
            int rem = num % 10;
            num /= 10;
            System.out.println(rem);
        }

    }
}
