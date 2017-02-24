package Test_2014_85_458;

public class Question_2 {
	
	public static boolean what(int n) {
		return (f(n)%2 == 0);
	}
	
	public static int f(int n) {
		int c = 1;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		return c;
	}
	
	public static boolean myWhat(int n) {
		
		int counter = 0;
		int n2 = n;
		
		for (int i = 2; n2 >= i; i++) {
			if (n%i == 0) {
				counter++;
			}
			n2 = n/i;
		}
		
		counter *= 2;
		
		if (Math.sqrt(n)%2 == 0) {
			counter--;
		}
		
		if (n == 1) {
			counter++;
		} else {
			counter += 2;
		}
		
		return counter%2 == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(myWhat(154));
		System.out.println(what(154));
	}
}
