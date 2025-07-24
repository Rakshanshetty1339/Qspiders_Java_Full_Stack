import java.util.Scanner;

public class Range_Of_Num_Is_Strong_Or_Not {

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
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range ");
        int start=s.nextInt();
        int end=s.nextInt();
        for(int i=start;i<=end;i++){
            if(sumOfDigits(i)==i){
                
            }
            

            

        }

    }
    
}
}
