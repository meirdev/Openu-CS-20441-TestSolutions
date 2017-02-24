package Test_2014_85_458;

public class Base {
	protected int _i = 0;
	
	public Base(int i) {
		_i = i;
	}
	
	public Base(Base b) {
		_i = b._i;
	}
	
	public Base foo() {
		return new Base(this);
	}
}
