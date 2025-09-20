//Count of factors of a number
import java.util.Scanner;
   
public class CountOfFactors {
    public static long factors(int num){
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;  
        }
        
    return fact;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        System.out.println("Factorial of a number is "+factors(num));
        
    }
    
}
