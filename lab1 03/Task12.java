import java.util.Arrays;
public class Task12 {
	public static void main(String[] args) {
		int[] numArr1 = {1, 2, 3, 4};
		int[] numArr2 = {1, 4, 3, 2};
		compareArrs(numArr1, numArr2);
	}
	public static void compareArrs(int[] numArr1, int[] numArr2) {
		boolean ind = true; 
		for (int i = 0; i < numArr1.length; i++) {
			boolean finded = false; 
			for (int j = 0; j < numArr2.length; j++) {
				if (numArr1[i] ==  numArr2[j]) {
					finded = true;
				}	
			}
			if (!finded) {
				ind = false;
			}
		}
		if(ind) {
			System.out.println("Эквивалентны");
		} else {
			System.out.println("Различны");
		}

	}
}