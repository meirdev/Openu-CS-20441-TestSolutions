package Test_2016_487;

public class C extends A
{
	public void f2() {
		System.out.println("C::f2()");
	}
	
	public void f3(A a) {
		System.out.println("// C::f3(A)");
		f2();
	}
}