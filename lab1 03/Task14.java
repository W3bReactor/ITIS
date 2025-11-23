import java.util.Arrays;
public class Task14 {
	public static void main(String[] args) {
		double[][] a = { {1,2,3}, {4, 5, 6}, {7, 8, 9} };
		double[][] b = { {1,2,3}, {4, 5, 6}, {7, 8, 15} };
		boolean equal = a.length == b.length;
		boolean fullEqual = true;
		double[][] result = new double[a.length][];
		if (equal) {
			for (int i = 0; i < a.length; ++i ) {
				// boolean checked = false;
				if (a[i].length == b[i].length) {
					// if (!checked) {
						result[i] = new double[a.length];
						// checked = true;
					// }

					for (int j = 0; j < a[i].length; ++j) {
						result[i][j] = a[i][j] + b[i][j]; 
					}
				} else {
					fullEqual = false;
					break;
				}
			}	
		}
		
		if(equal && fullEqual) {
			for (int i = 0; i < result.length; ++i) {
				System.out.println(Arrays.toString(result[i]));				
			}
		} else {
			System.out.println("Матрицы не совпадают по кол-ву строк и столбцов!");
		}
 		

		}
}