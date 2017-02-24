package Test_2015_89_460;

public class Question_1 {
	public static boolean splitEqualMult(int[] a, int i, int mult1, int mult2)
	{
		if (i == a.length) {
			if (mult1 == mult2) {
				return true;
			}
			return false;
		}
		return splitEqualMult(a, i+1, mult1*a[i], mult2) || splitEqualMult(a, i+1, mult1, mult2*a[i]);
	}
	
	public static boolean splitEqualMult(int[] a)
	{
		return splitEqualMult(a, 0, 1, 1);
	}

	public static void main(String[] args) {
		int[] a = {2, 15, 3, 4, 2, 5};
		System.out.println(splitEqualMult(a));
		int[] b = {2, 4, 6, 2, 3, 4};
		System.out.println(splitEqualMult(b));
	}
}
