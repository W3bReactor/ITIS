import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

/*
	Task 1 считывание из файла
	Task 2 Преобразование строки в число
	Task 3 Вывод картинки по трехмерному массиву

*/

// Вид:
		// {
		// 	{
		// 		{r, g, b},
		// 		{r, g, b}
		// 		...
		// 	}
		// }

public class Image {
	public static void main(String[] args) throws FileNotFoundException {
		int[][][] img = new int[74][80][3];
		Scanner scanner = new Scanner(new File("kow.rgb"));
		for (int i = 0; i < 74; i++) {
						
			for (int j = 0; j < 80; j++ ) {

				int color1 = toInt(scanner.next());
				int color2 = toInt(scanner.next());
				int color3 = toInt(scanner.next());


				img[i][j] = new int[]{ color1, color2, color3 };
				
			}
		}
		scanner.close();

        String RECTANGLE = "\u2588"; //0xDB;

		for (int i = 0; i < 74; i++) {
						
			for (int j = 0; j < 80; j++ ) {
				System.out.print("\033[38;2;" + img[i][j][0] + ";" + img[i][j][1] + ";" + img[i][j][2] + "m" + RECTANGLE + RECTANGLE);
				// System.out.println(Arrays.toString(img[i][j]));
			}
			System.out.println();

		}


	}

	public static int toInt(String color) {
			int num = 0;
			int ext = 1;
			for (int i = color.length() - 1; i >= 0; i-- ) {
				num += (color.charAt(i)-48) * ext; 
				ext *= 10;
			}
			return num;
	}
}