package Test_2015_83_460;

public class Question_2 {
	
	public static boolean sum2(int[] arr, int num) {
		int low = 0, high = arr.length-1, mid, i = 1;
		
		while (low <= high)
		{
			mid = (low+high)/2;
			
			if (arr[mid] >= num) {
				high = mid-1;
				System.out.println("1: " + (i++));
			} else if (arr[mid]+arr[low] > num) {
				high--;
				System.out.println("2: " + (i++));
			} else if (arr[high]+arr[mid] < num) {
				low = mid+1;
				System.out.println("3: " + (i++));
			} else if (arr[high]+arr[mid] == num) {
				System.out.println("4: " + (i++));
				return true;
			} else {
				low++;
				System.out.println("5: " + (i++));
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {-2, 3, 5, 7, 12};
		System.out.println(sum2(arr, 17)); // true
		System.out.println(sum2(arr, 16)); // false
	}

}
