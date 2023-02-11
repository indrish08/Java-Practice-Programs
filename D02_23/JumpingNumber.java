package D02_23;

public class JumpingNumber {
    public static void main(String[] args) {
        long out = jumpingNums(50);
        System.out.println(out);
        
        printJumpingNums(50);
    }

    static long jumpingNums(long x) {
        while (x > 0) {
            String s = x + "";
            int c = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1)
                    break;
                c++;
            }
            if (c == s.length() - 1)
                break;
            x--;
        }
        return x;
    }

    static void printJumpingNums(long x) {
        for(long i = 0; i < x; i++) {
            String s = String.valueOf(i);
            int c = 0;
            for (int j = 0; j < s.length() - 1; j++) {
                if (Math.abs(s.charAt(j) - s.charAt(j + 1)) != 1)
                    break;
                c++;
            }
            if (c == s.length() - 1)
                System.out.print(i+" ");;
        }
    }
}
