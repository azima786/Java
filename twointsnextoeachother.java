public class twointsnextoeachother {
	public static void main(String[] args) {
		int arr[] = { 6, 6, 2, 6 };
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 6) {
				if ((arr[i + 1] == 6) || (arr[i + 1] == 7)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
