public class Task2 {
	public static void main(String[] args) {
		double[] numArr = {-5.3, -5, 0.5, 0.7, 1, 2, 5.8};
		System.out.println(findMin(numArr));
	}
	public static double findMin(double[] numArr ) {
		double mn = numArr[0];
		for (int i = 0;  i < numArr.length; i++ ) {
			if (mn > numArr[i]) {
				mn = numArr[i];
			}
		}
		return mn;
	}
}