package Test_2016_82_490;

public class Question_1 {
	public static void main(String[] args) {
		int[] vec = {1, 2, 2, 1, 3, 2, 1, 3, 4, -1, 3, 3};
		System.out.println(where(vec));
		System.out.println(isBalanced(vec, 3));
	}
	
	public static int where(int[] vec) {
		return where(vec, 0, 1, vec.length);
	}
	
	public static int where(int[] vec, int left, int i, int right) {
	
		if (right <= 1 || right == i) {
			return -1;
		}
		
		if (sum(vec, left, i-1) == sum(vec, i, right-1)) {
			return i;
		}
		
		return where(vec, left, ++i, right);
	}
	
	public static int sum(int[] array, int l, int h) {
		int sum = 0;
		while (l <= h) {
			sum += array[l];
			l++;
		}
		return sum;
	}
	
	public static boolean isBalanced(int[] vec, int k) {
		return isBalanced(vec, k, 0, vec.length);
	}
	
	public static boolean isBalanced(int[] vec, int k, int left, int right) {
		int p = where(vec, left, left+1, right);
		
		if (p != -1) {
			if (k == 1) {
				return true;
			}
			return isBalanced(vec, k-1, left, p) && isBalanced(vec, k-1, p, right);
		}
		
		return false;
	}
}
