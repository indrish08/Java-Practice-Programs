package D26_08_22;
import java.util.ArrayList;
import java.util.Collections;
public class unionIntersectionOfArrayElements {
    public static void main(String[] args) {
        int[] a={12,45,62,98,5,28}, b={98,23,12,145};
        intersectionOfTwoArrays(a, b);
        System.out.println();
        unionOfTwoArrays(a, b);
        System.out.println();
        unionOfTwoArraysSorted(a, b);
        System.out.println();
        uniqueElementsInArray1(a, b);
    }

    static void intersectionOfTwoArrays(int[] a,int[] b){
        ArrayList<Integer> al =new ArrayList<>();
        int t[]=new int[b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j] && t[j]!=-1){
                    al.add(a[i]);
                    t[j]=-1;
                    break;
                }
            }
        }
        for (Integer i : al) {
            System.out.print(i+" ");
        }
    }
    
    static void unionOfTwoArrays(int[] a,int[] b){
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(!(al.contains(b[i]))){
                al.add(b[i]);
            }
        }
        for (Integer i : al) {
            System.out.print(i+" ");
        }
    }
    
    static void unionOfTwoArraysSorted(int[] a,int[] b){
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(!(al.contains(b[i]))){
                al.add(b[i]);
            }
        }
        Collections.sort(al);
        for (Integer i : al) {
            System.out.print(i+" ");
        }   
    }
    
    static void uniqueElementsInArray1(int[] a,int[] b){
        ArrayList<Integer> al =new ArrayList<>();
        boolean tf;
        for(int i=0;i<a.length;i++){
            tf=true;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    tf=false;
                    break;
                }
            }
            if(tf){
                al.add(a[i]);
            }
        }
        for (Integer i : al) {
            System.out.print(i+" ");
        }        
    }
}