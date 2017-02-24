package Test_2015_86_465;

public class Question_1 {
	public static void printAllSum(int[] a, int sum, String str, int sLength, int cSum)
	{
		if (sLength == a.length) {
			if (sum == cSum) {
				System.out.println(str);
			}
			return;
		}
		printAllSum(a, sum, str + "0", sLength+1, cSum);
		printAllSum(a, sum, str + "1", sLength+1, cSum+a[sLength]);
	}
	
	public static void printAllSum(int[] a, int sum)
	{
		printAllSum(a, sum, "", 0, 0);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 7};
		printAllSum(arr, 8); // 1001, 0101
		printAllSum(arr, 10); // 0011
		printAllSum(arr, 12); // 1111
		printAllSum(arr, 6); // -empty-
	}
}
