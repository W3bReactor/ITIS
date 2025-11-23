public class MainLineTest {
	public static void main(String[] args) {
		Line line = new Line();

		Point pointStart = new Point();
		pointStart.x = 5;
		pointStart.y = 5;
		Point pointEnd = new Point();
		pointEnd.x = 10;
		pointEnd.y = 10;

		line.startPoint = pointStart;
		line.endPoint = pointEnd;
//        Object


		System.out.println(line);


		// System.out.println(line.startPoint);
		// System.out.println(line.endPoint);

		line.move(1, 2);

//		System.out.println(line.startPoint.toString());
//		System.out.println(line.endPoint.toString());

	}
}