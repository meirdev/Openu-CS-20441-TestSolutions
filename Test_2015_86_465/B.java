package Test_2015_86_465;

public class B extends A {
	private int _y;
	
	public B() { _y = 2; }
	
	public B(int x, int y) {
		super(x);
		_y = y;
	}
	
	public int getX() { return super.getX(); }
	
	public int getY() { return _y; }
	
	public boolean equals(A other) {
		return (getX() == other.getX());
	}
	
	public boolean equals(B other) {
		return (getX() == other.getX()) && (getY() == other.getY());
	}
	
	public String toString() {
		return "x = " + getX() + " y = " + getY();
	}
}
