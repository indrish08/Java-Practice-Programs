package D27_08_22;

import java.util.Scanner;

public class findBestAppleShop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("How many apples does Josh wants to buy : ");
        int n=s.nextInt();
        System.out.print("\nShop A :\nNumber of Apples and Price : ");
        int m1=s.nextInt(), p1=s.nextInt();
        System.out.print("\nShop B :\nNumber of Apples and Price : ");
        int m2=s.nextInt(), p2=s.nextInt();
        s.close();
        int t=0, t1=0, k=1, l=1;
        for(int i=m1;i<=n;i+=m1){
            t+=p1;
            k=i;
        }
        if(k!=0){
            t+=p1;
        }
        for(int i=m2;i<=n;i+=m2){
            t1+=p2;
            l=i;
        }
        if(l!=0){
            t1+=p2;
        }
        if(t<t1)
            System.out.println("\nOutput : "+t);
        else
            System.out.println(t1);

    }
}
