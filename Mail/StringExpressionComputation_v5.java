import java.util.ArrayList;

public class StringExpressionComputation_v5 {
    public static int output1;
    public static String output2;
    public static void main(String [] args) {
        String input1 = "150/20+(126*5)*(75+725*3)";  // 6+((5*4)/(4/2))+(23-15)

        if(isValid(input1)){
            output1=Integer.valueOf(computationStringExpression(input1)); 
            output2="Valid Expression";
        }else{
            output1=0; 
            output2 ="Invalid Expression";
        }

        System.out.println("output1 : "+output1);   //ans = 24
        System.out.println("output2 : "+output2);
    }

    public static String computationStringExpression(String input1) {
            String s=input1;
            System.out.println(s+"\n");
            while(s.contains("(")){
                int i1=s.indexOf('('), i2=0;
                int c=0;
                for(int i=i1;i<s.length();i++){
                    if(s.charAt(i)=='(') c++;
                    if(s.charAt(i)==')') c--;
                    if(c==0 && s.charAt(i)==')') {
                        i2=i;
                        break;
                    }
                }
                String subs=s.substring(i1+1, i2);
                while(subs.contains("(")){
                    subs=computationStringExpression(subs);
                }
                s = s.substring(0, i1)+
                    solveEquation(subs)+
                    s.substring(i2+1);
                System.out.println(s);
            }
            return solveEquation(s);
       
    }
    static String solveEquation(String s){
        String[] a1=s.split("[+-/%*]");
        int x=0;
        ArrayList<String> as = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                as.add(a1[x++]);
                as.add(String.valueOf(s.charAt(i)));
            }
        }
        as.add(a1[a1.length-1]);
        int k=0;
        while(as.contains("*")||as.contains("/")||as.contains("%")){
            int i=k;
            if(as.get(i).equals("*") || as.get(i).equals("/") || as.get(i).equals("%")){
                
                for(String ss:as){
                    System.out.print(" | "+ss);
                }
                System.out.println(" |\n");
                
                int n=arithOperations(Integer.valueOf(as.get(i-1)), as.get(i), Integer.valueOf(as.get(i+1)));
                as.add(i+2, String.valueOf(n));
                as.remove(i+1);
                as.remove(i);
                as.remove(i-1);
                k=i-1;
            }
            k++;
        }
        k=0;
        while(as.size()!=1){
                int i=k;
                if(as.get(i).equals("+") || as.get(i).equals("-")){
                    
                    for(String ss:as){
                        System.out.print(" | "+ss);
                    }
                    System.out.println(" |\n");
                    
                    int n=arithOperations(Integer.valueOf(as.get(i-1)), as.get(i), Integer.valueOf(as.get(i+1)));
                    as.add(i+2, String.valueOf(n));
                    as.remove(i+1);
                    as.remove(i);
                    as.remove(i-1);
                    k=i-1;
                }
                k++;
        }
        for(String ss:as){
            System.out.print(" | "+ss);
        }
        System.out.println(" |\n");
        return as.get(0);
    }

    static int arithOperations(int n, String c, int n2){
        switch(c){
            case "+":
                return n+n2;
            case "-":
                return n-n2;
            case "*":
                return n*n2;
            case "/":
                return n/n2;
            case "%":
                return n%n2;
        }
        return 0;
    }
    
    static boolean isValid(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!(Character.isDigit(c)|| c==37 || c>=40&&c<=43 || c==45 || c==47)){
                System.out.println("err1");
                return false;
            }
            if(c=='(') count++;
            if(c==')') count--;
        }
        if(count!=0){
            System.out.println("err2"); 
            return false;
        }
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char c1=s.charAt(i+1);
            if((c==37||c>=42&&c<=47) && (c1==37||c1>=42&&c1<=47)){
                System.out.println("err3");
                return false;
            }
        }
        return true;
    }
}