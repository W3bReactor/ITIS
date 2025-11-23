public class Homework1 {
	public static void main(String[] args) {
		// e^x
		// float e = 1;
		// for (int i = 0; i < 5; i++) {

		// } 
		System.out.println(findExp(-2));

	}
	public static int factor(int num) {
		if (num == 0) {
			return 1;
		}
		if (num < 0) {
			num *= -1;
		}
		int res = 1;

		for (int i = 1; i <= num; ++i) {
			res *= i;
		}
		if (num < 0) {
			return res * -1;
		}
		return res;
	}
	public static double extent(int num, int degree) {
		if (degree == 0) {
			return 1;
		}
		if (degree < 0) {
			degree *= -1;
		}
		int res = num;
		for (int i = 1; i < degree; ++i) {
			res *=  num;
		}
		if (degree < 0) {
			return 1/res; 
		}
		return res;
	}

	public static double findExp(int x) {
		double e = 1;
		int i = 1;
		double checker = ((double) extent(x, i) / factor(i));
		while (!(  checker > -0.00001 && checker < 0.00001)) {
			e = e + extent(x, i) / (double) factor(i);
			checker = ((double) extent(x, i) / factor(i));
			i++;
		}
		return e;
	} 
}



