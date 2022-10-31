package Day14;

import java.util.Arrays;

public class firstAndLastChar {

	public static void main(String[] args) {
		String key="programming";
		String[] inp= {"apple","ping","training","placement","planning","processing","task"};
		System.out.println("Key : "+key);
		System.out.println("Strings in the Array : "+Arrays.toString(inp));
		System.out.println();
		for(int i=0;i<inp.length;i++) {
			if(key.charAt(0)==inp[i].charAt(0) && key.charAt(key.length()-1)==inp[i].charAt(inp[i].length()-1)) {
				System.out.println(inp[i]);
			}
		}
	}

}
