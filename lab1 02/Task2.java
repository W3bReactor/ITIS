public class Task2 {
	public static void main(String[] args) {
		int factor = 1;
		for(int i = 1; i <= 7; i++) {
			factor = factor*i;
		}
		System.out.println(factor);


		int sm = 1;
		for(int i = 1; i < 1000; i++) {
			sm += (1+i*5);
		}
		System.out.println(sm);


		int saved = 1;
		int cur = 1;
		int fib = 0;
		for(int i = 1; i <= 9; i++) {
			// System.out.println(fib+saved);
			System.out.println(fib);
			saved = cur;
			cur = fib;
			fib = saved+cur;
		}


	}	
}