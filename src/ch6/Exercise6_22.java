package ch6;

class Exercise6_22 {
	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
		for(int i=0; i< str.length();i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		} // for
		return true;
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+" ? "+isNumber(str));
		str = "1234o";
		System.out.println(str+" ? "+isNumber(str));
	}
}