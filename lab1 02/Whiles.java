public class Whiles {
	public static void main(String[] args) {
		short a = 0;
		while (true) {
			// if (a > 100) break;
			if (++a > 1000) return;
			System.out.println(a);		
		}

		// System.out.println("Цикл завершен");
	}
}