import javax.lang.model.element.Element;

public class ArraysExercise {
	public static void main(String[] args) {
		//float[] marks = { 45.27f, 67.8f, 63.4f, 99.2f, 100.00f };
		//float sum = 0;
		//for (float element : marks) {
		//	sum += element;
		//}

		//System.out.println(sum);

		//float[] marks = { 45.27f, 67.8f, 63.4f, 99.2f, 100.00f };
		//float num = 45.27f;
		//boolean isAnArray = false;
		//for (float element : marks) {
		//	if (num == element) {
		//		isAnArray = true;
		//		break;
		//	}
		//}

		//if (isAnArray) {
		//	System.out.println("Present");
		//}
		//else {
		//System.out.println("Not present in array");
		//}
		// float[] marks = { 45.27f, 67.8f, 63.4f, 99.2f, 100.00f };
		// float sum = 0;
		// for (float element : marks) {
		// sum += element;
		// }

		// System.out.println(sum/marks.length);

		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] mat2 = { { 2, 6, 13 }, { 3, 7, 1 } };
		int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };
	
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				//System.out.format("i=%d and j=%d\n", i, j);
			
				result[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(result[i][j] + " ");
			}
		System.out.println("");
		}
	
	}
}
