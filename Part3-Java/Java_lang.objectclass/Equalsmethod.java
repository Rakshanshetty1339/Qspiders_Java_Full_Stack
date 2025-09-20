public class Equalsmethod {
    String empname;
    int empid;
    String empemail;

    Equalsmethod(String empname,int empid,String empemail){
        this.empname=empname;
        this.empid=empid;
        this.empemail=empemail;
    }

    @Override
    public String toString(){
        return "Employee Name: "+empname+"\nEmployee id: "+empid+"\nEmployee email: "+empemail+"\n";
    }

     @Override
     public boolean equals(Object o){
        Equalsmethod eq=(Equalsmethod) o; // downcasting
        return this.empid==eq.empid && this.empemail==eq.empemail;


     }

    public static void main(String[] args) {
        Equalsmethod eq1=new Equalsmethod("Rakshan",1,"rakshan@gmail.com");
        System.out.println(eq1);

        Equalsmethod eq2=new Equalsmethod("Shiva",2,"shiva@gmail.com");
        System.out.println(eq2);

        Equalsmethod eq3=new Equalsmethod("Ganesh",1,"rakshan@gmail.com");
        System.out.println(eq3);

        System.out.println(eq1.equals(eq2));
        System.out.println(eq1.equals(eq3));
        

    }
    }
    
    
