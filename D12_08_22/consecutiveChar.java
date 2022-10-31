package D12_08_22;

class consecutiveChar{
    public static void main(String[] args){
        String str="hooraaaaaaaaaaay";
        System.out.println(str);
        char[] carr=str.toCharArray();
        int len=1, count=1;
        for(int i=0;i<carr.length-1;i++){
            if(carr[i]==carr[i+1]){
                count++;
            }else{
                if(count>len){
                    len=count;
                    count=1;
                }
            }
        }
        System.out.println(len);
    }
}