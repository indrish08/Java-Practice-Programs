package D31_10_22;

public class CharacterSwapping {
    public static void main(String[] args) {
        String str="tody is is today h";
        System.out.println(str);
        String out="";
        str=str.toLowerCase();
        String[] sa=str.split("[ ]");
        int len=(sa.length%2);len*=2;
        System.out.println((len));
        for(int i=0;i<len;i+=2){
            int l1=sa[i].length(),
                l2=sa[i+1].length();
            if(l1>l2){
                String t=sa[i+1];
                out+=t+" ";
                t="";
                for(int j=sa[i].length()-1;j>=l1-(l1-l2);j--){
                    t+=sa[i].charAt(j);
                }
                t+=sa[i].substring(0, sa[i+1].length());
                out+=t;
            }else{
                String t="";
                for(int j=sa[i+1].length()-1;j>=l2-(l2-l1);j--){
                    t+=sa[i+1].charAt(j);
                }
                t+=sa[i+1].substring(0, sa[i].length());
                out+=t+" ";
                t="";
                t=sa[i];
                out+=t;
            }
        }
        if(sa.length%2==1){
            String t=sa[sa.length-1];
            out+=" ";
            for(int i=t.length()-1;i>=0;i--){
                out+=t.charAt(i);
            }
        }
        System.out.println(out);

        if(sa.length%2==0){
        }
    }
}
