import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(compare(str1, str2));
	}

	public static boolean compare(String str1, String str2) {
		if(str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) != str2.charAt(i)) {
					return false;
				}
			}
			return true;

		}
		return false;
	}
}