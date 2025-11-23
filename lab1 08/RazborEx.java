public class RazborEx {
	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3},
			{4,5,6,7},
			{0,2}
		};

		System.out.println(findMaxAverage(arr));
		System.out.println(greet());
	}

	// Можно не добавлять public (По умолчанию)
	static String greet() {
		return "!Hello world";
	}

	public static double avg(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	public static double findMaxAverage(int[][] arr) {
		double maxEl = 0; 

		// Оптимизация 
		// n = arr.length
		// А затем сделать i < n
		for (int i = 0; i < arr.length; ++i) {
			double average = avg(arr[i]);
			if(average > maxEl) {
				maxEl = average;
			}
		}
		return maxEl;
	}	



}