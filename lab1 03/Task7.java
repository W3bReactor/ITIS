import java.util.Arrays;
public class Task7 {
	public static void main(String[] args) {
		double[] numArr1 = {5, 2, 3, 5.5};
		double[] numArr2 = {7, 3, 2};
		System.out.println(Arrays.toString(createNewArr(numArr1, numArr2)));
	}
	public static double[] createNewArr(double[] numArr1, double[] numArr2 ) {
		double[] newArr = new double[(numArr1.length + numArr2.length)];
		for (int i = 0;  i < numArr1.length; i++ ) {
			newArr[i] = numArr1[i];
		}
		for (int i = numArr1.length, j = 0;  i < numArr1.length + numArr2.length; i++, j++ ) {
			newArr[i] = numArr2[j];
		}

		return newArr;
	}
}