package Test_2016_82_490;

public class BB extends AA {
	private String _st;
	public BB() {
		_st = "BB";
	}
	public BB(String st, char ch) {
		super(ch);
		_st = st;
	}
	public boolean equals(Object o) {
		System.out.print("1 ");
		if ((o != null) && (o instanceof BB))
		{
			if (_st.equals(((BB)o)._st) && (getCh() == ((BB)o).getCh())) {
				return true;
			}
		}
		return false;
	}
	public boolean equals(BB b)
	{
		System.out.print("2 ");
		if (b != null)
		{
			if (_st.equals(b._st) && (getCh() == b.getCh())) {
				return true;
			}
		}
		return false;
	}
	public boolean equals(AA a)
	{
		System.out.print("3 ");
		if (a != null)
		{
			if (getCh() == a.getCh()) {
				return true;
			}
		}
		return false;
	}
}
