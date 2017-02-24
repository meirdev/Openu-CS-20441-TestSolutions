package Test_2015_86_465;

public class Tester {

	public static void main(String[] args) {
		A[] arr = new A[4];
		arr[0] = new A();
		arr[1] = new A(1);
		arr[2] = new B();
		arr[3] = new B(1, 2);
		
		B[] arr1 = new B[2];
		arr1[0] = new B();
		arr1[1] = new B(1, 2);
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(i + "\t" + arr[i]);
		
		for (int i = 0; i < arr1.length; i++)
			System.out.println(i + "\t" + arr1[i]);
		
		System.out.println(arr[0].equals(arr[1]));
		System.out.println(arr[2].equals(arr[3]));
		System.out.println(arr1[0].equals(arr1[1]));
		System.out.println(arr1[0].equals(arr[0]));
		System.out.println(arr[0].equals(arr1[0]));
		System.out.println(arr1[1].equals(arr[0]));
		System.out.println(arr[0].equals(arr1[1]));
	}

}
