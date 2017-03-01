package Test_2016_91;

public class Question_1 {
	
	public static int minDragon(int[][] maze, int y, int x, int count) {
		
		int max = Integer.MAX_VALUE, a = max, b = max, c = max, d = max;
		
		if (y == maze.length || x == maze[0].length || maze[y][x] == 0 || maze[y][x] == -1) {
			return max;
		}
		
		if (maze[y][x] == 3) {
			count++;
		}
		
		if (y == maze.length-1 && x == maze.length-1) {
			return count;
		}
		
		maze[y][x] = -1;
		
		if (y+1 < maze.length) {
			a = minDragon(maze, y+1, x, count);
		}
		
		if (y-1 >= 0) {
			b = minDragon(maze, y-1, x, count);
		}
		
		if (x+1 < maze[0].length) {
			c = minDragon(maze, y, x+1, count);
		}
		
		if (x-1 >= 0) {
			d = minDragon(maze, y, x-1, count);
		}
		
		return Math.min(a, Math.min(b, Math.min(c, d)));
	}
	
	public static int minDragon(int[][] maze) {
		return minDragon(maze, 0, 0, 0);
	}

	public static void main(String[] args) {
		int[][] maze = {
				{1, 1, 3, 3},
				{3, 0, 1, 1},
				{3, 0, 0, 1},
				{1, 3, 3, 1}
		};
		System.out.println(minDragon(maze)); // 1
		
		int[][] maze2 = {
				{1, 1, 3, 3},
				{3, 0, 1, 1},
				{3, 0, 0, 0},
				{1, 3, 3, 1}
		};
		System.out.println(minDragon(maze2)); // 4
		
		int[][] maze3 = {
				{1, 0, 3, 3},
				{3, 0, 1, 1},
				{3, 0, 0, 0},
				{0, 3, 3, 1}
		};
		System.out.println(minDragon(maze3)); // Integer.MAX_VALUE
	}

}
