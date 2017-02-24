package Test_2016_87_481;

public class B extends A {
	public int _a;
	private int _b;
	
	public B(int a, int b) {
		super(a, b);
		_a = a+1;
		_b = b+1;
	}
	
	public int getB() {
		return _b;
	}
	
	public int f() {
		return super.f();
	}
	
	public int f(int c) {
		return super.f(_b+c);
	}
	
	public String toString() {
		return "a= " + _a + " , b= " + _b;
	}
}
