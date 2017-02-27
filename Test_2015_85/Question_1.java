package Test_2015_85;

public class Question_1 {
	
	public static int countRopes(int[][] mat, int y, int x, int last) {
		if (x == mat[0].length || x < 0) {
			return 0;
		}
		
		if (y < mat.length && y > 0 && mat[y][x] >= last) {
			return 0;
		}
		
		if (y == mat.length-1) {
			return 1;
		}
		
		return countRopes(mat, y, x+1, 0) + countRopes(mat, y+1, x, mat[y][x]) + countRopes(mat, y+1, x+1, mat[y][x]) + countRopes(mat, y+1, x-1, mat[y][x]);
	}
	
	public static int countRopes(int[][] mat)
	{
		return countRopes(mat, 0, 0, 0);
	}
	
	public static void main(String[] args) {
		int[][] mat = {
				{0, 0, 0, 10, 0, 0},
				{0, 0, 8, 0, 9, 0},
				{0, 6, 0, 0, 0, 7},
				{3, 0, 4, 0, 0, 5},
				{1, 2, 0, 0, 0, 2}
			};
		
		System.out.println(countRopes(mat));
	}
}
