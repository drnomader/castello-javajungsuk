package ch6;

public class Exercise6_9 {}

class Marine {

	static int weapon = 6;
	static int armor = 0;

	int x = 0, y = 0;
	int hp = 60;

	static void weaponUp() {
		weapon++;
	}
	static void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
