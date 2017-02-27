package Test_2012_82;

public class Question_2 {
	
	public static int count(int[] a, int x) {
		
		int low = 0, high = a.length-1, mid;
		
		int left = -1, right = -1;
		
		while (low <= high) {
			mid = (low+high)/2;
			if (a[mid] == x) {
				if (mid == 0 || (mid > 0 && a[mid-1] != x)) {
					left = mid;
					break;
				} else {
					high = mid-1;
				}
			} else if (a[mid] > x) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		if (left == -1) return 0;
		
		high = a.length-1;
		low = left+1;
		
		while (low <= high) {
			mid = (low+high)/2;
			if (a[mid] == x) {
				if (mid == a.length-1 || (mid < a.length-1 && a[mid+1] != x)) {
					right = mid;
					break;
				} else {
					low = mid+1;
				}
			} else if (a[mid] > x) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		if (right == -1) return 1;
		
		return right-left+1;
	}

	public static void main(String[] args) {
		int a[] = {-5,-5,1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,67,67,99};
		System.out.println(count(a, -5)); // 2
		System.out.println(count(a, 2)); // 5
		System.out.println(count(a, 8)); // 0
	}

}
