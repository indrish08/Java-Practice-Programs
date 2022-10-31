package mettl;
// https://tests.mettl.com/v2/authenticateKey/5106dfd
public class FindPasswordStableUnstable {
    public static void main(String[] args) {
        int n=findPassword(12, 1313, 122, 678, 898);
        System.out.println(n);  //983
    }
    static int findPassword(int input1,int input2,int input3,int input4,int input5){
        int[] ar={input1,input2,input3,input4,input5};
		int s=0, us=0;
		for(int i=0;i<ar.length;i++){
			if(isStable(ar[i])){
				s+=ar[i];
			}else{
				us+=ar[i];
			}
		}
		return s-us;
	}
	static boolean isStable(int n){
		char[] c=String.valueOf(n).toCharArray();
		int[] co=new int[c.length];
		for(int i=0;i<c.length;i++){
			int count=1;
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j] && co[j]!=-1){
					count++;
					co[j]=-1;
				}
			}
			if(co[i]!=-1){
				co[i]=count;
			}
		}
		int k=co[0];
		for(int i=1;i<co.length;i++){
			if(co[i]!=-1){
				if(co[i]!=k){
					return false;
				}
			}
		}
		return true;
    }
}