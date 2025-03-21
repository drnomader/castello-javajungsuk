
package ch5;

import java.util.Scanner;

public class Exercise5_12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair"," "}, // words[0][0], words[0][1] 의자
				{"computer"," "}, // words[1][0], words[1][1] 컴퓨터
				{"integer"," "} // words[2][0], words[2][1] 정수
		};
		int score = 0; // 맞춘 문제의 수를 저장하기 위한 변수
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s ?", i+1, words[i][0]);
			String tmp = scanner.nextLine();
			if(tmp.equals(words[i][1])) {
				System.out.printf(" .%n%n");
				score++;
			} else {
				System.out.printf(" . %s .%n%n",words[i][1]);
			}
		} // for
		System.out.printf(" %d %d .%n", words.length, score);
	} // main
}
