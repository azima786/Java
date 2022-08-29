public class numberof9 {
	public static void main(String[] args) {
		int[] nums = { 1, 9, 9, 3, 9 };
		int length = nums.length;
		if (length > 3) {
		length=3;
		}
		for (int i = 0; i < length; i++) {
			if (nums[i] == 9) {
				System.out.println(true);
			}
			
		}

	}
}
	


