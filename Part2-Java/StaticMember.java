// In a Single class declare 3 static variable and two user defined method.
// All the three variable should be invoked in both the methods.
// All the method should be invoked in main.


class  StaticMember{

	static int a1=10;
	static int a2=20;
	static int a3=30;
	public static void display()
	{
		System.out.println("In Display");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
	public static void flow(){
		System.out.println("In flow");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}
	
		
	public static void main(String[] args) 
	{
		System.out.println("in main!");
		display();
		flow();
	}
}
