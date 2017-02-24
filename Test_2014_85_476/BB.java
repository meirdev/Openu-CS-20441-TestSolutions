package Test_2014_85_476;

public class BB extends AA
{
	private int _x;
	
	public BB()
	{
		this(2);
	}
	
	public BB(int k)
	{
		super(k+1);
		_x = super.getX() + 1;
	}
	
	public int getX()
	{
		return _x;
	}
}