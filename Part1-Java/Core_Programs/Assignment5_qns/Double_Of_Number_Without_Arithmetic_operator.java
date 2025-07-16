package Assignment5_qns;

import java.util.Scanner;

class Double_Of_Number_Without_Arithmetic_operator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        // int a=num << 1;
        int b=num;
        while(b!=0){
            num++;
            b--;
        }
        System.out.println(num);    
    }
    
}
