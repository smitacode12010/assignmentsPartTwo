package questionThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionThree {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			arr.add(i);
		}
		sortLargestToSmallest(arr);
	}

	public static void sortLargestToSmallest(List<Integer> arr) {
		Collections.sort(arr);
		Collections.reverse(arr);
		System.out.println(arr);
	}

}
