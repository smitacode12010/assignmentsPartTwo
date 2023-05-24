package questionSix;

import java.util.LinkedList;
import java.util.List;

public class QuestionSix {

	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int hold1 = arr.get(2);
		int hold2 = arr.get(3);
		arr.set(2, hold2);
		arr.set(3, hold1);
		System.out.println(arr);

	}

}
