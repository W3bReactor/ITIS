import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class CodePage {
	public static void main(String[] args)  {
		String st = "0123456789абвгдеёжзАБВГДЕЁЖЗ";
		for(int i = 0; i < st.length(); i++ ) {
			System.out.println(st.charAt(i) + " - " + (int) st.charAt(i));
		}


	}
}