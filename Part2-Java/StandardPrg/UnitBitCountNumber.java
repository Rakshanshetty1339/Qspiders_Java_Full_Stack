public class UnitBitCountNumber {
    public static void main(String[] args) {
        int num=13;
        int count=0;
        while(num>0){
            int rem=num%2;
            if(rem==1)
            count++;
            num=num/2;
        }
        System.out.println(count);
    }
    
}
