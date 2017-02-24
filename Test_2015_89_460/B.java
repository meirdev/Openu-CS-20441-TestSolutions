package Test_2015_89_460;
/*
public class B extends A {
	public boolean f(double x) {
		return x == 2.0;
	}
}

public abstract class B extends A {
	public boolean f(int x) {
		return x == 2;
	}
}

public class B extends A {
	public boolean f(int x) {
		return x == _num;
	}
}

public abstract class B extends A {
	public B(int n) {
		super(n);
	}
}

public abstract class B extends A {
	public B(int n) {
		n += getNum();
	}
}
*/
public class B extends A {
	public boolean f(int x)
	{
		Object obj1 = new A();
		(A)obj1.f(x);
	}
}