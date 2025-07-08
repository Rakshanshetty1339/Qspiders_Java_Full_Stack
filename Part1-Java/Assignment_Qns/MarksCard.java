/* - write a program to print the students markscard as instructed below
   - accept the student individual subject marks from the user
   - print the grade along with the subject marks
     95-100--A+
     90-94--A
     80-89--B+
     70-79--B
     45-69--C
     35-44--P
     0-34--F
   - print the total marks scored by the student
   - print the agrregate scored by the student
   - finally print the student result based on the aggreagte
     80>=&&<=100--Distinction
     75>=&&<=80--First classs with distinction
     65>=&&<=75--First class
     35>=&&<=--secound class
     0>=&&<35--Result withheld*/

     import java.util.Scanner;
    class MarksCard{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("--------");
        System.out.print("Enter the marks of the student:");
        System.out.println("--------");
        System.out.print("Maths: ");
        int maths=s.nextInt();
        System.out.print("English: ");
        int english=s.nextInt();
        System.out.print("Social: ");
        int social=s.nextInt();
        System.out.print("Hindi: ");
        int hindi=s.nextInt();
        System.out.print("Science: ");
        int science=s.nextInt();
        System.out.print("Kannada: ");
        int kannada=s.nextInt();
        int total_marks=(maths+english+social+hindi+science+kannada);

        System.out.println("------------RESULT-----------");
        System.out.println("Maths: "+maths);
        System.out.println("English: "+english);
        System.out.println("Social: "+social);
        System.out.println("Hindi: "+hindi);
        System.out.println("Science: "+science);
        System.out.println("Kannada: "+kannada);
        System.out.println("-------------------");
        System.out.println("Total Marks= "+total_marks);
        float agrregate=(float)total_marks/6;

        System.out.println("Percentage= "+agrregate+"%");
        if(agrregate>=80 && agrregate<=100){
            System.out.println("Distinction");
        }
        else if(agrregate>=75 &&agrregate<=80){
            System.out.println("First class with distinction");

        }
        else if(agrregate>=65&&agrregate<=75){
            System.out.println("First class");

        }
        else if(agrregate>=35 &&agrregate<=65){
            System.out.println("Secound class");

        }
        else if(agrregate>=0 &&agrregate<=35){
            System.out.println("Result withheld");

        }

    }



    
}
