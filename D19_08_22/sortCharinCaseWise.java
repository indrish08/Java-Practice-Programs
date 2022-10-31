package D19_08_22;
// import java.util.Arrays;
public class sortCharinCaseWise {
    public static void main(String[] args) {
        String str="KSRCollege";
        str=sortString(str);
        System.out.println(str);
    }
    static String sortString(String s){
        char[] temp=s.toCharArray();
        char t;
        // Arrays.sort(temp);
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]>temp[j]){
                    t=temp[i];
                    temp[i]=temp[j];
                    temp[j]=t;
                }
            }
        }
        return String.valueOf(temp);
    }
}