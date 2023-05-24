package questionTwelve;

import java.util.Scanner;

public class QuestionTwelve {

	static int value(char a) {
		if (a == 'm')
			return 1000;
		else if (a == 'd')
			return 500;
		else if (a == 'c')
			return 100;
		else if (a == 'l')
			return 50;
		else if (a == 'x')
			return 10;
		else if (a == 'v')
			return 5;
		else if (a == 'i')
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Roman numerals: ");
		String roman = in.nextLine();
		roman = roman.toLowerCase();
		int val = 0;
		int val_next = 0;
		int temp = 0;
		int result = 0;

		for (int i = 0; i < roman.length(); i++) {
			val = value(roman.charAt(i));
			if (i < roman.length() - 1) {
				val_next = value(roman.charAt(i + 1));
			} else
				val_next = 0;

			if (val_next == 0) {
				temp = val;
			} else {
				if (val > val_next) {
					temp = val;
				} else if (val < val_next) {
					temp = val_next - val;
					i++;
				} else if (val == val_next) {
					temp = val;
				}
			}
			result += temp;
		}
		System.out.println("Result is: " + result);
	}
	// NOTE TO SELF: Found result on Stack Overflow, am looking into ways to simplify this particular question and make it a bit more my own.
}
