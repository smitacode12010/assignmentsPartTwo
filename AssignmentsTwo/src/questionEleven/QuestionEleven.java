package questionEleven;

public class QuestionEleven {
// NOTE TO SELF: Run this in debug to see how it works a bit better
	public static void main(String[] args) {
		int remainder = 0;
		int sum = 0;
		int temp = 0;

		int number = 454;
		boolean palindrome = false;
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (temp == sum) {
			palindrome = true;
		} else {
			palindrome = false;
		}

		System.out.println(palindrome);
	}

}
