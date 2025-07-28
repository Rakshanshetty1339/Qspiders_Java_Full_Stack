//Create a 3 Class and in all the 3 class declare 1 staic variable and static method respectivly
//perform a reinitalization  for the variable  which is present in 2nd class and invoke  all the members inside a main method.

class  FirstClass{
	static int a1=10;
	public static void display(){
		System.out.println("in FirstClass");
		System.out.println(a1);
		
	}
	}

class SecondClass{
	static int a2=20;
	public static void display(){
		System.out.println("in SecondClass");
		System.out.println(a2);
	}
	}

class ThirdClass{
	static int a3=30;
	public static void display(){
		System.out.println("in ThirdClass");
		System.out.println(a3);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("In Main");
		FirstClass.display();
		SecondClass.display();
		ThirdClass.display();
		System.out.println("After reinitalization of 2nd class");
		SecondClass.a2=100;
		SecondClass.display();
		
	}
}

