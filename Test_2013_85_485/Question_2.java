package Test_2013_85_485;

public class Question_2 {
	public static int minAbsSum(int[] a) {
		int low = 0, high = a.length-1, mid = -1;
		
		while (low <= high) {
			mid = (low+high)/2;
			
			if (mid == 0) {
				return Math.abs(a[mid])+Math.abs(a[mid+1]);
			}
			
			if (mid == high) {
				return Math.abs(a[mid])+Math.abs(a[mid-1]);
			}
			
			if (Math.abs(a[mid-1]) > Math.abs(a[mid]) && Math.abs(a[mid]) < Math.abs(a[mid+1])) {
				return Math.abs(a[mid]) + Math.min(Math.abs(a[mid-1]), Math.abs(a[mid+1]));
			}
			
			if (Math.abs(a[mid-1]) < Math.abs(a[mid])) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return mid;
	}
	
	public static void main(String[] args) {
		int[] a = {-32, -25, -4, -1};
		//int[] a = {-1,3,5,7,8,11,17,25,20,36};
		//int[] a = {-20,-7,-5,-4,7,8,11,17,25,30,36};
		System.out.println(minAbsSum(a));
	}
}
