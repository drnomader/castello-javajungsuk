package ch6;

public class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard6_2 card1 = new SutdaCard6_2(3, false);
		SutdaCard6_2 card2 = new SutdaCard6_2();
		System.out.println(card1.info()); // 3 . 이 출력된다
		System.out.println(card2.info()); // 1K . 가 출력된다
	}
}

class SutdaCard6_2 {
	int num;
	boolean isKwang;

	SutdaCard6_2() {
		this(1, true); // SutdaCard(1, true) . 를 호출한다
	}

	SutdaCard6_2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	String info() { // . ( ) K . 숫자를 문자열로 반환한다 광 인 경우 를 덧붙인다 光
		return num + (isKwang ? "K" : "");
	}
}