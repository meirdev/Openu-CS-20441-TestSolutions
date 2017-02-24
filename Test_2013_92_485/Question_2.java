package Test_2013_92_485;

public class Question_2 {
	public static void sortMod(int[] a, int k)
	{
		for (int i = a.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] % k > a[j+1] % k) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void main(String[] args) {
		int[] a = {35, 17, 13, 252, 4, 128, 7, 3, 81};
		sortMod(a, 10);
	}
}
