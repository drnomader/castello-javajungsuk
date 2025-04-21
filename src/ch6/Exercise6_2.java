package ch6;

public class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard6_2 card1 = new SutdaCard6_2(3, false);
		SutdaCard6_2 card2 = new SutdaCard6_2();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard6_2 {
	int num;
	boolean isKwang;

	SutdaCard6_2() {
		this(1, true);
	}

	SutdaCard6_2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() {
		return num + (isKwang ? "K" : "");
	}
}