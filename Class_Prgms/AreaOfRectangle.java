package Class_Prgms;

import java.util.Scanner;

class Area {
    int l;
    int b;

    Area(int l, int b) {
        this.l = l;
        this.b = b;
    }

    int returnArea() {
        return l * b;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--- Area Of Rectangle ---");
        System.out.print("Enter Length : ");
        int len = scan.nextInt();
        System.out.print("Enter Breadth : ");
        int br = scan.nextInt();
        Area ob1 = new Area(len, br);
        System.out.print("\nArea of Rectangle : ");
        System.out.println(ob1.returnArea());
        scan.close();   
    }
}
