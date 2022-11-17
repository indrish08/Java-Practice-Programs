package D10_11_22;

public class IsSubsequenceofStr {
    public static void main(String[] args) {
        String s="indrish";
        String[] q={"is", "rh", "nds", "hi", "rd"};
        for (String que : q) {
            System.out.println(isSubsequenceofStr(s,que));
        }
    }
    static String isSubsequenceofStr(String s, String q){
        int c=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j>=q.length()) break;
            if(s.charAt(i)==q.charAt(j)){
                j++;
                c++;
            }
        }
        if(c==q.length())
            return "YES";
        else 
            return "NO";
    }
}
