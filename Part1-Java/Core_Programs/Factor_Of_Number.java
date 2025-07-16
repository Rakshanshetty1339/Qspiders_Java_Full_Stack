import java.util.Scanner;

class Factor_Of_Number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=s.nextInt();
            System.out.print("Factors of Numbers are:");
        for(int i=1;i<=num;i++){
            if(num%i==0)//We can skip the "{}" when we have only one line in the if block of code
            System.out.print(" "+i+" ");    
            
        }    
    }   
}
