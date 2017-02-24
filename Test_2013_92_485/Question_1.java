package Test_2013_92_485;

public class Question_1 {
	public static int longestFlat(int[] arr) {
		return longestFlat(arr, 0);
	}
	
	public static int longestFlat(int[] arr, int index) {
		
		if (index == arr.length) {
			return 0;
		}
		
		int max = Math.max(
			lengthFlatSequence(arr, index, -1, 0),
			lengthFlatSequence(arr, index, 1, 0)
		);
		
		return Math.max(max, longestFlat(arr, index+1));
	}
	
	public static int lengthFlatSequence(int[] arr, int index, int sign, int counter) {
		
		if (index == arr.length || (arr[index-counter] != arr[index] && arr[index-counter]+sign != arr[index])) {
			return counter;
		}
		
		return lengthFlatSequence(arr, index+1, sign, counter+1);
	}

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 5, 4, 3};
		System.out.println(longestFlat(arr));
	}
}
