import java.util.Scanner;

public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range");
        int start=s.nextInt();
        int end=s.nextInt();
        for(int i=start;i<=end;i++){
            int temp=i;
            int rev=0;
            while (temp>0) {
                int digit=temp%10;
                rev=rev*10+digit;
                temp=temp/10;
            }

            if(rev==i)
            System.out.println(i+" is palindrome");

            else
            System.out.println(i+" is not palindrome");
        }
        
    }
}
