package Test_2015_83_460;

public class C extends A {
	
	public C(int n)
	{
		super(n);
	}
	
	public boolean equals(A a)
	{
		return a instanceof C && _num == a._num;
	}
}
