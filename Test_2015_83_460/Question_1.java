package Test_2015_83_460;

public class Question_1 {
	public static int shortestPath(int[][] mat)
	{
		return shortestPath(mat, 0, 0, 0, 0, "g");
	}

	public static int shortestPath(int[][] mat, int y, int x, int value, int count, String f)
	{
		if (y < 0 || x < 0 || mat.length == y || mat[y].length == x || value > mat[y][x]) {
			return Integer.MAX_VALUE;
		}

		if (y == mat.length-1 && x == mat[y].length-1) {
			return count+1;
		}
		
		int min = Math.min(
					shortestPath(mat, y, x+1, mat[y][x], count+1, "f1"),
					Math.min(
							shortestPath(mat, y+1, x, mat[y][x], count+1, "f2"),
							shortestPath(mat, y, x-1, mat[y][x], count+1, "f3")
							)
					);
		
		return min;
	}

	public static void main(String[] args) {
		int[][] mat = {
				{3, 13, 15, 28, 30},
				{40, 51, 52, 29, 30},
				{28, 10, 53, 54, 53},
				{53, 12, 55, 53, 60},
				{70, 62, 56, 20, 80},
				{80, 81, 90, 95, 100}
			};
		
		System.out.println(shortestPath(mat));
	}
}
