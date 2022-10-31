package D25_08_22;
import java.util.*;
public class shuffleArrayElements {
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5,6,7,8,9};
        int t=0;
        Random r = new Random();
        int rnd=r.nextInt(a.length);
        for(int i=0;i<a.length;i++){
            t=a[rnd];
            a[rnd]=a[i];
            a[i]=t;
        }
        System.out.println(Arrays.toString(a));

        // List<Integer> l= Arrays.asList(a);
        // Collections.shuffle(l);
        // l.toArray(a);
        // System.out.println(Arrays.toString(a));
    }
}
