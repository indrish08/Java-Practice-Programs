package D29_7_22;

import java.util.Arrays;

public class oddEvenAsc {
    public static void main(String[] args) {
        int a[]={1,2,3,4,46,76,33,5,6,7,8};
        int len=a.length,x=0,y=0;
        int odd[]=new int [len];
        int even[]=new int [len];
        for(int i=0;i<len;i++){
            if(a[i]%2==0){
                even[x]=a[i];
                x++;
            }else{
                odd[y]=a[i];
                y++;
            }
        }
        int newar[]=new int [len];
        int i=0;
        x=0;y=0;
        while(odd[x]!=0){
            newar[i]=odd[x];
            i++;x++;
        }
        while(even[y]!=0){
            newar[i]=even[y];
            i++;y++;
        }
        System.out.println(Arrays.toString(newar));
    }
}
