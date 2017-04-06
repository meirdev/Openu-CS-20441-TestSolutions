package Test_2016_487;

public class Question_1
{
	public static int minPath(char[][] minChess, int i, int j)
	{
		int result;
		
		return (result = minPath(minChess, i, j, 0)) == Integer.MAX_VALUE ? -1 : result;
	}
	
	public static int minPath(char[][] minChess, int i, int j, int counter)
	{
		if (i >= minChess.length || i < 0 || j >= minChess[i].length || j < 0 || minChess[i][j] == '1') {
			return Integer.MAX_VALUE;
		}
		
		if (minChess[i][j] == 'K') {
			return counter;
		}
		
		counter++;
		
		char temp = minChess[i][j];
		
		minChess[i][j] = '1';
		
		int a = minPath(minChess, i+2, j+1, counter),
		b = minPath(minChess, i+2, j-1, counter),
		c = minPath(minChess, i-2, j+1, counter),
		d = minPath(minChess, i-2, j-1, counter),
		e = minPath(minChess, i+1, j+2, counter),
		f = minPath(minChess, i+1, j-2, counter),
		g = minPath(minChess, i-1, j+2, counter),
		h = minPath(minChess, i-1, j-2, counter);
		
		minChess[i][j] = temp;
		
		return Math.min(a,
			Math.min(b,
				Math.min(c,
					Math.min(d,
						Math.min(e,
							Math.min(f,
								Math.min(g, h)))))));
	}
	
	public static void main(String[] args)
	{
		char[][] minChess = {
			{'0', '0', '0', '0'},
			{'0', '0', '0', '0'},
			{'0', '0', 'K', '0'},
			{'H', '0', '0', '0'}
		};
		
		System.out.println(minPath(minChess, 3, 0)); // 1
		
		char[][] minChess2 = {
				{'0', '0', '0', '0'},
				{'0', '0', 'K', '0'},
				{'0', '0', '0', '0'},
				{'H', '0', '0', '0'}
		};
			
		System.out.println(minPath(minChess2, 3, 0)); // 4
		
		char[][] minChess3 = {
				{'0', '0', 'K', '0'},
				{'0', '0', '0', '0'},
				{'0', '0', '0', '0'},
				{'H', '0', '0', '0'}
		};
			
		System.out.println(minPath(minChess3, 3, 0)); // 3
	}
}
