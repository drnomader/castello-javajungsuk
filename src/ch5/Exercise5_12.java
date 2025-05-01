
package ch5;

import java.util.Scanner;

public class Exercise5_12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair"," "},
				{"computer"," "},
				{"integer"," "}
		};
		int score = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s ?", i + 1, words[i][0]);
			String tmp = scanner.nextLine();
			if (tmp.equals(words[i][1])) {
				System.out.printf(" .%n%n");
				score++;
			} else {
				System.out.printf(" . %s .%n%n",words[i][1]);
			}
		}
		System.out.printf(" %d %d .%n", words.length, score);
	}
}
