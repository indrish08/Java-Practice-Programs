public class print_1To100_withoutLoop {
    public static void main(String[] args) {
        int n=15;
        printUptoN(n);
    }
    static void printUptoN(int n){
        if(n>0){
            printUptoN(n-1);
            System.out.println(n);
        }
    }
}
