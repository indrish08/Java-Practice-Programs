package D01_23;

public class NoOfConfusingNumbers {
    public static void main(String[] args) {
        int n = 100;
        int count=0;
        for(int i=1;i<=n;i++){
            if(confusingNumber(i)){
                count++;
                // System.out.println(i);
            }
        }
        System.out.println(count);
    }

    static boolean confusingNumber(int n) {
        char[] ca = (n+"").toCharArray();    //converts the integer to char array
        String key="23457";
        for(int i=0;i<ca.length;i++){
            if(key.contains(ca[i]+""))       //checks any digit matches with key
                return false;
            if(ca[i]=='6')                   //swaps 6 to 9
                ca[i]='9';
            else if(ca[i]=='9')              //swaps 9 to 6
                ca[i]='6';
        }
        String rev = (new StringBuffer(String.valueOf(ca)).reverse())+"";  //reverses the string
        return !((n+"").equals(rev));        // checks both the num and rev is not same
    }
}
