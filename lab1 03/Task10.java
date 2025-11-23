import java.util.Arrays;
public class Task10 {
	public static void main(String[] args) {
		int[] numArr1 = {1, 2, 3, 4};
		int[] numArr2 = {1, 2, 3, 4};
		compareArrs(numArr1, numArr2);
	}
	public static void compareArrs(int[] numArr1, int[] numArr2) {
		int ind = 0; 
		boolean odin = true;
		for (int i = 0; i < numArr1.length; i++) {
			if (numArr1[i] != numArr2[i]) {
				ind = i;
				odin = false;
				break;
			}

		}
		if(odin == true) {
			System.out.println("Одинаковые");
		} else {
			System.out.println(ind);
		}

	}
}