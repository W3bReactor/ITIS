public class Task1 {
	public static void main(String[] args) {
		double[] numArr = {-5, 0.5, 0.7, 1, 2, 5.8};
		System.out.println(findMax(numArr));
	}
	public static double findMax(double[] numArr ) {
		double mx = 0;
		for (int i = 0;  i < numArr.length; i++ ) {
			if (mx < numArr[i]) {
				mx = numArr[i];
			}
		}
		return mx;
	}
}