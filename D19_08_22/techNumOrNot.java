package D19_08_22;

public class techNumOrNot {
    public static void main(String[] args) {
        int n=1312;
        int h=1, l=String.valueOf(n).length()/2;
        while(l!=0){
            h*=10;
            l--;
        }
        int a=n/h, b=n%h;
        if((a+b)*(a+b)==n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
