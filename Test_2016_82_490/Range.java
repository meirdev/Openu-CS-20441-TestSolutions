package Test_2016_82_490;

public class Range {
	private int _smallest, _largest;
	
	public Range(int sm, int la)
	{
		_smallest = sm;
		_largest  = la;
	}
	
	public int getSmallest()
	{
		return _smallest;
	}
	
	public int getLargest()
	{
		return _largest;
	}
	
	public String toString()
	{
		return "smallest " + _smallest + " largest " + _largest;
	}
}
