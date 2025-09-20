package Exceptions;
import java.util.*;
public class Application {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int otp=(int)(Math.random()*9999);
        System.out.println("Your OTP is:"+otp);
        int userotp=s.nextInt();
        if(userotp==otp)
            System.out.println("OTP validated Successfully");
        else{
            try{
                throw new InvalidOTPExceptions("Invalid Otp");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    
}
