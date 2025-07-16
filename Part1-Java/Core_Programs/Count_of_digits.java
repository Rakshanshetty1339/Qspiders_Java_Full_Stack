import java.util.Scanner;

public class Count_of_digits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int count=0;
        // while(n>0){
        //     n=n/10;
        //     count++;
        //     }
        //     System.out.println("The number of digits in the number is "+count);
        for(int i=n;i>0;i=i/10){
            count++;
        }
        System.out.println("The number of digits in the number is "+count);
            }
    }

    

