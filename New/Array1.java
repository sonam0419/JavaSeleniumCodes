package New;

public class Array1 {
	public static void main(String[] args) {
		int[] nums = {1, 11, 32, 12, 9};
		int min = nums[0];
		int max = nums[0];
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
			else if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		System.out.println("Minimum number is: " +min);
		System.out.println("Maximum number is: " +max);
	}

}
