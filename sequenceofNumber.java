public class sequenceofNumber {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 1, 2, 5 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				if (nums[i + 1] == 2) {
					if (nums[i + 2] == 3) {
						System.out.println(true);
					}
				}
			}

		}

	}
}
