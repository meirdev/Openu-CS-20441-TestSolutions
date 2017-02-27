package Test_2013_85_474;

public class Question_2 {
	
	public static int fixedPoint(int[] a) {
		int low = 0, high = a.length-1, mid;
		
		while (low <= high) {
			mid = (low+high)/2;
			if (a[mid] == mid) {
				return mid;
			} else if (a[mid] > mid) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {-3, 0, 2, 4, 11, 12, 15};
		System.out.println(fixedPoint(a));
	}

}
