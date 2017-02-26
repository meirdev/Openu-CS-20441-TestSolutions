package Test_2016_82_490;

public class Question_5 {

	public static void main(String[] args) {
		IntNodeTwo i1 = new IntNodeTwo(2);
		IntNodeTwo i2 = new IntNodeTwo(4);
		i1.setNext(i2);
		i2.setPrev(i1);
		IntNodeTwo i3 = new IntNodeTwo(6);
		i2.setNext(i3);
		i3.setPrev(i2);
		IntNodeTwo i4 = new IntNodeTwo(1);
		i3.setNext(i4);
		i4.setPrev(i3);
		IntNodeTwo i5 = new IntNodeTwo(-3);
		i4.setNext(i5);
		i5.setPrev(i4);
		IntNodeTwo i6 = new IntNodeTwo(0);
		i5.setNext(i6);
		i6.setPrev(i5);
		IntNodeTwo i7 = new IntNodeTwo(2);
		i6.setNext(i7);
		i7.setPrev(i6);
		IntNodeTwo i8 = new IntNodeTwo(0);
		i7.setNext(i8);
		i8.setPrev(i7);
		IntNodeTwo i9 = new IntNodeTwo(-4);
		i8.setNext(i9);
		i9.setPrev(i8);
		IntNodeTwo i10 = new IntNodeTwo(5);
		i9.setNext(i10);
		i10.setPrev(i9);
		IntNodeTwo i11 = new IntNodeTwo(3);
		i10.setNext(i11);
		i11.setPrev(i10);
		
		IntListTwo l = new IntListTwo();
		l._head = i1;
		l._tail = i11;
		
		System.out.println(l);
		
		l.secret();
		
		System.out.println(l);
	}

}
