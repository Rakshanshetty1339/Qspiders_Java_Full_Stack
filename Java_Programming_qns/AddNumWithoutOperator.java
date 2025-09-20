//1. WAPT add two numbers without using + or+= operator
import java.util.Scanner;
public class AddNumWithoutOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=s.nextInt();
        int num2=s.nextInt();
        while (num2>0){
            num1++;
            num2--;
        }
        System.out.println(num1);
            
        }
       
    }

