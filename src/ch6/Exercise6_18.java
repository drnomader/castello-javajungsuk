package ch6;

public class Exercise6_18 {
}

class MemberCall {
	int iv = 10;
	int iv2 = cv;

	static int cv = 20;
	//static int cv2 = iv; // 컴파일 에러

	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); // 컴파일 에러
	}

	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // 컴파일 에러
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}