package D31_10_22;

public class Encryption {
    public static String output1;
    public static void main( String [] args ) {
        userMethod( "Engineering" ); //Test Cases
        System.out.println( output1 ); //Check the output value
    }
    
    public static void userMethod( String input1 ) {
        // Code here
        String str=input1.toLowerCase();
        String out="";
        char key=str.charAt(str.length()-1);
        int nKey=pos(key);
        for(int i=0;i<str.length()-1;i++){
            if(pos(str.charAt(i))-nKey < 0){
                
            }
            out+= (char)(pos(str.charAt(i))-nKey);
        }
        output1=""; // assign the output value at the end
    }
    static int pos(char ch){
        return ch - 'a';
    }
    
}