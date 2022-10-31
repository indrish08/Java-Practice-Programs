package D27_08_22;

public class patternMatching {
    public static void main(String[] args) {
        String str="EEBBCABCxyz", key="abc";
        str=str.toUpperCase();
        key=key.toUpperCase();
        if(str.contains(key)){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
    }
}
