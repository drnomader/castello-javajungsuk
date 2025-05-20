package ch6;

class Exercise6_22 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + " ? " + isNumber(str));

		str = "1234o";
		System.out.println(str + " ? " + isNumber(str));
	}

	public static boolean isNumber(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '0') {
				return false;
			}
		}

		return true;
	}
}