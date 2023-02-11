package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n=5;
        int k=3;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            insertSpace((n+n)*2-k);
            k+=4;
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        k=1;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            insertSpace(k);
            k+=4;
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void insertSpace(int n){
        while(n-->0){
            System.out.print(" ");
        }
    }
}
