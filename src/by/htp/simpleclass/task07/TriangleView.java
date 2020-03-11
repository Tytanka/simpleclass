package by.htp.simpleclass.task07;

public class TriangleView {
	public static void printTriangle(Triangle triangle) {
		boolean correctValue = triangle.getSideA() > 0 && triangle.getSideB() > 0 && triangle.getSideC() > 0
				&& triangle.getSideA() + triangle.getSideB() > triangle.getSideC()
				&& triangle.getSideA() + triangle.getSideC() > triangle.getSideB()
				&& triangle.getSideC() + triangle.getSideB() > triangle.getSideA();
		if (correctValue) {
			System.out.println(
					"a= " + triangle.getSideA() + "; b= " + triangle.getSideB() + "; c= " + triangle.getSideC() + "; ");
		} else {
			System.out.println("Неверное зачение.Треугольник со сторонами" + triangle.getSideA() + " "
					+ triangle.getSideB() + " " + triangle.getSideC() + ", не существует. ");
		}
	}

	public static void printMedianCross(Triangle triangle) {
		System.out.println("Точка пересечения медиан  между сторонами:");
		System.out.println("ab " + TriangleAction.getmedianCrossAB(triangle) + "; bc "
				+ TriangleAction.getmedianCrossBC(triangle) + ";ac " + TriangleAction.getmedianCrossAC(triangle));
	}
}
