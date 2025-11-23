public class MainTriangleTest {
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.x = 0; 
		point1.y = 0; 

		Point point2 = new Point();
		point2.x = 2; 
		point2.y = 0; 

		Point point3 = new Point();
		point3.x = 1; 
		point3.y = Math.sqrt(3); 


		Triangle triangle = new Triangle();
		triangle.firstPoint = point1;
		triangle.secondPoint = point2;
		triangle.thirdPoint = point3;
		System.out.println(triangle.isEquilateral(5));
		System.out.println(triangle);
	}
} 