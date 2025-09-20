//Automorphic Number: A number is called an Automorphic number if and only if the square of the number ends with the same digits as the number itself.
 //Eg: 5: 5*5=25 (Automorphic number), 6: 6*6=36 (Automorphic number), 25: 25*25=625 (Automorphic number)
public class AutomorphicNumorNot {
    public static void main(String[] args) {
        int num=76;
        int sq=num*num;
        String str1=String.valueOf(num);
        String str2=String.valueOf(sq);
        if(str2.endsWith(str1)){
            System.out.println(num+" is an Automorphic number");
        }
        else{
            System.out.println(num+" is not an Automorphic number");
        }
        
    }
    
}
