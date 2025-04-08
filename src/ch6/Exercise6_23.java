package ch6;

class Exercise6_23{
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println(" : " + max(data));
		System.out.println(" : " + max(null));
		System.out.println(" : " + max(new int[]{})); // 최대값 크기가 0인 배열
	}

	public static int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -999999;
		}
		int max = arr[0]; // 배열의 첫 번째 값으로 최대값을 초기화
		for (int i = 1; i < arr.length; i++) { // 배열의 두 번째 값부터 비교
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}