import java.util.Scanner;

class DoubleOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        // int a=num << 1;
        int b=num;
        while(b!=0){
            num++;
            b--;
        }
        System.out.println(num);    
    }
    
}
