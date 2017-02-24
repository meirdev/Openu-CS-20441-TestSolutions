package Test_2014_85_476;

public class Question_2 {
	
	public static void main(String[] args)
	{
		int[] arr = {49, 52, 56, 57, 65, 104, -5, -3, 3, 5, 48};
		System.out.println(findMax(arr));
	}
	
	public static int findMax(int[] arr)
	{
		int low = 0, high = arr.length-1, mid = 0;
		
		while (low <= high)
		{
			mid = (low+high)/2;
			
			if (arr[high] > arr[low]) {
				return arr[high];
			}
			
			if (arr[mid+1] < arr[mid]) {
				break;
			}
			
			if (arr[mid] < arr[high]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		return arr[mid];
	}
}
