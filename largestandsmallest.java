public class largestandsmallest {
	public static void main(String[] args) {
		int nums[] = { 10, 3, 5, 6 };
		int min = nums[0];
		int max = nums[0];
		int difference = 0;
		for (int i = 0; i < nums.length-1; i++) {
		
		min=	Math.min(min, nums[i + 1]);
		max = Math.max(max, nums[i + 1]);
		difference = max - min;
		}
System.out.println(difference);
	}
	
}