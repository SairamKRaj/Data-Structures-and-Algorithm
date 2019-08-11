package programming;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class topkwordsinarray {
	
	public static List<String> frequentwords(String[] wordcollection, int k) {
		HashMap<String,Integer> wordcount=new HashMap<String,Integer>();
		for(String word: wordcollection) {
			wordcount.put(word, wordcount.getOrDefault(word,0)+1);
		}
		
		PriorityQueue<String> pq=new PriorityQueue<String>(
				(word1, word2)->wordcount.get(word1).equals(wordcount.get(word2))?word2.compareTo(word1):wordcount.get(word1)-wordcount.get(word2)
				);
		
		for(String word: wordcount.keySet()) {
			pq.offer(word);
			if(pq.size()>k)
				pq.poll();
			else
				continue;
		}
		
		List<String> result=new ArrayList<String>();
		while(!pq.isEmpty())
			result.add(pq.poll());
		Collections.reverse(result);;
		return result;
	}
		

	public static void main(String[] args) {
		String[] wordcollection= {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		int k=4;
		System.out.println("Top 3 words in the list are:"+frequentwords(wordcollection,k).toString());
	}

}
