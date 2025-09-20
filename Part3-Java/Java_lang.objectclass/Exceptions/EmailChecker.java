package Exceptions;
import java.util.*;
public class EmailChecker {

    public static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the emailID");
        String email=s.next();


        if(isValidEmail(email))
            System.out.println("Valid Email Address");
        else 
            try {
                throw new InvalidEmailException(" Invalid Email Address");
            }catch (Exception e) {
                System.out.println(e.getMessage());
        }
        
    }
    
}
