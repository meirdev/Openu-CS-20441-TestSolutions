package Test_2016_82_490;

public class Question_2 {
	
	public static boolean isSum(Range a[], int x)
	{
		int left = 0, right = a.length-1;
		
		while (left < right) {
			if (x <= a[left].getSmallest()) {
				return false;
			} else if (a[right].getSmallest() >= x) {
				right--;
			} else {
				int tempX  = x/2;
				int tempX2 = x-a[right].getSmallest()-a[left].getSmallest();
				int diff  = (a[right].getLargest()-a[right].getSmallest())+(a[left].getLargest()-a[left].getSmallest());
				
				if (tempX2 >= 0 && tempX2 <= diff) { // one from right, one from left
					return true;
				} else if (tempX > a[right].getSmallest() && tempX < a[right].getLargest()) { // two from right
					return true;
				} else if (tempX > a[left].getSmallest() && tempX < a[left].getLargest()) { // two from left
					return true;
				}
				left++;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Range[] a = new Range[4];
		a[0] = new Range(3, 5);
		a[1] = new Range(12, 12);
		a[2] = new Range(19, 20);
		a[3] = new Range(100, 104);
		
		System.out.println(isSum(a, 22));
	}
	
}
