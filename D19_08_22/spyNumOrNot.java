package D19_08_22;
public class spyNumOrNot {
    public static void main(String[] args) {
        int n=132;
        int sum=0, pro=1;
        while(n>0){
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        if(sum==pro)
            System.out.println(true);
        else
            System.out.println(false);
    }
}