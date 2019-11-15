
public class Arrays {


	public static int findTotal(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length;i++) {
			total+= arr[i];
		}
		return total;
	}

	public static double findAvg(int[]arr) {
		double avg = 0;
		for (int i = 0; i < arr.length;i++) {
			avg+=arr[i];
		}
		return avg/arr.length;
	}

	public static int findMin(int[]arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length;i++) {
			if (min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length;i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
	
