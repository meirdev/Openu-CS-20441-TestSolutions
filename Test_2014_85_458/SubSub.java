package Test_2014_85_458;

public class SubSub extends Sub {
	public SubSub() {
		super(1);
	}
	
	public boolean equals(SubSub s) {
		return (s != null) && (_i == s._i);
	}
	
	public boolean equals(Object o) {
		return (o != null) && (o instanceof SubSub) && (_i == ((SubSub)o)._i);
	}
	
	public static void main(String[] args)
	{
		Base b1 = new Base(1);
		Base b2 = b1;
		Base b3 = b2.foo();
		Base b4 = new Sub(1);
		Base b5 = b4.foo();
		Sub s1 = new Sub(1);
		Sub s2 = new SubSub();
		
		System.out.println(b1 == b3);
		System.out.println(b1.equals(b3));
		System.out.println(b1.equals(b4));
		System.out.println(b4.equals(b1));
		System.out.println(b5 == b4);
		System.out.println(b5.equals(b4));
		System.out.println(s1 == b4);
		System.out.println(s1.equals(b4));
		System.out.println(s2.equals(b4));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(b4.equals(s1));
	}
}
