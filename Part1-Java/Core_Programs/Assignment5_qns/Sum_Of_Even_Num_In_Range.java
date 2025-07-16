package Assignment5_qns;
import java.util.Scanner;

class Sum_Of_Even_Num_In_Range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                 sum=sum+i;  
            }
        }
        System.out.println("Sum of even numbers in the range is: "+sum);
    } 
} 
