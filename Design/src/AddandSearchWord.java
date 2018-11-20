public class AddandSearchWord {
    // creating the node 
 				public static class TrieNode {
 					TrieNode [] link;
 					boolean isEnd;
 					TrieNode(){
 						this.link = new TrieNode[26];
 					}					
 					public boolean containsKey(char c) {
 						return link[c-'a'] != null;
 					}
 					public TrieNode get(char c) {
 						return link[c-'a'];
 					}
 					public void put(char c , TrieNode node) {
 						link[c-'a'] = node;
 					}
 					public void setEnd() {
 						isEnd = true;
 					}
 					public boolean isEnd() {
 						return isEnd;
 					}				
 				}	
   /** Initialize your data structure here. */
 	public static TrieNode root; 
     public AddandSearchWord() {
         root = new TrieNode();
         }
     /** Inserts a word into the trie. */
     public void insert(String word) {
     	   TrieNode currNode = root;
         for(int i = 0; i< word.length(); i++) {
         	    char c = word.charAt(i);
         	    if(!currNode.containsKey(c)) {
         	    	   currNode.put(c, new TrieNode());
         	    }
         	    currNode = currNode.get(c);
         }
         currNode.setEnd();
     }
     
     /** Returns if the word is in the trie. */
     public  boolean search(String word) {
    	    TrieNode  currNode = root;
     	  return help(word,0,currNode);
     }
    public boolean help(String word, int i, TrieNode currNode) {
    	if(word.length() == i) return currNode.isEnd; 
    	    char c = word.charAt(i);
    	    if(c != '.') {
        	    	    return currNode.get(c) != null && help(word,i+1,currNode.get(c));
        	 }else {
        		  for(int k = 0; k < 26 ; k++) {
        			   if(currNode.link[k] != null && help(word, i+1, currNode.link[k])) return true;
        		  }
        		  return false;
        	 }
    }
     
 	public static void main(String[] args) {
 		AddandSearchWord trie = new AddandSearchWord();
 		trie.insert("apple");
 		trie.insert("orange");
 		trie.insert("app");
 		trie.insert("cat");  
 		
 		System.out.println(trie.search("cat"));    // true
 		System.out.println(trie.search("apple"));  // true
 		System.out.println(trie.search("app"));    // true
 		System.out.println(trie.search("ap..."));    // true
 		

 	}

}
