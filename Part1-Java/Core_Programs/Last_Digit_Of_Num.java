import java.util.Scanner;
public class Last_Digit_Of_Num {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int last_digit = n % 10;
        System.out.println("Last digit of the number is: "+last_digit);   
    }
}
