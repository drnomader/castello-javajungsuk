package ch4;

public class Exercise4_1 {
	public static void main(String[] args) {
		int x = 15;
		char ch = 'a';
		char ch2 = 'x';
		char ch3 = '3';
		char ch4 = 'C';
		int year = 40;
		boolean powerOn = false;
		String str = "yes";

		System.out.println(10 < x && x < 20);
		System.out.println(ch != ' ' && ch != '\t');
		System.out.println(ch2 == 'x' || ch2 == 'X');
		System.out.println('0' <= ch3 && ch3 <= '9');
		System.out.println(('a' <= ch4 && ch4 <- 'z') || ('A' <= ch4 && ch4 <= 'Z'));
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		System.out.println(!powerOn);
		System.out.println(str.equals("yes"));
	}
}
