import java.util.Scanner;
class Sum_of_N_numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start and end of Range");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++){
            sum=sum+i;
        }
        if(sum%2==0){
            System.out.println("Sum of numbers from "+num1+" to "+num2+" is "+sum+" Even");
        }
        else{
            System.out.println("Sum of numbers from "+num1+" to "+num2+" is "+sum+" Even");
        }
    } 
}
