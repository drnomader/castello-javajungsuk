package ch4;

public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int s = 1;
		int num;

		for (int i = 1; true; i++, s =- s) {
			num = s * i;
			sum += num;

			if (sum >= 100) {
				break;
			}
		}
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
	}
}
