package Class_Prgms;

class Complex {
    int r, i;

    Complex(){
    }

    Complex(int r, int i) {
        this.r = r;
        this.i = i;
    }

    Complex sumOfComplexNumbers(Complex ob) {
        Complex obj = new Complex();
        obj.r = this.r + ob.r;
        obj.i = this.i + ob.i;
        return obj;
    }

    Complex differenceOfComplexNumbers(Complex ob) {
        Complex obj = new Complex();
        obj.r = this.r - ob.r;
        obj.i = this.i - ob.i;
        return obj;
    }

    Complex productOfComplexNumbers(Complex ob) {
        Complex obj = new Complex();
        obj.r = this.r * ob.r;
        obj.i = this.i * ob.i;
        return obj;
    }

    @Override
    public String toString() {
        return this.r + " + " + this.i + "i";
    }
}

public class ComplexNumbers {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3, 4);
        System.out.println(c1.sumOfComplexNumbers(c2)); // 5 + 7i
        System.out.println(c1.differenceOfComplexNumbers(c2)); // -1 + -1i
        System.out.println(c1.productOfComplexNumbers(c2)); // 6 + 12i
    }
}
