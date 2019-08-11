package programming;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;

public class kTopElements {
	
	public static ArrayList<String> topkelements(String[] arr, int n, int k){
		HashMap<String,Integer> maps=new HashMap<String,Integer>();
		for(String word: arr) {
			maps.put(word, maps.getOrDefault(word,0)+1);
		}
		
		PriorityQueue<String> pq=new PriorityQueue<String>((word1,word2) -> maps.get(word1).equals(maps.get(word2))?word2.compareTo(word1):maps.get(word1)-maps.get(word2));
	
		for(String word : maps.keySet()) {
			pq.add(word);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		
		ArrayList<String> ans=new ArrayList<String>();
		while(!pq.isEmpty()) {
			ans.add(pq.poll());
		}
		
		Collections.reverse(ans);
		return ans;
		
	}

	public static void main(String[] args) {
		String[] arr= {"ip1","ip2","ip3","ip1","ip3"};
		int length=arr.length;
		int k=2;
		System.out.println(topkelements(arr,length,k));
	}

}
