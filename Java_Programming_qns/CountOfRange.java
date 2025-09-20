//4. WAPT count the numbers from m to n

import java.util.Scanner;

public class CountOfRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range m and n");
        int m=s.nextInt();
        int n=s.nextInt();
        int count=0;
        for(int i=m;i<=n;i++){
            count++;
        }
        System.out.println("Count of Range is "+count);
}
    
}
