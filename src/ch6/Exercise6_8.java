package ch6;

public class Exercise6_8 {
}

class PlayingCard {

	static int width;
	static int height;

	int kind;
	int num;

	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}

	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1,1);
	}
}
