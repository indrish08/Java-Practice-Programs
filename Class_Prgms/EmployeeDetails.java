package Class_Prgms;

class Employee {
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "    " + yearOfJoining + "     " + address;

    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, "64C-WallsStreet");
        Employee e2 = new Employee("Sam", 2000, "68D-WallsStreet");
        Employee e3 = new Employee("John", 1999, "26B-WallsStreet");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
