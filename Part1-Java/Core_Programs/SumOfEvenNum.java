import java.util.Scanner;

class SumOfEvenNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                 sum=sum+i;  
            }
        }
        System.out.println("Sum of even numbers in the range is: "+sum);
    } 
} 8iuhg
