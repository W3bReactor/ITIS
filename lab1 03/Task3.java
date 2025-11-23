public class Task3 {
	public static void main(String[] args) {
		double[] numArr = {-5.3, -5, 0.5, 0.7, 1, 2, 5.8};
		System.out.println(findSum(numArr));
	}
	public static double findSum(double[] numArr ) {
		double sm = 0; 
		for (int i = 0;  i < numArr.length; i++ ) {
			sm += numArr[i];
		}
		return sm;
	}
}