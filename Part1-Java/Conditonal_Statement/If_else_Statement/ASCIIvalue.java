import java.util.Scanner;
//Program to check whether ASCII valueof a character is even or odd....
public class ASCIIvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("ASCII vlaue of the Character is= "+ascii);
        if(ascii%2==0){
            System.out.println("ASCII value of character is even");
        }
        else{
            System.out.println("ASCII value of character is odd");
        }
    }

    
}
