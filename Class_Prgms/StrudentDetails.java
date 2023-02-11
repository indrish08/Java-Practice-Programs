package Class_Prgms;

class Student{
    int roll_no;
    String name;
    Student(int n, String s){
        roll_no=n;
        name=s;
    }
    void getDetails(){
        System.out.println("Roll No : "+roll_no);
        System.out.println("Name    : "+name);
    }
}

public class StrudentDetails {
    public static void main(String[] args) {
        Student s1=new Student(2, "John");
        s1.getDetails();
    }
}
