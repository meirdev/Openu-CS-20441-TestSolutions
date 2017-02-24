package Test_2016_87;

public class Question_2 {
	public static int subStrC(String s, char c) {
		int count = -3;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count >= 0 ? count+1 : 0; 
	}
	
	public static int subStrMaxC(String s, char c, int k) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		
		int x = 0;
		for (int i = 0; i <= k; i++) {
			x += count-(i+2) >= 0 ? 1+count-(i+2) : 0;
		}
		
		return x; 
	}
	
	public static void main(String[] args) {
		//System.out.println(subStrMaxC("abcbc", 'c', 0));
		System.out.println(subStrMaxC("abcbcabcacabc", 'c', 3));
		//System.out.println(subStrMaxC("abc", 'c', 2));
	}
}
