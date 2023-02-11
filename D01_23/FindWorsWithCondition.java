package D01_23;

import java.util.Scanner;

public class FindWorsWithCondition {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str = "Hello Welcome to KSR College, TiruchengodE";
        String con="w%";    
        str = str.toLowerCase();
        int single=con.indexOf("_");
        int whole=con.indexOf("%");
        if(single!=-1) {
            String s=con.replaceAll("_", "");
            int index=str.indexOf(s);
            int ini=con.indexOf(s);
            System.out.println(str.substring(index-ini,index+con.length())); 
        }
        else if(whole!=-1){
            con=con.replaceAll("%", "");
            String s=con.replaceAll("_", "");
            String stri[]=str.split(" ");
            for (String st : stri) {
                if(st.contains(s)){
                    System.out.println(st);
                }
            }
        }



    }

}
