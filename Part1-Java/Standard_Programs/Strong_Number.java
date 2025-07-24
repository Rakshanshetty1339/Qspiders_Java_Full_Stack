import java.util.Scanner;
public class Strong_Number {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++)
            fact=fact*i;
        return fact;

    }
    public static int sumOfDigits(int num){
            int sum = 0;
            while (num >0) {
                int digit=num%10;
                sum=sum+factorial(digit);
                num = num / 10;  
        }
            return  sum;
}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=s.nextInt();
        if (sumOfDigits(num)==num) {
            System.out.println(num+" is a Strong Number");    
        }
        else{
            System.out.println(num+" is not a Strong Number");
        }
    }
}