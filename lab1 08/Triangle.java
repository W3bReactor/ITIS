public class Triangle {
	Point firstPoint;
	Point secondPoint;
	Point thirdPoint;


	double sideLength(Point point1, Point point2, int accuracy) {
		return Math.round((Math.sqrt(Math.pow((point1.x - point2.x), 2) + Math.pow((point1.y - point2.y), 2))) * Math.pow(10, accuracy)) / Math.pow(10, accuracy);

	}

	boolean isEquals(double a, double b, int accuracy) {
		return Math.abs(a-b) < 0.0000001;
	}

	boolean isEquilateral (int accuracy) {
		if(firstPoint == null || secondPoint == null || thirdPoint == null) {
			System.out.println("Пожалуйста, задайте точки треугольника");
			return false;
		}

		double side1 = sideLength(firstPoint, secondPoint, accuracy);
		double side2 = sideLength(secondPoint, thirdPoint, accuracy);
		double side3 = sideLength(thirdPoint, firstPoint, accuracy);
		System.out.println(side1);
		System.out.println(side2);
		System.out.println(side3);
		if (side1 == side2 && side2 == side3) {
			return true;
		}
		return false;

	} 

	public String toString() {
		return "[" + firstPoint.x + "; " + firstPoint.y + "] " + " [" + secondPoint.x + "; " + secondPoint.y + "] " + " [" + thirdPoint.x + "; " + thirdPoint.y + "]";
	}

}