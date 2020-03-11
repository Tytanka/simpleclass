package by.htp.simpleclass.task07;

public class TriangleAction {

	public static double getPerimetr(Triangle triangle) {

		double P;
		double sidea;
		double sideb;
		double sidec;

		sidea = triangle.getSideA();
		sideb = triangle.getSideB();
		sidec = triangle.getSideC();

		P = sidea + sideb + sidec;

		return P;
	}

	public static double getSquare(Triangle triangle) {
		double p;
		double S;
		p = (getPerimetr(triangle) / 2);
		S = Math.sqrt(p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()));
		return S;
	}

	public static double getmedianCrossAB(Triangle triangle) {
		double medianAB = Math.sqrt(2 * Math.pow(triangle.getSideA(), 2) + 2 * Math.pow(triangle.getSideB(), 2)
				- Math.pow(triangle.getSideC(), 2)) / 2;
		double medianCrossAB = (medianAB / 3) * 2;
		return medianCrossAB;
	}

	public static double getmedianCrossBC(Triangle triangle) {
		double medianBC = Math.sqrt(2 * Math.pow(triangle.getSideB(), 2) + 2 * Math.pow(triangle.getSideC(), 2)
				- Math.pow(triangle.getSideA(), 2)) / 2;
		double medianCrossBC = (medianBC / 3) * 2;
		return medianCrossBC;
	}

	public static double getmedianCrossAC(Triangle triangle) {
		double medianAC = Math.sqrt(2 * Math.pow(triangle.getSideA(), 2) + 2 * Math.pow(triangle.getSideC(), 2)
				- Math.pow(triangle.getSideB(), 2)) / 2;
		double medianCrossAC = (medianAC / 3) * 2;
		return medianCrossAC;
	}
}
