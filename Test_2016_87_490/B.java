package Test_2016_87_490;

public class B extends A {
	public B(int i) {
		super(i+1);
	}
	public boolean equals(B other) {
		System.out.println("B ");
		return ((other != null) && (_i == other._i));
	}
}
