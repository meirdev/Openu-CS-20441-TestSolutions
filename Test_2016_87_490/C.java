package Test_2016_87_490;

public class C extends B {
	public C(int i) {
		super(i);
	}
	public boolean equals(Object other) {
		System.out.println("C ");
		return ((other != null) && (other instanceof C) && (_i == ((C)other)._i));
	}
}
