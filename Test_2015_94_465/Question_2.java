package Test_2015_94_465;

public class Question_2 {
	
	public static void smallestSub(int[] a, int k) {
		int l = 0, r = 1, sum = a[l], count = 1, min = a.length;
		
		while (l <= r) {
			if (sum <= k) {
				if (r == a.length) {
					break;
				}
				sum += a[r];
				r++;
				count++;
			} else {
				min = Math.min(min, count);
				sum -= a[l];
				l++;
				count--;
			}
		}
		
		System.out.println(l == 0 && r == a.length ? min+1 : min);
	}

	public static void main(String[] args) {
		int[] a = {1, 4, 13, 6, 0, 19};
		smallestSub(a, 22); // 3
		smallestSub(a, 42); // 6
		smallestSub(a, 43); // 7
		smallestSub(a, 26); // 4
		smallestSub(a, 2); // 1
	}

}
