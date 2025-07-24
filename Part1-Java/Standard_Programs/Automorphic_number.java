import java.util.Scanner;

class Automorphic_number{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int square=num*num;
        int CountDight=CountOfDigits(num);
        int expo=expo(10, CountDight);
        if (square%expo==num) {
            System.out.println("yes");
        }
        else{
            System.out.println("not");
        }
        
    }
    public static int CountOfDigits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
       return count;
    }
    public static int expo(int base, int power){
        int expo=1;
        for(int i=1;i<=power;i++){
            expo=expo*base;
        }
        return expo;
    }
}