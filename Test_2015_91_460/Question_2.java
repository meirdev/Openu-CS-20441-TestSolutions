package Test_2015_91_460;

public class Question_2 {
	
	public static boolean what(int[] a, int num) {
		int l = 0, r = 1, sum = a[l];
		
		while (l <= r) {
			if (sum == num) {
				return true;
			} else if (sum < num) {
				if (r == a.length) {
					break;
				}
				sum += a[r];
				r++;
			} else {
				sum -= a[l];
				l++;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] a = {4, 2, 5, 62, 1};
		System.out.println(what(a, 62));
		System.out.println(what(a, 1));
		System.out.println(what(a, 63));
		System.out.println(what(a, 61));
		System.out.println(what(a, 7));
		System.out.println(what(a, 11));
		System.out.println(what(a, 69));
		System.out.println(what(a, 9));
		System.out.println(what(a, 6));
		System.out.println(what(a, 68));
		System.out.println(what(a, 100));
	}

}
