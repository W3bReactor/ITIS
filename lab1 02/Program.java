public class Program {
	public static void main(String[] args) {
// 		int a = -1;
		
// 		if (-3 < a && a < 3) 
// 			System.out.println("Раскрыли модуль числа " + a); 
// 			// System.out.println("Раскрыли модуль числа " + a); - нельзя т.к макс разрешен 1
// 		 else 
// 			System.out.println("False"); 



// // 		U - вверх, D - внзи, R - право, L - лево
// 		char c = 'R';
		
// 		if (c == 'u' || c == 'U') {
// 			System.out.println("Движемся наверх"); 
// 		} else if (c == 'd' || c == 'D')  {
// 			System.out.println("Движемся вниз"); 
// 		} else if (c == 'r' || c == 'R')  {
// 			System.out.println("Движемся направо"); 
// 		} else if (c == 'l' || c == 'L')  {
// 			System.out.println("Движемся налево"); 
// 		}

		int b = 10;
		//  || - lazy или && - lazy и
		
		if (b > 50 && ((5/0) == 0) ) {
			System.out.println("Условие выполнено; b = " + b); 
		}


	}
} 