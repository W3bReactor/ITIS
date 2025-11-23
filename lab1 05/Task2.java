import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		// String str = sc.next();
		// String substr = sc.next();
		String str = "инфарматико";
		String substr = "ин";

		System.out.println(findSubstring(str, substr));
	}

	public static int findSubstring(String str, String substr) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length() ; j++) {

				if(str.charAt(j) == substr.charAt(counter)) {
					counter += 1;
				} else {
					counter = 0;
				}
				if(counter == substr.length()) {
					return j-counter+1;
				}
			}
		}
		return -1;
	}
}