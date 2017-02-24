package Test_2016_87_481;

public class Question_2 {
	
	public static int passingCars(int[] a)
	{
		int zero  = 0;
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			} else {
				count += zero;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int[] a = {0, 1, 0, 1, 1};
		System.out.println(passingCars(a));
	}
}
