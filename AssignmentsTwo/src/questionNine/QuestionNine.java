package questionNine;

import java.util.HashMap;

public class QuestionNine {
	public static void main(String[] args) {
		HashMap<Integer, String> mapping = new HashMap<>();
		mapping.put(0, "How ");
		mapping.put(1, "many ");
		mapping.put(2, "things ");
		mapping.put(3, "are ");
		mapping.put(4, "in ");
		mapping.put(5, "me?");
		mapping.forEach((key, value) -> System.out.print(value));
		System.out.println("\nThe answer is: " + mapping.size());

	}
}
