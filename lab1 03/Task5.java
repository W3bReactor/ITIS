public class Task5 {
	public static void main(String[] args) {
		long[] numArr = {5, 2, 3, 50000000};
		System.out.println(findMiddle(numArr));
	}
	public static long findMiddle(long[] numArr ) {
		long sm = numArr[0]; 
		for (int i = 1;  i < numArr.length; i++ ) {
			sm *= numArr[i];
		}
		return sm;
	}
}