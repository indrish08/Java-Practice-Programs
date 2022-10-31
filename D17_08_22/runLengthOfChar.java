public class runLengthOfChar {
    public static void main(String[] args) {
        String str="wwwwaaadexxxxxx";
        System.out.println(runLength(str));
    }
    static String runLength(String s){
        StringBuilder str = new StringBuilder();
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(i==s.length()-2){
                    str.append(s.charAt(i));
                    str.append(count);
                }
            }else{
                str.append(s.charAt(i));
                str.append(count);
                count=1;
            }

        }
        return str.toString();
    }
}
