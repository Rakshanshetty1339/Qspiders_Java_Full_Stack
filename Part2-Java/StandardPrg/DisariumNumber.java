public class DisariumNumber {
    public static void main(String[] args) {
        int num=175;
        int sum=0;
        int temp=num;
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        num=temp;
        while(num>0){
            int rem=num%10;
            sum=sum+(int)Math.pow(rem, count);
            count--;
            num=num/10;
        }
        if(sum==temp){
            System.out.println(temp+" is a Disarium number");
        }else{
            System.out.println(temp+" is not a Disarium number");
        }
    }
    
}
