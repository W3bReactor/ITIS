import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу проверку: ");
        String date = sc.next();

		String DAYS = "(([1-9])|([1-2][0-9])|(3[01]))";
        String MONTHS = "(([1-9])|(1[0-2]))";
        String MONTHS_RIM = "((I{1,3})|(IV)|(VI{0,3})|(I?X)|(XI{1,2}))";
        String YEARS = "([1-9][0-9]{0,3})";
//        String YEARS = "(([0-9]{3}[1-9])|([1-9][0-9]{3}))";
        String YEARS_MINI = "([0-9]{2})";
        String DATE_PATTERN1 = "^(" + DAYS + "." + MONTHS + "." + YEARS + ")";
        String DATE_PATTERN2 = "^(" + DAYS + "." + MONTHS + "." + YEARS_MINI + ")";
        String DATE_PATTERN3 = "^(" + YEARS + "-" + MONTHS + "-" + DAYS + ")";
        String DATE_PATTERN4 = "^(" + DAYS + "." + MONTHS_RIM + "." + YEARS + ")";
        System.out.println("Шаблон: dd.MM.yyyy");
        System.out.println("11.11.1111 " + Pattern.matches(DATE_PATTERN1, "11.11.1111"));
        System.out.println("11.11.1 " + Pattern.matches(DATE_PATTERN1, "11.11.1"));
        System.out.println("11.13.1 " + Pattern.matches(DATE_PATTERN1, "11.13.1"));
        System.out.println("0.12.1 " + Pattern.matches(DATE_PATTERN1, "0.12.1"));
        System.out.println("31.12.1 " + Pattern.matches(DATE_PATTERN1, "31.12.1"));
        System.out.println("33.12.1 " + Pattern.matches(DATE_PATTERN1, "33.12.1"));
        System.out.println("Ваша проверка: " + Pattern.matches(DATE_PATTERN1, date));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Шаблон: dd.MM.yy");
        System.out.println("11.11.1111 " + Pattern.matches(DATE_PATTERN2, "11.11.1111"));
        System.out.println("11.11.1 " + Pattern.matches(DATE_PATTERN2, "11.11.1"));
        System.out.println("11.13.1 " + Pattern.matches(DATE_PATTERN2, "11.13.1"));
        System.out.println("0.12.1 " + Pattern.matches(DATE_PATTERN2, "0.12.1"));
        System.out.println("31.12.1 " + Pattern.matches(DATE_PATTERN2, "31.12.1"));
        System.out.println("33.12.1 " + Pattern.matches(DATE_PATTERN2, "33.12.1"));
        System.out.println("Ваша проверка: " + Pattern.matches(DATE_PATTERN2, date));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Шаблон: yyyy-MM-dd");
        System.out.println("11.11.1111 " + Pattern.matches(DATE_PATTERN3, "11.11.1111"));
        System.out.println("11-11-1 " + Pattern.matches(DATE_PATTERN3, "11-11-1"));
        System.out.println("11-13-1 " + Pattern.matches(DATE_PATTERN3, "11-13-1"));
        System.out.println("0-12-1 " + Pattern.matches(DATE_PATTERN3, "0-12-1"));
        System.out.println("31-12-1 " + Pattern.matches(DATE_PATTERN3, "31-12-1"));
        System.out.println("33-12-1 " + Pattern.matches(DATE_PATTERN3, "33-12-1"));
        System.out.println("Ваша проверка: " + Pattern.matches(DATE_PATTERN3, date));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Шаблон: dd/V/yyyy");
        System.out.println("11.11.1111 " + Pattern.matches(DATE_PATTERN4, "11.11.1111"));
        System.out.println("11/V/1 " + Pattern.matches(DATE_PATTERN4, "11/V/1"));
        System.out.println("11/XI/1 " + Pattern.matches(DATE_PATTERN4, "11/XI/1"));
        System.out.println("0/IVI/1 " + Pattern.matches(DATE_PATTERN4, "0/IVI/1"));
        System.out.println("31/XII/1 " + Pattern.matches(DATE_PATTERN4, "31/XII/1"));
        System.out.println("1/XIII/1 " + Pattern.matches(DATE_PATTERN4, "1/XIII/1"));
        System.out.println("Ваша проверка: " + Pattern.matches(DATE_PATTERN4, date));
        System.out.println("--------------------------------------------------------------");
	}
}