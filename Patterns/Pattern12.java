package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        printTriangle(10);   
    }   
    static void printTriangle(int n) {
        // code here
        int k=n*4;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            
            for(int j=k-(i*4)-1;j>=0;j--){
                System.out.print(" ");
            }
            
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    } 
}

