package mettl;
// https://tests.mettl.com/v2/authenticateKey/f05028d5
class EncodingThreeStrings

{

	public class Result{
		public final String output1;
		public final String output2;
		public final String output3;

		public Result(String out1, String out2, String out3){
			output1 = out1;
			output2 = out2;
			output3 = out3;
		}
	}
    
    public Result encodeThreeStrings(String input1,String input2,String input3){
    	// Read only region end
        //Write code here...
		String[] sa={input1,input2,input3};
		String[][] out = new String[3][3];
		for(int i=0;i<3;i++){
			int n=0, l=sa[i].length()/3;
			if(sa[i].length()%3==0){
				out[i][0]=sa[i].substring(n , n+=l);
				out[i][1]=sa[i].substring(n , n+=l);
				out[i][2]=sa[i].substring(n , n+=l);
			}else if((sa[i].length()-1)%3==0){
				out[i][0]=sa[i].substring(n , n+=l);
				out[i][1]=sa[i].substring(n , n+=l+1);
				out[i][2]=sa[i].substring(n , n+=l);
			}else if((sa[i].length()-2)%3==0){
				out[i][0]=sa[i].substring(n , n+=l+1);
				out[i][1]=sa[i].substring(n , n+=l);
				out[i][2]=sa[i].substring(n , n+=l+1);
			}
		}
		String output1[]=new String[3];
		for(int i=0;i<3;i++){
			String tmp="";
			for(int j=0;j<3;j++){
				tmp+=out[j][i];
			}
			output1[i]=tmp;
		}
		String tmp="";
		for(int i=0;i<output1[2].length();i++){
			if(Character.isUpperCase(output1[2].charAt(i))){
				tmp+=(char)(output1[2].charAt(i)+32);
				// tmp+=Character.toLowerCase(output1[2].charAt(i));
			}else{
				tmp+=(char)(output1[2].charAt(i)-32);
				// tmp+=Character.toUpperCase(output1[2].charAt(i));
			}
		}
		output1[2]=tmp;
		Result ob=new Result(output1[0],output1[1],output1[2]);
		return ob;
    }
}


