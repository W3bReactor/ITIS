import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Введите ваш пароль: ");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		String PASSWORD_PATTERN1 = "^[0-9a-zA-Z^$%@#&*!?]+";
		String PASSWORD_PATTERN2 = "^.{8,}";
		String PASSWORD_PATTERN3 = "^.*[A-Z]{1,}.*";
		String PASSWORD_PATTERN4 = "^.*[a-z]{1,}.*";
		String PASSWORD_PATTERN5 = "^.*[0-9]{1,}.*";
		System.out.printf("Паттерн 1 - %s\n", Pattern.matches(PASSWORD_PATTERN1, "dddDd**???^^^123"));
		System.out.printf("Паттерн 2 - %s\n", Pattern.matches(PASSWORD_PATTERN2, "dddDd**???^^^123"));
		System.out.printf("Паттерн 3 (без верхних регистров) - %s\n", Pattern.matches(PASSWORD_PATTERN3, "dddd**???^^^123"));
		System.out.printf("Паттерн 3 (с верхними регистрами) - %s\n", Pattern.matches(PASSWORD_PATTERN3, "Dddd**???^^^123"));
		System.out.printf("Паттерн 4 (без нижних регистров) - %s\n", Pattern.matches(PASSWORD_PATTERN4, "DDD**???^^^123"));
		System.out.printf("Паттерн 4 (с нижними регистрами) - %s\n", Pattern.matches(PASSWORD_PATTERN4, "Ddd**???^^^123"));
		System.out.printf("Паттерн 5 (без цифр) - %s\n", Pattern.matches(PASSWORD_PATTERN5, "Dddd**???^^^"));
		System.out.printf("Паттерн 5 (с цифрами) - %s\n", Pattern.matches(PASSWORD_PATTERN5, "Dddd**???^^^123"));

		System.out.println("Проверка вашего пароля:");
		System.out.printf("Паттерн 1 - %s\n", Pattern.matches(PASSWORD_PATTERN1, password));
		System.out.printf("Паттерн 2 - %s\n", Pattern.matches(PASSWORD_PATTERN2, password));
		System.out.printf("Паттерн 3 - %s\n", Pattern.matches(PASSWORD_PATTERN3, password));
		System.out.printf("Паттерн 4 - %s\n", Pattern.matches(PASSWORD_PATTERN4, password));
		System.out.printf("Паттерн 5 - %s\n", Pattern.matches(PASSWORD_PATTERN5, password));
	}
}