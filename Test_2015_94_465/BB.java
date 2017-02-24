package Test_2015_94_465;

public class BB extends AA {
	private String _st;
	
	public BB() {
		_st = "bb";
	}
	
	public BB(String st, int val) {
		super(val);
		_st = st;
	}
	
	public String getSt() {
		return _st;
	}
	
	public boolean equals(Object ob) // 1
	{
		if ((ob != null) && (ob instanceof BB))
		{
			if (_st.equals(((BB)ob)._st) && (getVal() == ((BB)ob).getVal())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(AA ob) // 2
	{
		if ((ob != null) && (ob instanceof BB))
		{
			if (_st.equals(((BB)ob)._st) && (getVal() == ((BB)ob).getVal())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(BB ob) // 3
	{
		if (ob != null)
		{
			if (_st.equals(((BB)ob)._st) && (getVal() == ((BB)ob).getVal())) {
				return true;
			}
		}
		return false;
	}
}
