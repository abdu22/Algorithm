import java.util.ArrayList;
import java.util.List;

public class WordSearch {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*board =
			[
			  ['A','B','C','E'],
			  ['S','F','C','S'],
			  ['A','D','E','E']
			]
      ABCCED = true   ABCB = false 
    */
	public boolean exist(char[][] board, String word) {
		char [] w = word.toCharArray(); int k=0;
		for(int i = 0; i <board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				if(board[i][j] == w[k]) {
					Index xy = new Index(i,j);
					k++;
				}
			}
		}
		
		return false;
	}
	public static List<Index> getNaigbours(Index xy ) {
		List<Index> neighbour = new ArrayList<Index>();
		if(xy.i-1>=0 ) neighbour.add(new Index(xy.i-1,xy.j));
		if(xy.j-1>=0 ) neighbour.add(new Index(xy.i,xy.j-1));
		if(xy.i+1>=0 ) neighbour.add(new Index(xy.i+1,xy.j));
		if(xy.j+1>=0 ) neighbour.add(new Index(xy.i,xy.j+1));
		
		return neighbour;
	}
}
class Index{
	int i=0;
	int j=0;
	public Index(int i, int j) {
		this.i = i; 
		this.j = j;
	}
}