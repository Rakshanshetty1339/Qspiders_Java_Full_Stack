public class Student {
    String name;
    double phonenumber;
    public Student(String name,double phonenumber){
        this.name=name;
        this.phonenumber=phonenumber;
    }
    @Override
    public String toString(){
        return "Student Name: "+name+"\nPhone Number: "+phonenumber+"\n";
    }
    public static void main(String[] args) {
        Student s=new Student("rakshan",74838259);
        System.out.println(s);
    }
    
}
