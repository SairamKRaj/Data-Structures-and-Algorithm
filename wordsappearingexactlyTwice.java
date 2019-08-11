package programming;

import java.util.HashMap;

public class wordsappearingexactlyTwice {
	
	static int count_words(String[] word_list, int n) {
		HashMap<String,Integer> word_count=new HashMap<String,Integer>();
		
		for(int i=0; i<n; i++) {
			if(word_count.containsKey(word_list[i])) {
				int count=word_count.get(word_list[i]);
				word_count.put(word_list[i], count+1);
			}
			else
				word_count.put(word_list[i], 1);
		}
		
		int count=0;
		
		for(HashMap.Entry<String,Integer> it: word_count.entrySet()) {
			if(it.getValue()==4)
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		String s[]= {"hate", "love", "peace", "love", 
	               "peace", "hate", "love", "peace", 
	               "love", "peace"};
		int n=s.length;
		int counts=count_words(s,n);
		System.out.println("Number of Words that occurs exactly twice are:");
		System.out.print(counts);
	}
}
