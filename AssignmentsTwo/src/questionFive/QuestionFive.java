package questionFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QuestionFive {

	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>();
		arr.add(5);
		arr.add(22);
		arr.add(1);
		arr.add(9);
		arr.add(8);
		arr.add(arr.size(), 9);
		reverseLinkedList(arr);
	}

	public static void reverseLinkedList(List<Integer> arr) {
		Collections.reverse(arr);
		System.out.println(arr);
	}

}
