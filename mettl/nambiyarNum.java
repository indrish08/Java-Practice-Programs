package mettl;
public class nambiyarNum {
    public static void main(String[] args) {
        String input1="9880127431";
        int n=0;
		String out="";
		boolean even = (Integer.parseInt(input1.charAt(0)+"")%2 == 0);
		System.out.println(even);
		// int i=0;
		// while(i<input1.length()){
		for(int i=0;i<input1.length();i++){
			// even = (Integer.parseInt(input1.charAt(i)+"")%2 == 0);
			// n=0;
			
			if(even){
				System.out.println("i : "+i+" "+ input1.charAt(i) +" even");
				n+=Integer.parseInt(input1.charAt(i)+"");
				System.out.println("n :             "+n);
				if(n%2!=0){
					System.out.println("---");
					even = (Integer.parseInt(input1.charAt(i+1)+"")%2 == 0);
					// even=false;
					out += n+"";
					n=0;
					// break;
				} 			
			}
			else{
				System.out.println("i : "+i+" odd");
				n+=Integer.parseInt(input1.charAt(i)+"");
				System.out.println("n :             "+n);
				if(n%2==0){
					System.out.println("---");
					even = (Integer.parseInt(input1.charAt(i+1)+"")%2 == 0);
					// even=true;
					out += n+"";
					n=0;
					// break;
				} 			
			}
		}
        // if(n>=0) 
		out+=n+"";
        
        System.out.println(out);
		// return Integer.parseInt(out);
	}
}