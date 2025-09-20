import java.util.Scanner;

public class PalindromeNUmber {

    public static void isPalindrome(int result, int num){
        if(result==num)
            System.out.println(" is palindrome");
        else
        System.out.println(" Not a plaindrome");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int result=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            result=result*10+digit;
            temp=temp/10;
        }
       isPalindrome(result, num);

        
    }
    
}
