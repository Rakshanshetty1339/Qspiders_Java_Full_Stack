import java.util.Scanner;

class Product_Of_Numbers_In_Range {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int num1=s.nextInt();
        int num2=s.nextInt();
        long product=1;
        for(int i=num1;i<=num2;i++){
            product=product*i;
        }
        System.out.println("Product of Numbers from "+num1+" to "+num2+" is "+product);  
    }
}