import java.util.Arrays;
public class Task15 {
	public static void main(String[] args) {
		double[][] a = { {1,2,3}, {4, 5, 6.42}, {7, 8, 9} };
		double[][] b = { {1.5,2,3}, {4, 5, 6}, {7, 8, 15} };

		double[][] result = new double[a.length][];
		boolean perm = true;
		for(int i = 0; i < a.length; ++i) {

			result[i] = new double[b[i].length];
			double sum = 0;

			if (b.length == a[i].length) {
				for (int c = 0; c < b[i].length; ++c ) {
					for(int j = 0; j < a[i].length; ++j) {
						if ( c <= b[j].length - 1) {
							
							sum += b[j][c]*a[i][j];
						} else {
							perm = false;
							break;

						}
					}
					System.out.println(sum);
					result[i][c] = sum;
					sum = 0;

				}
				
			} else {
				perm = false;
				break;
			}
			

		}

		if(perm) {
			for (int i = 0; i < result.length; ++i) {
				System.out.println(Arrays.toString(result[i]));				
			}
		} else {
			System.out.println("Матрицы невозможно умножить!");

		}



	}
}