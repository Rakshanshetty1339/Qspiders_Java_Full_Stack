package Exceptions;
import java.util.*;
public class CheckAadharnumber {
    public static long addharDigits(long adhr){
        int count=0;
        while (adhr>0) {
            long digit=adhr%10;
        count++;
        adhr=adhr/10;    
        } 
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the addhar number");
        long adhr=s.nextLong();
        if(addharDigits(adhr)==12){
            System.out.println("Valid Aadhar Number");
        }
        else
            try{
                throw new InvalidAadharException("Invalid Aadhar Number");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            }
        
        
    }

