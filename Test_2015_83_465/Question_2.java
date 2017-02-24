package Test_2015_83_465;

public class Question_2 {
	public static void replace(int[] a)
	{
		int len  = a.length-1;
		int last = 0;
		
		if (len == -1) {
			a[0] = 0;
		}
		
		last     = Math.max(a[len-1], a[len]);
		a[len-1] = a[len];
		a[len]   = 0;
		
		for (int i = len-2; i >= 0; i--) {
			int temp = a[i];
			a[i] = last;
			last = Math.max(last, temp);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a " + i + " " + a[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {6, 7, 4, 3, 5, 2}; // 7, 5, 5, 5, 2, 0

		replace(a);
	}
}
