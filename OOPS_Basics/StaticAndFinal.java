package OOPS_Basics;

class Student{
    public String name;
    public static String studentClass;
    public static int count=0;

    public Student(){
        count++;
    }

    void studentName(){
        System.out.println(name);
    }

}

public class StaticAndFinal {
    public static void main(String[] args) {

        Student.studentClass="Web Programming";

        System.out.println("Class : "+Student.studentClass);

        System.out.println("Students count : "+Student.count);

        Student student1 = new Student();
        
        student1.name="Indrish";
        student1.studentName();
        System.out.println("Students count : "+Student.count);
        System.out.println(student1.toString());
        // System.out.println("Student1 name : "+student1.name);
    }
}
