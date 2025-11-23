import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regular2 {
	public static void main(String[] args) {
		// Жадный режим по максимуму
		// Первый попавшийся под руку
		String workStr = "Hello Java! Hello JavaScript! JavaSE 8.";
		// Для многоократного использование шаблон
		Pattern pattern = Pattern.compile("[Jj].+?a"); 
		Matcher matcher = pattern.matcher(workStr);
		int counter = 1;
		while(matcher.find()) {
			// end = position-1
			System.out.println(counter + ": (" +
				matcher.start() + ", " + matcher.end() + ") "
				+ workStr.substring(matcher.start(), matcher.end())
				);
			counter++;
		}
	}
}