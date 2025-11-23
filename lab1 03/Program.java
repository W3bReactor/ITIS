public class Program {
	public static void main(String[] args) {
		int[] d = new int[5]; // Выделили память
		d[0] = 1;
		d[1] = 3;
		for (int i = 0; i < d.length; ++i) {
			System.out.println(d[i]);
		}


		int[] b = new int[] {1,2,3,4};
		int[] c = {0,2,3,4};
		System.out.println(b);
		for (int i = 0; i < b.length; ++i) {
			System.out.println(b[i]);
		}
		for (int i = 0; i < b.length; ++i) {
			System.out.println(c[i]);
		}
	}
}