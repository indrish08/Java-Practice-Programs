package mettl;
// https://tests.mettl.com/v2/authenticateKey/592740f3
public class UserIDGeneration {
    public static void main(String[] args) {
        UserIDGeneration ob = new UserIDGeneration();
        String s = ob.userIdGeneration("Rajiv", "Roy", 560037, 6);
		System.out.println(s); // YrAJIV75
    }    
    public String userIdGeneration(String input1,String input2,int input3,int input4){
		// Read only region end
		// Write code here...
		String s1=input1, s2=input2;
		int pin=input3, n=input4;
		if(input1.length()>input2.length()){
			s1=input2;
			s2=input1;
		}else if(input1.length()<input2.length()){
			s1=input1;
			s2=input2;
		}else{
			if(input1.compareTo(input2) > 0){
				s1=input2;
				s2=input1;
			}else{
				s1=input1;
				s2=input2;
			}
		}
		String out="";
		out+=s1.charAt(s1.length()-1);
		out+=s2;
		char[] ca=out.toCharArray();
		for(int i=0;i<ca.length;i++){
			if(Character.isUpperCase(ca[i])){
				ca[i]=Character.toLowerCase(ca[i]);
			}else{
				ca[i]=Character.toUpperCase(ca[i]);

			}
		}
		out=new String(ca);
		out+=String.valueOf(pin).charAt(n-1);
		out+=String.valueOf(pin).charAt(String.valueOf(pin).length()-n);
		return out;
	}
}

