
public class Arrays {
	public static void main (String[]args) {
		int[] arr = new int[4];
		arr[0]=98;
		arr[1]=2;
		arr[2] = 4;
		arr[3] = 9;
		
		int max = findMax(arr);
		System.out.println(max);
		System.out.println(findMin(arr));
		System.out.println(findAvg(arr));
		System.out.println(findCount(arr));

	}

	private static int findCount(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length;i++) {
			count++;
		}
		return count;
	}

	private static double findAvg(int[]arr) {
		double avg = 0;
		for (int i = 0; i < arr.length;i++) {
			avg+=arr[i];
		}
		return avg/arr.length;
	}

	private static int findMin(int[]arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length;i++) {
			if (min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length;i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
	
