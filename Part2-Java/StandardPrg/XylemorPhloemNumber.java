//XylemorPhloemNumber: A number which is both Xylem and Phloem is called XylemorPhloem number. 
//A number is called Xylem if the sum of the digits at odd places and the sum of the digits at even places are equal. 
//A number is called Phloem if the sum of the digits at odd places and the sum of the digits at even places differ by 1.
//Eg: 123321 is a Xylem number (1+3+2=3+2+1)
//Eg: 123421 is a Phloem number (1+3+2=4+2+1=1)


public class XylemorPhloemNumber {
    public static void main(String[] args) {
        int num=123321;
        int sumodd=0,sumeven=0;
        int count=1;
        while(num>0){
            int rem=num%10;
            if(count%2==0){
                sumeven=sumeven+rem;
            }else{
                sumodd=sumodd+rem;
            }
            num=num/10;
            count++;
        }
        if(sumodd==sumeven){
            System.out.println("Xylem number");
        }else if(Math.abs(sumodd-sumeven)==1){
            System.out.println("Phloem number");
        }else{
            System.out.println("Neither Xylem nor Phloem number");
        }

        
    }
    
    
}
