package Test_2012_85;

public class Question_2 {

	public static void printPathWeights(int[][] m, int y, int x, int sum, String path) {
		
		if (x < 0 || x >= m[0].length || y < 0 || y >= m.length) {
			return;
		}
		
		if (m[y][x] == -1) {
			return;
		}
		
		if (y == m.length-1 && m[0].length-1 == x) {
			sum += m[y][x];
			System.out.println(path + m[y][x] + "=" + sum);
			return;
		}
		
		int temp = m[y][x];
		m[y][x] = -1;
		path += temp + "+";
		sum += temp;
		printPathWeights(m, y+1, x, sum, path);
		printPathWeights(m, y, x+1, sum, path);
		printPathWeights(m, y, x-1, sum, path);
		printPathWeights(m, y-1, x, sum, path);
		m[y][x] = temp;
	}
	
	public static void printPathWeights(int[][] m) {
		printPathWeights(m, 0, 0, m[0][0], "");
	}
	
	public static void main(String[] args) {
		int[][] m = {
				{8, 4, 2, 4, 3},
				{6, 3, 8, 4, 5},
				{1, 4, 9, 9, 7},
				{2, 1, 7, 6, 5}
		};
		printPathWeights(m);
	}

}
