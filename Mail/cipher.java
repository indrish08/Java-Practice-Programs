public class cipher {
    public static void main(String[] args) {
        String pt ="GFG";
        String key ="HILLMAGIC";
        String ct="";
        int k=0, len=pt.length();
        int a[][]=new int [len][len];
        int b[]=new int [len];
        int c[]=new int [len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                a[i][j]= key.charAt(k)-65;
                k++;
            }
            b[i]= pt.charAt(i)-65;
        }
        for(int i=0;i<len;i++){
            int s=0;
            for(int j=0;j<len;j++){
                s+=a[i][j]*b[j];
            }
            c[i]=s;
        }
        for (int i : c) {
            ct+=(char)((i%26)+65);
        }
        System.out.println(ct);
    }
}