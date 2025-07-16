package Assignment5_qns;

import java.util.Scanner;

class Halving_Of_Number  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int num=s.nextInt();
        int a=num>>1;
        System.out.println(a);
    }
}
