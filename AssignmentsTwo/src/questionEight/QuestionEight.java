package questionEight;

import java.util.HashMap;

public class QuestionEight {

	public static void main(String[] args) {
		HashMap<Integer, String> foolsGold = new HashMap<Integer, String>();
		foolsGold.put(1, "Where");
		foolsGold.put(2, "is");
		foolsGold.put(3, "Nepal?");
		if(foolsGold.isEmpty()) {
			System.out.println("Nothing in here");
		} else {
			System.out.println("Something is here: ");
			foolsGold.forEach((key, value) -> System.out.print(value + " "));
		}
	}

}
