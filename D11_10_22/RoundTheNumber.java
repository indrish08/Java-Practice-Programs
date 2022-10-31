package D11_10_22;

public class RoundTheNumber {
    public static void main(String[] args) {
        int n=1450;
        if(n%10 < 5){
            n-=n%10;
        }else{
            n=(n+10)-(n%10);
        }
        System.out.println(n);
    }
}
