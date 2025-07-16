package Assignment6_qns;
import java.util.Scanner;

class Factors_Of_Sum_Of_Num_in_Range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int start=s.nextInt();
        int end=s.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.print("Factorial of sum of range is: ");
        for(int i=1;i<=sum;i++){
            if(sum%i==0){
                System.out.print(" "+i+"");
            }
        }

        
    }

    
}
