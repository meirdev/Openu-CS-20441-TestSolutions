package Test_2015_86_465;

public class A {
	private int _x;
	
	public A() { _x = 1; }
	public A(int x) { _x = x; }
	
	public int getX() { return _x; }
	
	public String toString() {
		return "x = " + getX();
	}
}
