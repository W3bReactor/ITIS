import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Введите направление движения u d l r (Для выхода нажмите x)");
			String c = sc.next();
			if (c.equals("u") || c.equals("U")) {
				System.out.println("Движемся наверх"); 
			} else if (c.equals("d") || c.equals("D"))  {
				System.out.println("Движемся вниз"); 
			} else if (c.equals("r") || c.equals("R"))  {
				System.out.println("Движемся направо"); 
			} else if (c.equals("l") || c.equals("L"))  {
				System.out.println("Движемся налево"); 
			} else if (c.equals("x") || c.equals("X")) {
				System.out.println("Вы вышли из игры"); 
				break;
			} else {
				System.out.println("Такого направления движения не существует");
			}

		}


	}

}