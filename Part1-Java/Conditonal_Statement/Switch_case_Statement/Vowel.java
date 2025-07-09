import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=s.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':System.out.println(ch+" is vowel");
                break;
            default:System.out.println(ch+" is consonent");
                break;
        }
    }
        else{
            System.out.println("Entered Character is not a Alphabet");
        
        }
    }
    
}
