import java.util.Scanner;
import java.util.Arrays;


public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean stopped = false;
		while (!stopped) {
			System.out.println("Введите направление движения u d l r (Для выхода нажмите x)");
			String c = sc.next();
			switch (c){
				case "U":
				case "u":
					System.out.println("Движемся наверх"); 
					break;
				case "D":
				case "d":
					System.out.println("Движемся вниз"); 
					break;
				case "R":
				case "r":
					System.out.println("Движемся направо"); 
					break;
				case "L":
				case "l":
					System.out.println("Движемся налево"); 
					break;
				case "X":
				case "x":
					System.out.println("Программа завершена"); 
					stopped = true;
					break;
				default:
					System.out.println("Такого направления движения не существует");
			}
			if(stopped) {
				break;
			}
		}

	}
}