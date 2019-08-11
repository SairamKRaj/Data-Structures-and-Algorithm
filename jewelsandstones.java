package programming;

import java.util.HashMap;

public class jewelsandstones {
	
	static int count_elements(char[] j, char[] s) {
		HashMap<Character,Integer> maps=new HashMap<Character,Integer>();
		int count=0;
		for(int i=0; i<s.length; i++) {
			if(maps.containsKey(s[i])) {
				int value=maps.get(s[i]);
				maps.put(s[i], value+1);
			}
			
			else
				maps.put(s[i],1);
		}
		
		for(int k=0;k<j.length;k++) {
			if(maps.containsKey(j[k]))
				count+=maps.get(j[k]);
		}
		
		return count;
	}

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		char[] j=J.toCharArray();
		char[] s=S.toCharArray();
		int count=count_elements(j,s);
		System.out.println(count);
	}

}
