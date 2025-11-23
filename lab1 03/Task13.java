import java.util.Arrays;
public class Task13 {
	public static void main(String[] args) {
		int[] numArr1 = {1, 2, 3, 4};
		int[] numArr2 = {1, 4, 3, 2};
		scal(numArr1, numArr2);
	}
	public static void scal(int[] numArr1, int[] numArr2) {
		int res = 0;
		for (int i = 0; i < numArr1.length; i++) {
			res += numArr1[i]*numArr2[i];
		}
		System.out.println(res);

	}
}