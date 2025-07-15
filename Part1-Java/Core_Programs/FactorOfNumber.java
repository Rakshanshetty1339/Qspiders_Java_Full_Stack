import java.util.Scanner;

class FactorOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=s.nextInt();
            System.out.print("Factors of Numbers are:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
            System.out.print(" "+i+" ");    
            }
        }    
    }   
}
