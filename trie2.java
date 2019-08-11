package programming;

import java.util.HashMap;

import programming.Trie.TrieNode;

public class trie2 {
	
	static TrieNode root;
	static public class Trie {
	    static TrieNode root;
	    static public class TrieNode {
		    HashMap<Character, TrieNode> children;
		    String content;
		    boolean isWord;
		}
	}
	
	public void insert(String word) {
	    TrieNode current = root;
	 
	    for (int i = 0; i < word.length(); i++) {
	        current = current.getChildren().computeIfAbsent(word.charAt(i), c -> new TrieNode());
	    }
	    current.setEndOfWord(true);
	}
	
	public void givenATrie_WhenAddingElements_ThenTrieNotEmpty() {
	    trie2 trie = createTrie();
	 
	    assertFalse(trie2.isEmpty());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
