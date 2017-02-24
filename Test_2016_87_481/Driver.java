package Test_2016_87_481;

public class Driver {

	public static void main(String[] args) {
		A aa = new A(0,1);
		A ab = new B(0,1);
		B bb = new B(-2,-1);
		
		//System.out.println(bb._b);
		//System.out.println(((B)aa).getB());
		System.out.println(((A)ab).getB());
		System.out.println(aa);
		System.out.println(aa.f(1));
		System.out.println(ab.f());
		System.out.println(bb.f(-1));
	}

}
