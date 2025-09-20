//2. WAPTP sum of the numbers between m to n 

import java.util.Scanner;

public class SumOFNumInRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range m and n");
        int m=s.nextInt();
        int n=s.nextInt();
        int result=0;
        for(int i=m;i<=n;i++){
            result=result+i;
        }
        System.out.println("Sum of Range is "+result);
    }
    
}
