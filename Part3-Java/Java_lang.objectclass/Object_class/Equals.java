package Object_class;

public class Equals {
	int id;

	public Equals(int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public String ToString() {
		return "id is"+ id;	
	}
	
	public boolean equals(Object o) {
		Equals eq=(Equals)o;
		return this.id==eq.id;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals eq1=new Equals(1);
		Equals eq2=new Equals(1);
		Equals eq3=eq1;
		System.out.println(eq1.equals(eq2));
		System.out.println(eq1.equals(eq3));

	}

}
