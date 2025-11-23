import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String str1 = "инфё";
		String str2 = "инфЁ";

		System.out.println(compareDictionary(str1, str2));
	}
// Shift + tab - смещение эл-тов влево
	public static int compareDictionary(String str1, String str2) {
		int minlen = str1.length() > str2.length() ? str1.length() : str2.length();
		for (int i = 0; i < minlen; i++ ) {
			// if (str1.charAt(i) == 'ё' && str2.charAt(i) > 'e') {
			// 	return -1;
			// }
			// if (str1.charAt(i) == 'Ё' && str2.charAt(i) > 'E') {
			// 	return -1;
			// }
			// if (str2.charAt(i) == 'ё' && str1.charAt(i) > 'e') {
			// 	return 1;
			// }
			// if (str2.charAt(i) == 'Ё' && str1.charAt(i) > 'E') {
			// 	return 1;
			// }

			if(str1.charAt(i) > str2.charAt(i)) {
				return 1;
			} else if (str1.charAt(i) < str2.charAt(i)) {
				return -1;
			}
			if(i == minlen - 1 && str1.length() > str2.length()) {
				return 1;
			} else if (i  == minlen - 1 && str1.length() < str2.length()) {
				return -1;
			}
		}
		return 0;
		// int weight1 = 0;
		// int weight2 = 0;
		// for (int i = 0; i < str1.length(); i++) {
		// 	weight1 += (int) str1.charAt(i);
		// }
		// for (int i = 0; i < str2.length(); i++) {
		// 	weight2 += (int) str2.charAt(i);
		// }
		// if(weight1 > weight2) {
		// 	return 1;
		// } else if (weight1 < weight2) {
		// 	return -1;
		// } else {
		// 	return 0;
		// }

	}
}