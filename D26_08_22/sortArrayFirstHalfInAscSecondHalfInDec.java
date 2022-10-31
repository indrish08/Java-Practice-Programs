package D26_08_22;
public class sortArrayFirstHalfInAscSecondHalfInDec {
    public static void main(String[] args) {
        int[] a={1,7,4,23,65,2,12,45,18,35};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(i<a.length/2){
                    if(a[i]>a[j]){
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
                if(i>a.length/2){
                    if(a[i]<a[j]){
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
