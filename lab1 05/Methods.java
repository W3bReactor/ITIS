import java.util.Arrays;
public class Methods {
	public static void main(String[] args) {
		int max = max(1, 2);
		System.out.println(max);
		int[] arr = {1, 2, 3};
		System.out.println(Arrays.toString(reverseArr(arr)));
		// Массив поменяется
		replace(arr, 1, 3);
		System.out.println(Arrays.toString(arr));
	}
	 static int max(int a, int b) {
		return a > b ? a : b;
	}
	public static int[] reverseArr(int[] arr) {
		int[] reversedArr = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i-- ) {
			reversedArr[arr.length - i - 1] = arr[i];
		}
		return reversedArr;
	}

	public static void replace(int[] arr, int pos, int element) {
		arr[pos] = element;
		System.out.println(Arrays.toString(arr));
	}
	
}