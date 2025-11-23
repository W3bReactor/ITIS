public class Task6 {
	public static void main(String[] args) {
		double[] numArr = {5, 2, 3, 5.5};
		System.out.println(findDiff(numArr));
	}
	public static double findDiff(double[] numArr ) {
		double sm1 = 0; 
		double sm2 = 0; 
		for (int i = 0, p = 0;  i < numArr.length; ++i, ++p ) {
			if (p % 2 == 0) {
				sm1 += numArr[i];
			} else {
				sm2 += numArr[i];
			}
		}

		double r = sm1 - sm2;
		if (r < 0) {
			return r * -1;
		}
		return r;
	}
}