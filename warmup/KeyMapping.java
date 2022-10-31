public class KeyMapping {
    public static void main(String[] args) {
        String key="programming";
        String[] sarr={"apple", "ping", "training", "placement", "planning", "processing", "task"};
        for(int i=0;i<sarr.length;i++){
            if(key.charAt(0)==sarr[i].charAt(0) && key.charAt(key.length()-1)==sarr[i].charAt(sarr[i].length()-1)){
                System.out.println(sarr[i]);
            }
        }
        // for(String s : sarr){
        //     if(key.charAt(0)==s.charAt(0) && key.charAt(key.length()-1)==s.charAt(s.length()-1)){
        //         System.out.println(s);
        //     }
        // }    
    }
}