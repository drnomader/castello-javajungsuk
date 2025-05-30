package ch6;

class Exercise6_23{
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};

		System.out.println(java.util.Arrays.toString(data));
		System.out.println(" : " + max(data));
		System.out.println(" : " + max(null));
		System.out.println(" : " + max(new int[]{}));
	}

	public static int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -999999;
		}

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		return max;
	}
}