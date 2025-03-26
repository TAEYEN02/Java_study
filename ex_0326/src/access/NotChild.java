package access;

import ex05_inheritance.Parent;

public class NotChild {
	void accessTest() {
		Parent p2 = new Parent();
		//부모의  자식이 아니라 super을 써도 안됨
//		super.access();
//		p2.accessProtected();
	}
}
