package Test_2015_94_465;

public class Question_1 {
	
	public static int longOrdNum(String s, int i, char l, int c) {
		
		if (i == s.length()) {
			return c;
		}
		
		char charIndex = s.charAt(i);
		
		int c2;
		
		if ('0' <= charIndex && charIndex <= '9') {
			if (l < charIndex) {
				c++;
				c2 = c;
			} else {
				c2 = 1;
			}
			l = charIndex;
		} else {
			c2 = 0;
			l = '0';
		}
		
		return Math.max(c, longOrdNum(s, i+1, l, c2));
	}
	
	public static int longOrdNum(String s) {
		if (s == "") {
			return 0;
		}
		return longOrdNum(s, 0, '0', 0);
	}
	
	public static void main(String[] args) {
		System.out.println(longOrdNum("x12y3348")); // 3
		System.out.println(longOrdNum("321")); // 1
		System.out.println(longOrdNum("xyz")); // 0
		System.out.println(longOrdNum("")); // 0
		System.out.println(longOrdNum("23256812")); // 4
	}
}
