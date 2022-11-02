package D31_10_22;

public class Encryption {
    public static String output1;
    public static void main( String [] args ) {
        userMethod( "EngIneering" ); //Test Cases
        System.out.println( output1 ); //Check the output value
    }
    
    public static void userMethod( String input1 ) {
        // Code here
        String str=input1.toLowerCase();
        String out="";
        char key=str.charAt(str.length()-1);
        int nKey=key-96;
        for(int i=0;i<str.length()-1;i++){
            int t=str.charAt(i)-nKey;
            if(t <= 96){
                t+=26;
            }
            if(Character.isUpperCase(input1.charAt(i))){
                t-=32;
            }
            out+= (char)(t);
        }
        out+=key;
        output1=out; // assign the output value at the end
    }
    static int pos(char ch){
        return ch - 'a';
    }
    
}