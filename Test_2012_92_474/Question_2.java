package Test_2012_92_474;

public class Question_2 {
	public static int alternating(String s) {
		int  count = 1;
		char start = s.charAt(0);
		for (int i = 2; i < s.length(); i += 2) {
			if (s.charAt(i) == start) {
				count++;
			}
		}
		int f = s.length()/2-count;
		return Math.min(f, s.length()/2-f);
	}

	public static void main(String[] args) {
		System.out.println(alternating("00011011"));
		System.out.println(alternating("00101011"));
	}
}
