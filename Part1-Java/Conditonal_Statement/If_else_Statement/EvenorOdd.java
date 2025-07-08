//Program to check whether a given number is even or odd...

import java.util.Scanner;
class EvenorOdd
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		if(num%2==0){
			System.out.println(num+"is Even number");
		}
		else{
			System.out.println(num+" is Odd number");
		}
	}
}
		