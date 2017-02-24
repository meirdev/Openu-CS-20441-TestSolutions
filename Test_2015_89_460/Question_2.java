package Test_2015_89_460;

public class Question_2 {
	
	public static boolean findX(int[] a, int x) {
		int l = 0, h = a.length-1, m, sum;
		while (l <= h) {
			m = (l+h)/2;
			sum = a[m]+a[m+1];
			
			if (sum == x) {
				return true;
			}
			
			if (sum < x) {
				l = m+1;
			} else {
				h = m-1;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 5, 3, 6, 10, 9};
		System.out.println(findX(a, 9)); // true
		System.out.println(findX(a, 5)); // false
	}

}
