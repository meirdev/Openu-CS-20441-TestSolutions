package Test_2016_82_490;

public class IntListTwo {
	public IntNodeTwo _head, _tail;
	
	public IntListTwo()
	{
		_head = null;
		_tail = null;
	}
	
	public String toString()
	{
		String l = "";
		IntNodeTwo temp = _head;
		
		while (temp != null) {
			l += temp.getNum() + ", ";
			temp = temp.getNext();
		}
		
		return l;
	}
	
	public void secret()
	{
		IntNodeTwo p1 = null;
		IntNodeTwo p2 = _head;
		IntNodeTwo p3 = null;
		int temp;
		
		do {
			if (p2.getNum()%3 == 1) {
				p2 = p2.getNext();
			}
			else if (p2.getNum()%3 == 0) {
				if (p1 == null) {
					p1 = _head;
				} else {
					p1 = p1.getNext();
				}
				temp = p1.getNum();
				p1.setNum(p2.getNum());
				p2.setNum(temp);
				p2 = p2.getNext();
			} else {
				if (p3 == null) {
					p3 = _tail;
				} else {
					p3 = p3.getPrev();
				}
				temp = p3.getNum();
				p3.setNum(p2.getNum());
				p2.setNum(temp);
			}
		} while (!((p2 == p3) || (p3 != null && p3.getNext() == p2)));
	}
}
