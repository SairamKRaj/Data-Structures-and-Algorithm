/*Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time.
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
Note:

Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
You may assume no duplicates in the word list.
You may assume beginWord and endWord are non-empty and are not the same.

Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

Output: 5

Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.*/

import java.util.HashMap;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.util.Pair;

class solution{
    
    public static int wordladder(String beginWord, String endWord, ArrayList<String> wordList){
        HashMap<String,ArrayList<String>> words=new HashMap<String,ArrayList<String>>();
        
        int n=beginWord.length();
        
        wordList.forEach(word->{
                for(int i=0;i<n;i++){
                    String newword1=word.substring(0,i)+"*"+word.substring(i+1,n);
                    ArrayList<String> combinations=words.getOrDefault(newword1,new ArrayList<String>());
                    combinations.add(word);
                    words.put(newword1,combinations);
                    }
                    });
                    
        Queue<Pair<String,Integer>> q=new LinkedList<Pair<String,Integer>>();
        q.add(new Pair(beginword,1));
        
        HashMap<String,Boolean> visited=new HashMap<String,Boolean>();
        visited.put(beginWord,true);
        
        while(!q.isEmpty()){
            Pair<String,Integer> node=q.remove();
            String word=node.getKey();
            int level=node.getValue();
            for(int i=0;i<n;i++){
                String newword=word.substring(0,i)+"*"+word.substring(i+1,n);
                for(String adjacentword: words.getOrDefault(newword, new ArrayList<String>())){
                    if(adjacentword.equals(endWord)){
                        return level+1;
                    }
                    if(!visited.containsKey(adjacentword)){
                        visited.put(adjacentword,true);
                        q.add(new Pair(adjacentword,level+1));
                    }
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args){
        String beginWord="hit";
        String endWord="cog";
        ArrayList<String> wordList=new ArrayList<String>(Arrays.asList(new String[]{"hot","dot","dog","lot","log","cog"}));
        int length=wordladder(beginWord,endWord,wordList);
        System.out.println(length);
    } 
}
