package questionTen;

public class QuestionTen {
	
	public static void main(String[] args) {
		int[] arrInt = {2, 7, 11, 15};
		int target = 9;
		for (int i = 0; i < arrInt.length; i++) {
			for (int j = 0; j < arrInt.length; j++) {
				if(arrInt[i] + arrInt[j] == target) {
					System.out.print(i + " ");
				}				
			}
			
		}
	}
}