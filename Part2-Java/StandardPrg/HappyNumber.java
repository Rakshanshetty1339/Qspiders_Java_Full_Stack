public class HappyNumber {
    public static void main(String[] args) {
        int num=19;
        int slow=num;
        int fast=num;
        do{
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        }while(slow!=fast);
        if(slow==1){
            System.out.println(num+" is a happy number");
        }else{
            System.out.println(num+" is not a happy number");
        }
    }
    public static int sumOfSquares(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    
}
