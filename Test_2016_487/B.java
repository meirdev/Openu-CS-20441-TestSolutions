package Test_2016_487;

public class B extends A
{
	private int _a;
	private int _b;
	
	public B() {
		System.out.println("// B");
		_b = 100;
	}
	
	public B(int aa) {
		System.out.println("// B(int)");
		_a = aa;
	}
	
	public void set(int j) {
		System.out.println("// B::set(int)");
		_b = j;
	}
	
	public int get(int j) {
		System.out.println("// B::get(int)");
		return _b;
	}
	
	public void f1(B b) {
		System.out.println("B::f1(B)");
	}
	
	public void f1(Object o) {
		System.out.println("B::f1(Object)");
	}
	
	public void f2(B b) {
		System.out.println("B::f2(B)");
	}
}