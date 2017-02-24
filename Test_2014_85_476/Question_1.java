package Test_2014_85_476;

public class Question_1 {
	public static void main(String[] args) {
		int mat[][] = {{3,2,7,1}, {5,4,2,4}, {12,14,-13,22}, {13,16,17,52}};
		
		printPath(mat);
	}
	
	public static void printPath(int[][] mat) {
		printPath(mat, 0, 0, "");
	}
	
	public static void printPath(int[][] mat, int y, int x, String path) {
		boolean u = true, d = true, l = true, r = true;
		String currectPath = "(" + y + "," + x + ")";
		
		if (x+1 < mat[y].length && mat[y][x] <= mat[y][x+1]) {
			r = false;
		}
		
		if (y+1 < mat.length && mat[y][x] <= mat[y+1][x]) {
			d = false;
		}
		
		if (x-1 >= 0 && mat[y][x-1] >= mat[y][x]) {
			l = false;
		}
		
		if (y-1 >= 0 && mat[y-1][x] >= mat[y][x]) {
			u = false;
		}
		
		if (u && d && r && l) {
			System.out.println(path + currectPath);
		} else if (!r) {
			printPath(mat, y, x+1, path + currectPath);
		} else if (!d) {
			printPath(mat, y+1, x, path + currectPath);
		}
		
		return;
	}
}
