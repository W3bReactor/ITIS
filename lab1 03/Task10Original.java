import java.util.Arrays;
public class Task10Original {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4};
		System.out.println(findEl(numArr,4 ));
	}
	public static boolean findEl(int[] numArr, int el) {
		for (int i = 0; i < numArr.length; i++) {
			if (el == numArr[i]) {
				return true;
			}
		}
		return false;

	}
}