public class BinaryToDecimalNumber {
    public static void main(String[] args) {
        int num=1010;
        int decimal=0;
        int power=0;
        while(num>0){
            int rem=num%10;
            decimal=decimal+(rem*(int)Math.pow(2, power));
            power++;
            num=num/10;
        }
        System.out.println(decimal);
    }
    
}
