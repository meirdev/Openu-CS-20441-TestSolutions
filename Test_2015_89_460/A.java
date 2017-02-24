package Test_2015_89_460;

public abstract class A {
	private int _num;
	
	public A() {
		_num = 2;
	}
	
	public int getNum() {
		return _num;
	}
	
	public abstract boolean f(int x);
}
