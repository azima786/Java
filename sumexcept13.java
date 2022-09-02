public class sumexcept13 {
	public static void main(String[] args) {
		// Return the sum of the numbers in the array, returning 0 for an empty array.
		// Except the number 13 is very unlucky, so it does not count and numbers that
		// come immediately after a 13 also do not count.

		int nums[] = { 2,1,1, 2, 1, 13 };

		int sum = 0;
	
		for (int i=0;i<nums.length;i++) {
			if (nums.length <= 0) {
				System.out.println(0);
			}
			if(nums[i]!=13){
				sum+=nums[i];
			}

			else  {
				sum += nums[i];
				sum  -=nums[i]+nums[i+1];
			}

			
				
		}System.out.println(sum);
	}
}
//Need to figure out more
