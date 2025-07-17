import java.util.*;
public class First_Digit_Of_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while (n>9) {
            n=n/10;   
        }
        System.out.println("First digit of the number is: " +n);
    }
    
}
