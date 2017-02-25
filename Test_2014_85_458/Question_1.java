package Test_2014_85_458;

public class Question_1 {
	
	public static void longestWorm(int[][] mat)
	{
		System.out.println(longestWorm(mat, 0, 0, 0));
	}
	
	public static int longestWorm(int[][] mat, int y, int x, int length)
	{
		int a = 0, b = 0, c = 0, d = 0;
		
		if (mat.length > y+1) {
			if (length == 0 || mat[y][x]+1 == mat[y+1][x])
				a = longestWorm(mat, y+1, x, length+1);
		}
		
		if (y-1 >= 0) {
			if (length == 0 || mat[y][x]+1 == mat[y-1][x])
				b = longestWorm(mat, y-1, x, length+1);
		}
		
		if (mat[y].length > x+1) {
			if (length == 0 || mat[y][x]+1 == mat[y][x+1])
				c = longestWorm(mat, y, x+1, length+1);
		}
		
		if (x-1 >= 0) {
			if (length == 0 || mat[y][x]+1 == mat[y][x-1])
				d = longestWorm(mat, y, x-1, length+1);
		}
		
		return Math.max(length, Math.max(a, Math.max(b, Math.max(c, d))));
	}

	public static void main(String[] args)
	{
		int[][] board = {
			{3, 13, 15, 28, 30},
			{50, 51, 52, 29, 30},
			{51, 10, 53, 54, 55},
			{53, 12, 14, 53, 11}
		};
		
		longestWorm(board);
	}
}
