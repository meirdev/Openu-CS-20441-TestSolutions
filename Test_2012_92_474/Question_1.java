package Test_2012_92_474;

public class Question_1 {
	
	public static boolean isWay(int[] a, int i) {
		
		if (i < 0 || i >= a.length || a[i] == -1) {
			return false;
		}
		
		if (i == a.length-1) {
			return true;
		}
		
		int temp = a[i];
		
		a[i] = -1;
		
		return isWay(a, i+temp) || isWay(a, i-temp);
	}
	
	public static boolean isWay(int[] a) {
		return isWay(a, 0);
	}

	public static void main(String[] args) {
		int[] a = {2, 4, 1, 6, 4, 2, 4, 3, 5};
		System.out.println(isWay(a)); // true
		int[] b = {1, 4, 3, 1, 2, 4, 3};
		System.out.println(isWay(b)); // false
	}

}
