public class centeredaverage {
	public static void main(String[] args) {

		//Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

		int[] nums = { 1, 1, 5, 5, 10, 8, 7 };

		int sum = 0;
		int min = nums[0];
		int max = nums[0];

		for (int x : nums) {

		
			sum += x;
			min = Math.min(min, x);
			max = Math.max(max, x);
		}

		sum = sum - max - min;
	
		sum = sum / (nums.length - 2);
	
	}
}
