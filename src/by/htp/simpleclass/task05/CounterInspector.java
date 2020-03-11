package by.htp.simpleclass.task05;


public class CounterInspector {

	public static void main(String[] args) {
		Counter count = new Counter();
	
		count.print();
		count.positCount(18);
		count.print();
		count.negotCount(5);
		count.print();
		Counter count2 = new Counter(35);
		count2.print();
		count2.positCount(7);
		count2.print();
		count2.negotCount(2);
		count2.print();
	}

}
