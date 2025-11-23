import java.util.Arrays;
public class Task9 {
	public static void main(String[] args) {
		double[] numArr1 = {1, 2, 3, 4};
		printGist(numArr1);
	}
	// "x x x x"
	// "  x x x"
	// "    x x"
	// "      x"
	public static double findMax(double[] numArr ) {
		double mx = 0;
		for (int i = 0;  i < numArr.length; i++ ) {
			if (mx < numArr[i]) {
				mx = numArr[i];
			}
		}
		return mx;
	}
	public static void printGist(double[] numArr) {
		for (int i = 1; i <= findMax(numArr); i++) {
			for (int j = 0; j < numArr.length; j++) {
				if(numArr[j] < i) {
					System.out.print(" ");
				} else {
					System.out.print("x");
				}
			}
			System.out.println();

		}

	}
}