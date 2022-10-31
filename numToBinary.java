public class numToBinary {
    public static void main(String[] args) {
        int n=439;
        int m=1, c1=0;
        String b="";
        while(m<=n){
            m*=2;
        }m/=2;
        while(m>0){
            if(n>=m){
                b+="1";
                n-=m;
            }else{
                b+="0";
            }c1++;
            m/=2;
        }
        int max=0, c=0;
        for(int i=0;i<c1;i++){
            System.out.print(b.charAt(i));
            if(b.charAt(i)=='1'){
                c++;
                System.out.println("    +1");
            }else{
                if(max<c){
                    max=c;
                }
                System.out.println("    res");
                c=0;
            }
        }
        if(max<c){
            max=c;
        }
        System.out.println(b+" "+max);
    }
}
