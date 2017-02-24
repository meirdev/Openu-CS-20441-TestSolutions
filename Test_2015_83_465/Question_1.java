package Test_2015_83_465;

public class Question_1 {
	
	public static int lcs(String s, String t)
	{
		return lcs(s, t, 0, "");
	}
	
	public static int count(String t, String _s, int i, int c)
	{
		if (_s == "" || i == t.length() || c == _s.length()) {
			return c;
		}
		
		if (t.charAt(i) == _s.charAt(c)) {
			c++;
		}
		
		return count(t, _s, i+1, c);
	}
	
	public static int lcs(String s, String t, int sIndex, String _s)
	{
		if (sIndex == s.length()) {
			return count(t, _s, 0, 0);
		}
		
		return Math.max(lcs(s, t, sIndex+1, _s), lcs(s, t, sIndex+1, _s + s.charAt(sIndex)));
	}
	
	public static void main(String[] args) {
		System.out.println(lcs("bcwxftjg", "abcdefgh"));
		System.out.println(lcs("bcwxftjg", "xwd"));
		System.out.println(lcs("kmns", "abcdefgh"));
	}
}
