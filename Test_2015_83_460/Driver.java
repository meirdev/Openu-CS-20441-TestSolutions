package Test_2015_83_460;

public class Driver {

	public static void main(String[] args) {
		A x1 = new A(10);
		A y1 = new B(10);
		B y2 = new B(10);
		A z1 = new C(10);
		C z2 = new C(10);
		
		System.out.println(y1.equals(y2));
		System.out.println(y2.equals(y1));
		System.out.println(z1.equals(z2));
		System.out.println(z2.equals(z1));
		System.out.println(y2.equals(z2));
		System.out.println(z2.equals(y1));
		System.out.println(z2.equals(x1));
		System.out.println(x1.equals(z2));
	}

}
