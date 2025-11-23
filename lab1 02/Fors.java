public class Fors {
	public static void main(String[] args) {
		// Компилятор меняет i++ на ++i, чтобы оно работало быстрее
		// for(int i = 1; i < 10; i = i*2) {
		// 	System.out.println(i);
		// }
		float b = 0;
		int i = 0;
		for( ; i < 10; i++, b += 2.5) {
			System.out.println(i);
		}
		System.out.println(i);
		System.out.println(b);
	}
}