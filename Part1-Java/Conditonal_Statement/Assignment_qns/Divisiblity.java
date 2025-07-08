import java.util.Scanner;
// Program to check whether  a number is divisible by 6 or not
public class Divisiblity {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%6==0){
            System.out.println("Number is divisible by 6");
        }
        else {
            System.out.println("Number is not divisible by 6");
        }
    }
    
}
