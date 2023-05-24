package questionFour;

import java.util.LinkedList;
import java.util.List;

public class QuestionFour {

	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>();
		arr.add(5);
		arr.add(22);
		arr.add(1);
		arr.add(9);
		arr.add(8);
		arr.add(arr.size(), 9);

		System.out.println(arr);
	}

}
