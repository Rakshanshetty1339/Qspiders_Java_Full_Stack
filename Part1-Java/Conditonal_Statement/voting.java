//Program to check whether a person is eligible for voting...

import java.util.Scanner;
class Voting
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age of the person:");
		int age=s.nextInt();
		if(age>18){
			System.out.println("Eligible to vote");
		}
		else{
			System.out.println("Not eligible to vote");
		}
	}
}
		