package D01_23;

public class SumOfTwoElements {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6 };
        int t=6;
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    System.out.println(a[i]+" and "+a[j]);
                }
            }

    }
}
