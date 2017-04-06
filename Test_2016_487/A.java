package Test_2016_487;

public class A
{
	private int _a;
	
	public A() {
		System.out.println("// A");
		_a = 1;
	}
	
	public void set(int j) {
		System.out.println("// A::set(j)");
		_a = j;
	}
	
	public void set() {
		System.out.println("// A::set()");
		set(2);
	}
	
	public int get() {
		System.out.println("// A::get()");
		return _a;
	}
	
	public void f1(A a) {
		System.out.println("// A::f1(A)");
		if (a instanceof B) {
			f1((B)a);
		} else {
			System.out.println("Nothing");
		}
	}
	
	public void f2(B b) {
		System.out.println("A::f2(B)");
	}
	
	public void f2(A a) {
		System.out.println("// A::f2(A)");
		f2((B)a);
	}
}