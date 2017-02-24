package Test_2016_87_481;

public class Question_1 {
	
	public static int minDiff(int[] arr)
	{
		return minDiff(arr, 0, 0, 0);
	}

	public static int minDiff(int[] arr, int i, int sum1, int sum2)
	{
		if (i == arr.length) {
			return Math.abs(sum1-sum2);
		}

		return Math.min(
			minDiff(arr, i+1, sum1+arr[i], sum2),
			minDiff(arr, i+1, sum1, sum2+arr[i])
		);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 7, 17, 6};
		System.out.println(minDiff(arr));
	}
}
