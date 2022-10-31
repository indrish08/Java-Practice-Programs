package D11_10_22;

public class ReverseAnEquation {
    public static void main(String[] args) {
        String s1="20-3+5*2";
        String[] arr=s1.split("[+*/-]");  //storing numbers in str array
        String[] ar=new String[arr.length-1];  //array for operators
        
        //storing operators
        int k=0;
        for(int i=0;i<s1.length();i++){  
            if(!Character.isDigit(s1.charAt(i))){
                ar[k]=String.valueOf(s1.charAt(i));
                k++;
            }
        }

        //seperate string array for each equation
        String[] as1=new String[arr.length+k];
        String[] as2=new String[arr.length+k];
        int l=0;
        for(int i=0;i<k;i++){
            as1[l++]=arr[i];
            as1[l++]=ar[i];
        }
        as1[as1.length-1]=arr[arr.length-1];
        l=1;
        as2[0]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            as2[l++]=ar[i];
            as2[l++]=arr[i];
        }
        String s2="";
        for (String s : as2) {
            s2+=s;
        }

        //printing both equation
        System.out.println("\nGiven    : "+s1);
        System.out.println("Reversed : "+s2+"\n");
        
        //printing both equation's string array
        // for (String s : as1) {
        //     System.out.print(s+" | ");
        // }
        // System.out.println();
        // for (String s : as2) {
        //     System.out.print(s+" | ");
        // }
        // System.out.println();
        
        System.out.println(solveEquation(as1));
        System.out.println(solveEquation(as2));
        System.out.println();
    }

    public static int solveEquation(String[] as1){
        for(int i=0;i<as1.length;i++){
            if(as1[i].equals("*") || as1[i].equals("/")){
                int x=i-1;
                int y=i+1;
                while(as1[x].equals("0")){
                    x--;
                }
                while(as1[y].equals("0")){
                    y++;
                }
                int n=arithOperations(Integer.valueOf(as1[x]), as1[i], Integer.valueOf(as1[y]));
                as1[i]=String.valueOf(n);
                as1[x]="0";
                as1[y]="0";
            }
        }
        for(int i=0;i<as1.length;i++){
            if(as1[i].equals("+") || as1[i].equals("-")){
                int x=i-1;
                int y=i+1;
                while(as1[x].equals("0")){
                    x--;
                }
                while(as1[y].equals("0")){
                    y++;
                }
                int n=arithOperations(Integer.valueOf(as1[x]), as1[i], Integer.valueOf(as1[y]));
                as1[i]=String.valueOf(n);
                as1[x]="0";
                as1[y]="0";
            }
        }
        for (String s : as1) {
            if(!s.equals("0")){
                return Integer.valueOf(s);
            }
        }
        return 0;
    }

    public static int arithOperations(int n, String c, int n2){
        switch(c){
            case "+":
                return n+n2;
            case "-":
                return n-n2;
            case "*":
                return n*n2;
            case "/":
                return n/n2;
        }
        return 0;
    }
}
