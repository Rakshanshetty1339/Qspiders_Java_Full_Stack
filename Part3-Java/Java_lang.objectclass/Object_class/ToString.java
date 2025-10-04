package Object_class;

public class ToString {
	String name;
	public ToString( String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToString str= new ToString("rakshan");
		System.out.println(str);
			
		}

	}