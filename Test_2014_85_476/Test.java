package Test_2014_85_476;

public class Test {
	public static void main(String[] args) {
		AA a = new AA();
		System.out.println(a._x);
		System.out.println(a.getX());
		
		BB b = new BB();
		System.out.println(b._x);
		System.out.println(b.getX());
		
		a = new BB();
		System.out.println(a._x);
		System.out.println(a.getX());
		
		b = (BB)a;
		System.out.println(b._x);
		System.out.println(b.getX());
	}
}
