public class Line {
	// double x1;
	// double y1;
	// double x2;
	// double y2;
	Point startPoint;
	Point endPoint;


	void move(double deltaX, double deltaY) {
		startPoint.move(deltaX, deltaY);
		endPoint.move(deltaX, deltaY);
	}



	public String toString() {
		return "[" + startPoint.x + "; " + startPoint.y + "] [" + endPoint.x + "; " + endPoint.y + "]";
	}

}