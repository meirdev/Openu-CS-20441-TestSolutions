package Test_2016_91;

public class Question_2 {
	
	public static boolean findAverage(int[] arr, double x) {
		
		int low = 0, high = arr.length-1, sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		while (low <= high) {
			double avg = (double) sum/(high-low+1);
			
			if (avg > x) {
				sum -= arr[high];
				high--;
			} else if (avg < x) {
				sum -= arr[low];
				low++;
			} else {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 8, 14, 15, 35};
		System.out.println(findAverage(arr, 8)); // 2 --- 2 true
		System.out.println(findAverage(arr, 2.5)); // 0 --- 1 true
		System.out.println(findAverage(arr, 10)); // 1 --- 4 true
		System.out.println(findAverage(arr, 8.5)); // false
	}

}
