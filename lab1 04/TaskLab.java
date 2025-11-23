import java.util.Scanner;
import java.util.Arrays;


public class TaskLab {
	public static void main(String[] args) {
		int[][] labRoom = {
			{1, 1, 1, 0, 1, 1, 1},
			{1, 1, 0, 0, 1, 0, 0},
			{1, 0, 0, 1, 1, 0, 1},
			{1, 0, 1, 1, 0, 0, 1},
			{1, 0, 0, 0, 0, 1, 1},
			{1, 1, 0, 1, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1}
		};
		game(labRoom, 3, 0, 6, 1);	

	}



	public static void game(int[][] labRoom, int currPositionX, int currPositionY, int finishX, int finishY) {
		String[][] currRoom = {
			{"?", "?", "?", "x", "?", "?", "?"},
			{"?", "?", "?", "?", "?", "?", "?"},
			{"?", "?", "?", "?", "?", "?", "?"},
			{"?", "?", "?", "?", "?", "?", "?"},
			{"?", "?", "?", "?", "?", "?", "?"},
			{"?", "?", "?", "?", "?", "?", "?"},
			{"?", "?", "?", "?", "?", "?", "?"}
		};
		Scanner sc = new Scanner(System.in);
		boolean stopped = false;
		if(labRoom[currPositionY][currPositionX] != 0) {
			System.out.println("Выбрана неправильная начальная позиция!");
			return;
		}
		if(labRoom[finishY][finishX] != 0) {
			System.out.println("Выбрана неправильная финишная позиция!");
			return;
		}
		int steps = 0;
		while (!stopped) {
			System.out.println("Введите направление движения u d l r (Для выхода нажмите x)");
			String c = sc.next();
			switch (c){
				case "U":
				case "u":
					steps+=1;
					if (currPositionY == 0) {
						System.out.println("Вы и так в самом верху лабиринта!");
						break;
					}
					if (labRoom[currPositionY-1][currPositionX] == 1) {
						System.out.println("Сверху стена!"); 
						
						currRoom[currPositionY-1][currPositionX] = "%";
					} else {
						System.out.println("Движемся вверх"); 
						currRoom[currPositionY][currPositionX] = "0";
						currPositionY -= 1;
						currRoom[currPositionY][currPositionX] = "X";
					}
					System.out.println("Известные позиции:");
					for (int i = 0; i < currRoom.length; ++i) {
					  	System.out.println(Arrays.toString(currRoom[i]));
					 }

					 if(finishY == currPositionY && finishX == currPositionX) {
					 	stopped = true;
					 	System.out.println("Вы выиграли!")	;
					 }
					break;
				case "D":
				case "d":
					steps+=1;
					if (currPositionY == labRoom.length - 1) {
						System.out.println("Вы и так в самом низу лабиринта!");
						break;
					}
					if (labRoom[currPositionY+1][currPositionX] == 1) {
						System.out.println("Снизу стена!"); 
						
						currRoom[currPositionY+1][currPositionX] = "%";
					} else {
						System.out.println("Движемся вниз"); 
						currRoom[currPositionY][currPositionX] = "0";
						currPositionY += 1;
						currRoom[currPositionY][currPositionX] = "X";
					}
					System.out.println("Известные позиции:");
					for (int i = 0; i < currRoom.length; ++i) {
					  	System.out.println(Arrays.toString(currRoom[i]));
					 }
					 if(finishY == currPositionY && finishX == currPositionX) {
					 	stopped = true;
					 	System.out.println("Вы выиграли!");
					 }
					break;
				case "R":
				case "r":
					steps+=1;
					if (currPositionX == labRoom[currPositionY].length - 1) {
						System.out.println("Вы и так в самом правом углу лабиринта!");
						break;
					}
					if (labRoom[currPositionY][currPositionX+1] == 1) {
						System.out.println("Справа стена!"); 
						
						currRoom[currPositionY][currPositionX+1] = "%";
					} else {
						System.out.println("Движемся вправо"); 
						currRoom[currPositionY][currPositionX] = "0";
						currPositionX += 1;
						currRoom[currPositionY][currPositionX] = "X";
					}
					System.out.println("Известные позиции:");
					for (int i = 0; i < currRoom.length; ++i) {
					  	System.out.println(Arrays.toString(currRoom[i]));
					 }
					 if(finishY == currPositionY && finishX == currPositionX) {
					 	stopped = true;
					 	System.out.println("Вы выиграли!");
					 }
					break;
				case "L":
				case "l":
					steps+=1;
					if (currPositionX == 0) {
						System.out.println("Вы и так в самом левом углу лабиринта!");
						break;
					}
					if (labRoom[currPositionY][currPositionX-1] == 1) {
						System.out.println("Слева стена!"); 
						
						currRoom[currPositionY][currPositionX-1] = "%";
					} else {
						System.out.println("Движемся влево"); 
						currRoom[currPositionY][currPositionX] = "0";
						currPositionX -= 1;
						currRoom[currPositionY][currPositionX] = "X";
					}
					System.out.println("Известные позиции:");
					for (int i = 0; i < currRoom.length; ++i) {
					  	System.out.println(Arrays.toString(currRoom[i]));
					 }
					 if(finishY == currPositionY && finishX == currPositionX) {
					 	stopped = true;
					 	System.out.println("Вы выиграли!");
					 }
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
		System.out.println("Кол-во шагов: " + steps);
	}
}