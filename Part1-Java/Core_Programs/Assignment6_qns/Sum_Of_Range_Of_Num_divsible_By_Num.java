package Assignment6_qns;

import java.util.Scanner;
public class Sum_Of_Range_Of_Num_divsible_By_Num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of the range");
        int start=s.nextInt();
        int end=s.nextInt();
        int sum=0;
        System.out.println("Enter the divisor or number to divide a number");
        int num=s.nextInt();
        for(int i=start;i<=end;i++){
            if(i%num==0){
                System.out.print(" "+i+" ");
                sum=sum+i;
            }
           
        }
        System.out.println("");
        System.out.println("Sum of Range is "+sum);

    }
    
}
