import java.util.Arrays;
public class Task8 {
	public static void main(String[] args) {
		double[] numArr1 = {5, 2, 30, 5.5, 6, 3, 6, 2};
		System.out.println(Arrays.toString(createNewArr(numArr1)));
	}
	public static double[] createNewArr(double[] numArr) {
		double[] newArr = new double[numArr.length/3];
		if(numArr.length < 3) {
			return newArr;
		}

		for (int i = 2, p=0;  i < numArr.length; i+=3, ++p ) {
			newArr[p] = numArr[i];
		}

		return newArr;
	}
}