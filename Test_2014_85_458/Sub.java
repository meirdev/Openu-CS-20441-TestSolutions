package Test_2014_85_458;

public class Sub extends Base {
	public Sub(int i) {
		super(i);
	}
	
	public Sub(Sub s) {
		super(s._i*2);
	}
	
	public Base foo() {
		return this;
	}
	
	public boolean equals(Object o) {
		return ((Sub)o)._i == _i;
	}
}
