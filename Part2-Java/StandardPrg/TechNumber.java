import java.util.Scanner;


public class TechNumber {

    public static int divisor(int num, int count){
        int divisor=1;
        for(int i=1;i<=count/2;i++){
            divisor=divisor*10;
        }
        return divisor;
    }

    public static int countDigit(int num){
        int temp=num;
        int count=0;
        while(temp>0){
            count+=1;
            temp=temp/10;
        }
        return count;
    }

    public static boolean isTechNumber(int num,int divisor){
        int leftnum=num/divisor;
        int rightnum=num%divisor;
        
        int sum=0;
        sum=leftnum+rightnum;
        int product=sum*sum;

        return num==product;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int count=countDigit(num);
        if(count%2!=0){
            System.out.println("Not a Tech number");
           return;
        }
        int divisor=divisor(num, count);

        if(isTechNumber(num, divisor)){
            System.out.println("Is a tech number");
        }
        else{
            System.out.println("Is not a tech number");
        }
        
        
    }
    
}
