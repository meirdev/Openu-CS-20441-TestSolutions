package Test_2016_87_490;

public class DriverABCD {

	public static void main(String[] args) {
		A a = new A(1);
		B b = new B(1);
		C c = new C(1);
		D d = new D(1);
		D d2 = new D(1);
		B b1 = new D(1);
		Object c1 = new C(1);
		Object d1 = new D(1);
		a = c;
		
		System.out.println(b1.equals(b));
		System.out.println(c1.equals(c));
		System.out.println(d1.equals(d));
		System.out.println(d.equals(d1));
		System.out.println(c.equals(c1));
		System.out.println(a.equals(c));
		System.out.println(c.equals(a));
		System.out.println(b.equals(c));
		System.out.println(b.equals(b1));
		System.out.println(b.equals(a));
		System.out.println(d1.equals(b));
	}

}
