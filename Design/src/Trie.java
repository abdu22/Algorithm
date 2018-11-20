
public class Trie {
   
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
    public Trie() {
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
    // helper method 
    public TrieNode searchPrifix(String word) {
    	    TrieNode currNode = root;
    	    for(int i =0 ;i < word.length(); i++) {
    	    	   char c = word.charAt(i);
    	    	   if(currNode.containsKey(c)) {
    	    		   currNode = currNode.get(c);
    	    	   }else {
    	    		   return null;
    	    	   } 
    	    }
    	    return currNode;
    }
    
    /** Returns if the word is in the trie. */
    public  boolean search(String word) {
    	    TrieNode n = searchPrifix(word);
        if(n == null) return false;
        else if (n.isEnd != true) return false;
        else return true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public  boolean startsWith(String prefix) {
    	  TrieNode n = searchPrifix(prefix);
        return n!=null;
    }
    
    
    
    
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("orange");
		trie.insert("app");
		trie.insert("cat");  
		
		System.out.println(trie.search("cat"));    // true
		System.out.println(trie.search("apple"));  // true
		System.out.println(trie.search("app"));    // true
		System.out.println(trie.search("ap"));     // false
		System.out.println(trie.startsWith("ap")); // true

	}

}
