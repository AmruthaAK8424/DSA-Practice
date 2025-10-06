import java.util.*;

class Solution {
    public static int largestElement(int[]  nums) {
        // Sort array
        Arrays.sort(nums);

        /*Largest element will be at 
        the last index of the array.*/
        int largest = nums[nums.length - 1];

        //Return the largest element in array.
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};

        //Make an intance of the Solution class
        Solution sol = new Solution();

        int largest = sol.largestElement(nums);

        // Print the largest element.
        System.out.print(largest );
    }
}