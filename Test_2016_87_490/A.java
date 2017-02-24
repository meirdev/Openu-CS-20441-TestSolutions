package Test_2016_87_490;

public class A {
	protected int _i;
	
	public A(int i) {
		_i = i;
	}
	
	public boolean equals(A other) {
		System.out.println("A ");
		return ((other != null) && (_i == other._i));
	}
}
