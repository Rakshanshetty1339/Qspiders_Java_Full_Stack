package Exceptions;

import java.util.*;
public class TockenNumbervalidation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         for (int i = 1; i <= 10; i++) {
            System.out.println("Now Serving Token Number: " + i);

            System.out.print("Enter your Token Number: ");
            int inputToken = s.nextInt();

                if (inputToken == i) {
                    System.out.println(" Token " + inputToken + ": Please Consult a Doctor\n");
                } 
                else {
                    try{
                    throw new InvalidTokenException(" Token " + inputToken + " not matched. Current Token is " + i);
                     }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    }
}
