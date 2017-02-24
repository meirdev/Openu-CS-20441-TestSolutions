package Test_2015_89_460;

public class Question_6 {
	
	public static void what(int n, int k)
	{
		what(n, k, "");
	}
	
	private static void what(int n, int k, String s)
	{
		if (k == 0) {
			System.out.println(s);
		} else if (n > 0) {
			what(n-1, k, s);
			what(n-1, k-1, n+s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		what(8, 2);
	}

}
