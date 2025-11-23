public class Homework1 {
	public static void main(String[] args) {
		// Нельзя делить на ноль 
		int b1 = 10;
		int c1 = 20;
		int ind = 2;
		int b2 = 5;
		int big = 20;

		int result1 = (b1 + c1) % (++b2 / b1++);
		System.out.println(result1);
	} 
}



