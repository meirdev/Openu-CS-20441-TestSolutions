package Test_2015_85;

public class Question_2 {
	
	public static boolean splitTo3(int[] arr) {
		
		if (arr.length < 2) {
			return false;
		}
		
		int limit1 = 0, limit2 = arr.length-1, sum = 0;
		
		for (int i = limit1; i < limit2; i++) {
			sum += arr[i];
		}
		
		while (limit1 < limit2) {
			if (sum < 0) {
				sum -= arr[limit1];
				limit1++;
			} else if (sum > 0) {
				sum -= arr[limit2];
				limit2--;
			} else {
				break;
			}
		}
		
		if (sum == 0) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {-8, -7, -5, -3, -2, 5, 8};
		System.out.println(splitTo3(arr)); // true
		int[] arr2 = {-8, -7, -5, -3, -2, 7, 8};
		System.out.println(splitTo3(arr2)); // false
		int[] arr3 = {-8, -7, -5, -3, -2, -1, 1};
		System.out.println(splitTo3(arr3)); // true
		int[] arr4 = {-8, -7, 15, 23, 32, 37, 38}; 
		System.out.println(splitTo3(arr4)); // true
	}

}
