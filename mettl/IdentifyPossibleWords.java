package mettl;
// https://tests.mettl.com/v2/authenticateKey/13486c16
public class IdentifyPossibleWords {
    public static void main(String[] args) {
        String input1="Fi_er";
        String input2="Fever:filer:filter:Fixer:fiber:fibre:tailor:offer";
        String output1=identifyPossibleWords(input1, input2);
        System.out.println(output1); //FILER:FIXER:FIBER
    }
    static String identifyPossibleWords(String input1, String input2){
        input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		String[] s1=input1.split("[_]"), 
				 s2=input2.split("[:]");
		String out="", temp="";
		if(!(input1.charAt(input1.length()-1)=='_')){
			temp=s1[1];
		}
		// for(String s : s1){
			// System.out.println(s);
		// }
		// System.out.println();
		// for(String s : s2){
		// 	System.out.println(s);
		// }
		// System.out.println(s1[0].length());
		// System.out.println(temp.length());
		for(String s : s2){
			if(s.length()==input1.length()){
				if((s.substring(0, s1[0].length()).equals(s1[0])) && 
				   (s.substring(s.length()-temp.length())).equals(temp)){
					if(out.length()==0){
						out=out+s;
					}else{
						out=out+":"+s;
					}
				}
			}
		}
		if(out.length()==0){
			return "ERROR-009";
		}
		return out;
    }
}
