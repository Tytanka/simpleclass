package by.htp.simpleclass.task01;

/*
 *  1) Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
 *  Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
*/

public class Test1 {
	private int x;
	private int y;

	public void init(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

	public int sum() {
		int temp;
		temp = x + y;
		return temp;

	}

	public int max() {
		if (x > y) {
			return x;
		} else {
			return y;

		}
	}
}
