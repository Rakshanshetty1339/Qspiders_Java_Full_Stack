package Object_class;

public class Equals_Example {
	String empname;
	int id;
	String email;


	public Equals_Example(String empname, int id, String email) {
		this.empname=empname;
		this.id=id;
		this.email=email;	
	}
	@Override
	public String toString() {
		return "Empname: "+empname+"\nEmpId: "+email+"\nEmpemail: "+email;
	}
	
	public boolean equals(Object o){
		Equals_Example eq=(Equals_Example)o;
		return this.empname==eq.empname&&this.id==eq.id&&this.email==eq.email;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals_Example eq1=new Equals_Example("Rakshan",101,"rakshanshetty16@gmail.com");
		Equals_Example eq2=new Equals_Example("shetty",102,"shetty@gmail.com");
		System.out.println("Employee1 Details");
		System.out.println(eq1);
		System.out.println("");
		System.out.println("Employee2 Details");
		System.out.println(eq2);
		Equals_Example eq3=eq1;
		System.out.println("");
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));
		
		
		
		

}
}