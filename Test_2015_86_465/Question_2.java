package Test_2015_86_465;

public class Question_2 {
	public static void printPairs(int[] a, int k) {
		int l = 0;
		int r = 1;
		
		while (r < a.length) {
			if (a[r]-a[l] > k) {
				l++;
			}
			else if (a[r]-a[l] < k) {
				r++;
			}
			else {
				System.out.println("Pair Found: (" + a[l] + "," + a[r] + ")");
				l++;
				r++;
			}
			if (r == l) {
				r++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {-7, -3, 0, 1, 3, 5, 12, 14, 17, 19, 25, 30};
		printPairs(a, 2);
		printPairs(a, 6);
		printPairs(a, 23);
	}
}
