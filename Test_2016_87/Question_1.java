package Test_2016_87;

public class Question_1 {
	
	public static int count(int sum, int i, int cSum) {
		if (sum == i) {
			if (cSum == sum) {
				return 1;
			}
			return 0;
		}
		return count(sum, i+1, cSum+(i+1)) + count(sum, i+1, cSum);
	}

	public static int count(int sum) {
		return count(sum, 0, 0);
	}
	
	public static void main(String[] args) {
		int sum = 7;
		System.out.println(count(sum));
	}
}
