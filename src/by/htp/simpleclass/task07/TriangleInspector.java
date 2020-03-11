package by.htp.simpleclass.task07;

public class TriangleInspector {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(2.0, 3.0, 4.0);
		TriangleView.printTriangle(triangle);
		double perimetr;
		perimetr = TriangleAction.getPerimetr(triangle);
		System.out.println("Периметр " + perimetr);
		double square;
		square = TriangleAction.getSquare(triangle);
		System.out.println("Площадь " + square);
		TriangleView.printMedianCross(triangle);

	}

}
