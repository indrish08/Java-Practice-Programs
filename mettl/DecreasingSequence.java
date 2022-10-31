package mettl;
// https://tests.mettl.com/authenticateKey/8e68e9a4
public class DecreasingSequence {
    public static void main(String[] args) {   
        int input1[]={11,3,1,4,7,8,12,2,3,7};
        int input2=10;  
        int longest=1, count=1, noOfSeq=0;
		int countarr[]=new int[20], n=0;
		if(input2!=1){
			for(int i=0;i<input2-1;i++){
				if((input1[i]>input1[i+1])){
					count++;
				}else{
					if(count>1){
						noOfSeq++;
						countarr[n]=count;
						n++;
					}
					// if(count>longest){
					// 	longest=count;
					// }
					count=1;
				}
			}
			if(input1[input2-2]>input1[input2-1]){
				if(count>1){
					noOfSeq++;
					countarr[n]=count;
					n++;
				}
				// if(count>longest){
				// 	longest=count;
				// }
			}
			longest=countarr[0];
			for(int q=1;q<countarr.length;q++){
				if(countarr[q]>longest){
					longest=countarr[q];
				}
			}
		}else{
			longest=0;
			noOfSeq=0;
		}
		// Result obj=new Result(noOfSeq,longest);
		// return obj;
        System.out.println(noOfSeq+" "+longest);
    }
}