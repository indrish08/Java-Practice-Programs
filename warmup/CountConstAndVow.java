public class CountConstAndVow {
    public static void main(String[] args) {
        String str="programming";
        char[] vo={'a', 'e', 'i', 'o', 'u'};
        int c=0,v=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vo.length;j++){
                if(str.charAt(i)==vo[j]){
                    v++;
                }
            }
        }
        c=str.length()-v;
        System.out.println(str);
        System.out.println("Vowel Count : "+v);
        System.out.println("Constant Count : "+c);
    }
}
