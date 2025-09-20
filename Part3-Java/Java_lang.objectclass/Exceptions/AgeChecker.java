package Exceptions;
import java.util.*;
public class AgeChecker {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=s.nextInt();
        if(age>18 && age<=100)
            System.out.println("Congragulations.... you are not adult anymore");
        else
            try{
                throw new InvalidAgeException("you are adult");
            }catch(Exception e){
                 System.out.println(e.getMessage());

            }
    }
    

    
}
