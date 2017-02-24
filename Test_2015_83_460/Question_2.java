package Test_2015_83_460;

public class Question_2 {
	
	public static boolean sum2(int[] arr, int num) {
		int low = 0, high = arr.length-1;
		while (low <= high)
		{
			if (arr[low]+arr[high] == num) {
				return true;
			} else if (arr[low]+arr[high] > num) {
				high--;
			} else {
				low++;
			}
		}
		return false;
	}
	
	public static boolean sum3(int[] arr, int num) {
		int low = 0, high = arr.length-1, num3;
		while (low <= high)
		{
			num3 = num-(arr[high]+arr[low]);
			if (arr[low]+arr[high] > num) {
				high--;
			} else if (num3 >= arr[high]) {
				low++;
			} else {
				int l = low+1, h = high-1, m;
				while (l <= h) {
					m = (l+h)/2;
					if (num3 == arr[m]) {
						return true;
					} else if (arr[m] > num3) {
						h = m-1;
					} else {
						l = m+1;
					}
				}
				high--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {-2, 3, 5, 7, 12};
		System.out.println(sum2(arr, 17)); // true
		System.out.println(sum2(arr, 16)); // false
		System.out.println(sum2(arr, 1)); // true
		System.out.println(sum2(arr, 8)); // true
		System.out.println(sum2(arr, 12)); // true
		System.out.println(sum2(arr, 19)); // true
		System.out.println(sum2(arr, 10)); // true
		System.out.println(sum2(arr, 9)); // false
		System.out.println(sum2(arr, 11)); // false
		System.out.println(sum2(arr, 5)); // true
		
		System.out.println(sum3(arr, 17)); // true
		System.out.println(sum3(arr, 16)); // true
	}

}
