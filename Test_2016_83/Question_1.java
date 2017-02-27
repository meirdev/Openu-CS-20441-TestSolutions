package Test_2016_83;

public class Question_1 {
	
	public static int minPoints(int[][] m, int y, int x, int last, int min) {
		
		if (y == m.length || x == m[0].length) {
			return Integer.MAX_VALUE;
		}
		
		if (last+m[y][x] < 0) {
			min += Math.abs(m[y][x]);
		}
		
		if (y == m.length-1 && x == m[0].length-1) {
			return min;
		}
		
		last += m[y][x];
		
		return Math.min(minPoints(m, y, x+1, last, min), minPoints(m, y+1, x, last, min));
	}
	
	public static int minPoints(int[][] m) {
		return minPoints(m, 0, 0, 0, 0);
	}

	public static void main(String[] args) {
		int[][] m = {
				{-2, -3, 3},
				{-5, -10, 1},
				{10, 30, -5}
		};
		System.out.println(minPoints(m));
	}

}
