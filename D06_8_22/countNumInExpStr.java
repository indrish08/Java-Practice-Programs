package D06_8_22;

public class countNumInExpStr {
    public static void main(String[] args) {
        String str="23*(56+187)+ab";
        String ar[]=str.split("[^0-9]");
        int count=ar.length;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==""){
                count--;
            }
        }
        System.out.println(count);
    }
}
