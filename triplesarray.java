public class triplesarray {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
		boolean isBoolean = true;
		int size = nums.length - 1;
		if (size <= 2) {
			System.out.println(true);
		} else {
			for (int i = 0; i < size; i++) {
				if (nums[i] == nums[i + 1]) {
					if (nums[i + 1] == nums[i + 2]) {
						isBoolean = false;
					}

				}
			}
		}
		System.out.println(isBoolean);
	}
}
