import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	 public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> a = new ArrayList<>();
		
		int m = matrix.length;   // no if row
		int n = matrix[0].length; //no of column
		int w = 0; 
		int v = 0;
		//if(m == 0 && n == 0 ) return null;
		while(m>=w && n>=v) {
			 int i=v; int j = w;
			 while(i<n) {
				 a.add(matrix[j][i]);
				 i++;
		     }
			 i--; j++; 
			 while(j<m) {
				 a.add(matrix[j][i]);
				 j++;
		     }
			 n--; i--; j--;
			 while(i>=v) {
				 a.add(matrix[j][i]);
				 i--;
		     }
			 i++; j--; w++; v++;
			 while(j>=w) {
				 a.add(matrix[j][i]);
				 j--;
		     }
			 j++; m--;
		}
		
		return a;
	        
	    }
	public static void main(String[] args) {
		 int matrix[][] = { {1, 2, 3, 4},
				            {5, 6, 7, 8},
				            {9,10,11,12},
				            };
		 List<Integer> ans = spiralOrder(matrix);
		 
		 
		 System.out.println(ans.toString());
	}

}
