public class Task4 {
	public static void main(String[] args) {
		double[] numArr = {5, 2, 3};
		System.out.println(findMiddle(numArr));
	}
	public static double findMiddle(double[] numArr ) {
		double sm = 0; 
		for (int i = 0;  i < numArr.length; i++ ) {
			sm += numArr[i];
		}
		return sm/numArr.length;
	}
}